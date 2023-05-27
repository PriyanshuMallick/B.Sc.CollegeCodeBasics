// 17. Query to display Name, Hire Date and Salary Review Date which is the 1st Monday after six months of employment.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $17_6month {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Hire_date, Salary,"
                    + " FROM EMPLOYEE"
                    + " DATE_ADD(DATE_ADD(Hire_date, INTERVAL 6 MONTH),"
                    + " INTERVAL (CASE WHEN DAYOFWEEK(DATE_ADD(Hire_date, INTERVAL 6 MONTH)) = 1 THEN 1"
                    + " WHEN DAYOFWEEK(DATE_ADD(Hire_date, INTERVAL 6 MONTH)) = 7 THEN 2"
                    + " ELSE 8 - DAYOFWEEK(DATE_ADD(Hire_date, INTERVAL 6 MONTH)) END) DAY) AS 'Salary Review Date'";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Unique Jobs Are:");
            while (rs.next()) {
                String Job_type = rs.getString("Job_type");
                System.out.println(Job_type);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
