package cubecart.utils;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class DbUtilMysql {

   public static Connection connection;

    public static void connectToDB(){
        String databaseUrl = ConfigReader.getProperty("databaseUrl");
        String databasePort = ConfigReader.getProperty("databasePort");
        String databaseUsername = ConfigReader.getProperty("databaseUsername");
        String databasePassword = ConfigReader.getProperty("databasePassword");
        String databaseSchema = ConfigReader.getProperty("databaseSchema");

        String MYSQL_Driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(MYSQL_Driver);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        String mySQLConnectionPath = "jdbc:mysql://" + databaseUrl + ":" + databasePort + "/" + databaseSchema + "?useSSL=false";

        try {
           connection = DriverManager.getConnection(mySQLConnectionPath,databaseUsername,databasePassword);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            if (!connection.isClosed()){
                System.out.println("Database connection is established successfully!");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean getProductInfo(String productName) {
        boolean isProductExist = false;
        Statement statement = null;
        ResultSet resultSet = null;
        CachedRowSet cachedRowSet = null;
        try {
            cachedRowSet = RowSetProvider.newFactory().createCachedRowSet();
            statement = connection.createStatement();
        } catch (SQLException s) {
            s.printStackTrace();
        }
        String sqlScript = String.format
                ("select product_id, name, price from cc_CubeCart_inventory where name='%s'", productName);
        try {
            resultSet = statement.executeQuery(sqlScript);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        if (resultSet == null) {
            System.out.println("No records found!");
        } else {
            try {
                cachedRowSet.populate(resultSet);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

            int rowCount = 0;
            String name = null;
            try {
                while (cachedRowSet.next()) {
                    int productId = cachedRowSet.getInt("product_id");
                    name = cachedRowSet.getString("name");
                    double price = cachedRowSet.getDouble("price");
                    System.out.println(String.format("product_id=%d name=%s price=%.2f", productId, name, price));
                    rowCount = cachedRowSet.getRow();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            if (rowCount >= 1 && name.equalsIgnoreCase(productName)) {
                isProductExist = true;
            }
        }
        return isProductExist;
    }

    @AfterClass
    public static void closeDBConnection(){
        try {
            if (connection.isClosed()){
                System.out.println("Database connection is closed!");
            }
            else {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
