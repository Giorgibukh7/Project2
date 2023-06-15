package JDBC;


import java.sql.*;
import java.util.ArrayList;

public class InsertUserIntoDB {


    public InsertUserIntoDB(Connection connection, ArrayList<String> UserDetails) {

        String query = "insert into users values (?,?,?,?,?,?);";
        try (

            PreparedStatement pstmt = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            for(int i=0;i < 6;i++){
                pstmt.setString(i+1, UserDetails.get(i));
            }

            pstmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
