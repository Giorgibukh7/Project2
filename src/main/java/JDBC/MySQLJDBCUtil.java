package JDBC;

import Data.SQLLoginData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLJDBCUtil {
    public static Connection getConnection() throws SQLException {

        Connection conn = null;

        try {
            String URL = SQLLoginData.sqlURL;
            String user = SQLLoginData.sqlUserName;
            String password = SQLLoginData.sqlPassword;

            conn = DriverManager.getConnection(URL, user, password);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
