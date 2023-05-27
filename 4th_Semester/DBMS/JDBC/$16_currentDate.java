// 16. Query to display the Current Date

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $16_currentDate {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT CURDATE()";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Current Date:");
            while (rs.next()) {
                String CURDATE = rs.getString("CURDATE()");
                System.out.println(CURDATE);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
