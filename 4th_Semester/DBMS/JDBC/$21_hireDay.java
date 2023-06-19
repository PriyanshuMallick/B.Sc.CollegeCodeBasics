import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $21_hireDay {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = """
-- 21. Query to display Name, Hire Date and Day of the week on which the employee started.

SELECT Ename, Hire_date, DAYNAME(Hire_date) AS 'Start Day'
FROM EMPLOYEE;""";

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
