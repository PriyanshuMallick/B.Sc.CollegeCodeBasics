import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $1_viewEmployeeDetails {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (
                Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT"
                    + " Eno, Ename, Job_type, Hire_date"
                    + " From EMPLOYEE"
                    + " ORDER BY Eno;";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println("Employee ID: " + rs.getInt("Eno"));
                System.out.println("Employee Name: " + rs.getString("Ename"));
                System.out.println("Job Type: " + rs.getString("Job_type"));
                System.out.println("Hire Date: " + rs.getDate("Hire_date"));
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
