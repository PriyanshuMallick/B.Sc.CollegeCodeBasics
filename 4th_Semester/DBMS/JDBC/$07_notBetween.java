// 7. Query to display Employee Name and Salary for all employees whose salary is not in the range of $1500 and $2850.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $07_notBetween {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Salary"
                    + " FROM EMPLOYEE"
                    + " WHERE salary NOT BETWEEN 1500 AND 2850";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employees whose salary is not in the range of $1500 and $2850:");
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
