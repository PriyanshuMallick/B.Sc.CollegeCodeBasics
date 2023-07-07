import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $27_empDeptMatch.sql {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = """
-- Query to display Name, Dept No. And Salary of any employee whose department No. and salary matches both the department no. And the salary of any employee who earns a commission.

SELECT e.Ename, e.Dno, e.Salary
FROM EMPLOYEE e
WHERE e.Dno IN (
    SELECT Dno FROM EMPLOYEE WHERE Commission IS NOT NULL
) AND e.Salary IN (
    SELECT Salary FROM EMPLOYEE WHERE Commission IS NOT NULL
);""";

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
