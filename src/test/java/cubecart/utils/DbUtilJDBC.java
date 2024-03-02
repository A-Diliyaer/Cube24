package cubecart.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : alfir
 * @created : 3/2/2024,8:32 AM
 **/
public class DbUtilJDBC {
    //Create a method to connect to MySQL and MSSQL database server

    public Connection connectToDB(String dbUrl, String dbPort, String username, String password, String defaultDB,
                                  ConnectionType connectionType) {
        String JTDS_Driver = "net.source.jtds.jdbc.Driver"; // for MSSQL
        String MYSQL_Driver = "com.mysql.cj.jdbc.Driver"; //  for MYSQL
        Connection connection = null;
        switch (connectionType) {
            case MYSQL:
                try {
                    Class.forName(MYSQL_Driver);
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
                String mySQLConnectionPath = "jdbc:mysql://" + dbUrl + ":" + dbPort + "/" + defaultDB + "?useSSL=false";
                try {
                    connection = DriverManager.getConnection(mySQLConnectionPath, username, password);
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                try {
                    if (!connection.isClosed()) {
                        System.out.println("Database connection is establish successfully!");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                break;
                    case MSSQL:
                        try {
                            Class.forName(JTDS_Driver);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        String connectionPath = "jdbc:jtds:sqlserver://" + dbUrl + ":" + dbPort + ";dataBaseName=" + defaultDB;
                        try {
                            connection = DriverManager.getConnection(connectionPath, username, password);
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                        break;
                }
                return connection;
        }
        public void closeDBConnection (Connection connection){
            try {
                if (connection.isClosed()) {
                    System.out.println("Database connection is closed!");
                } else {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
