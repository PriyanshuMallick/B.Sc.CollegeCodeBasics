// 9. Query to display Name and Hire Date of every Employee who was hired in 2020.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $09_year {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Hire_date"
                    + " FROM EMPLOYEE"
                    + " WHERE YEAR(Hire_date) = 2020;";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employees hired in 2020:");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Ename"));
                System.out.println("Hire Date: " + rs.getDate("Hire_date"));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
