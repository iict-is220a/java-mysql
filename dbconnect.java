/***
This code sample is a modification of the original source code
taken from http://www.luv2code.com/2014/08/31/java-netbeans-tutorial-connecting-to-a-mysql-database-with-jdbc-and-netbeans/

You can email your teacher if you have questions.
***/

import java.sql.*;

public class dbconnect {

    public static void main(String[] args) throws SQLException {

        //Initialize your variables here

        Connection con = null;
        Statement statement_0 = null;
        ResultSet resultSet_0 = null;

        String host = "127.0.0.1";
        String user = "root";
        String pass = "students";
        String database = "school";

        try {
            // Establish a connection to your database
            String conString = "jdbc:mysql://"+host+":3306/"+database;
            con = DriverManager.getConnection(conString, user, pass);

            // Create a statement object
            statement_0 = con.createStatement();

            // Execute a statement and store it in resultSet_0
            Sting queryString_0 = "SELECT * FROM students"
            resultSet_0 = statement_0.executeQuery(queryString_0);

            // Print the result
            while (resultSet_0.next()) {
                System.out.println(resultSet_0.getString("name"));
            }

        } catch (Exception e) {

            e.printStackTrace();

        } finally {
            if (resultSet_0 != null) {
                resultSet_0.close();
            }

            if (statement_0 != null) {
                statement_0.close();
            }

            if (con != null) {
                con.close();
            }
        }
    }

}
