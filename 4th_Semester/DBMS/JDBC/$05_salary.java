// 5. Query to display the Employee Name and Salary of all the employees earning more than $2850.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $05_salary {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Salary"
                    + " FROM EMPLOYEE"
                    + " WHERE Salary > 2850";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employees:\n");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Ename"));
                System.out.println("Salary: " + rs.getString("Salary"));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
