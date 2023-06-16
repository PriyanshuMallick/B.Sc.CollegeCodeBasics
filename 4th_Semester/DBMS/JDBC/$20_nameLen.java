// 20.  Query to display Name with the 1st letter capitalized and all other letter lower case 
//      and length of their name of all the employees whose name starts with 'J', 'A' and 'M'

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $20_nameLen {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {

            String sql = "SELECT Ename"
                    + " FROM EMPLOYEE"
                    + " WHERE UPPER(SUBSTRING(Ename, 1, 1)) IN ('J', 'A', 'M')";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employee Names:");
            while (rs.next()) {
                String eName = rs.getString("Ename");
                System.out.println(
                        "Name: " + eName.substring(0, 1).toUpperCase()
                                + eName.substring(1).toLowerCase());
                System.out.println("Lenght: " + eName.length());
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
