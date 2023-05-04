// 3. Query to display the Employee Name concatenated by a Job separated by a comma.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $03_nameJob {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT"
                    + " CONCAT(Ename, ', ', Job_type)"
                    + " AS 'Employee & Job'"
                    + " FROM EMPLOYEE;";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employee & Job");
            while (rs.next()) {
                System.out.println(rs.getString("Employee & Job"));
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
