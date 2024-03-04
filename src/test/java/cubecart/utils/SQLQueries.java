package cubecart.utils;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author : alfir
 * @created : 3/3/2024,2:43 PM
 **/
public class SQLQueries {
    public boolean getProductInfo(String productName, Connection connection) {
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
}
