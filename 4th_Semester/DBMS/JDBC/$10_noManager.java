// 10. Query to display Name and Job of all employees who don't have a current Manager.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $10_noManager {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Job_type"
                    + " FROM EMPLOYEE"
                    + " WHERE Manager IS NULL;";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employees without manager:\n");
            while (rs.next()) {
                System.out.println("Name: " + rs.getString("Job_type"));
                System.out.println("Job: " + rs.getString("Job_type"));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
