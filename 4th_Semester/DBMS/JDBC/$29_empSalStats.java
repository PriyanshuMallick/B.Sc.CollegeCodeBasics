import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $29_empSalStats {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = """
-- Query to display the Highest, Lowest, Sum and Average Salaries of all the employees

SELECT MAX(Salary) AS \"Highest Salary\",
       MIN(Salary) AS \"Lowest Salary\",
       SUM(Salary) AS \"Total Salary\",
       AVG(Salary) AS \"Average Salary\"
FROM EMPLOYEE;
""";

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
