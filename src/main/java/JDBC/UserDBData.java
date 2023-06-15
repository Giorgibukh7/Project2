package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDBData {

    public static String firstName;
    public static String lastName;
    public static String phoneNumber;
    public static String email;
    public static String dateOfBirth;
    public static String userPassword;
    public static String query = "select * from users";


    public UserDBData(Connection connection,int UserIndexStartsFrom1){

        try(Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(query)) {

            for(int counter = 0;counter < UserIndexStartsFrom1 ;counter++) {
                rs.next();
            }
            firstName = rs.getString("firstName");
            lastName = rs.getString("lastName");
            phoneNumber = rs.getString("phone");
            email = rs.getString("email");
            dateOfBirth = rs.getString("dateOfBirth");
            userPassword = rs.getString("password");

    }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
