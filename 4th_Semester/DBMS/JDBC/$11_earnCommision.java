// 11. Query to display the Name, Salary and Commission for all the employees who earn commission.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $11_earnCommision {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Commission, Salary"
                    + "FROM EMPLOYEE"
                    + "WHERE Commission IS NOT NULL";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employees who earn commission:");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Ename"));
                System.out.println("Salary: " + rs.getString("Salary"));
                System.out.println("Commission: " + rs.getString("Commission"));
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
