import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $32_DeptLocSalary {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = """
-- 32. Query to display the Department Name, Location Name,
-- No. of Employees and the average salary for all employees in that department.

SELECT d.Dname, d.Location, COUNT(e.Eno) AS \"No. of Employees\", AVG(e.Salary) AS \"Avg Salary\"
FROM EMPLOYEE e
LEFT JOIN DEPARTMENT d ON e.Dno = d.Dno
GROUP BY d.Dname, d.Location;""";

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
