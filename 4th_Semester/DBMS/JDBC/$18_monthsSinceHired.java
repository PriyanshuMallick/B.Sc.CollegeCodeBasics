// 18. Query to display Name and calculate the number of months between today and the date each employee was hired

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $18_monthsSinceHired {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename,"
                    + "TIMESTAMPDIFF(MONTH, Hire_date, CURDATE()) AS 'Months Since Hired'"
                    + "FROM Employee";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Months Since Employee Was Hired:");
            while (rs.next()) {
                String eName = rs.getString("Ename");
                String monthsSinceHired = rs.getString("Months Since Hired");
                System.out.println("Employee Name: " + eName);
                System.out.println("Months Since Hired:" + monthsSinceHired);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
