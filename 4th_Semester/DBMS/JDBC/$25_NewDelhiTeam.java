import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $25_NewDelhiTeam {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = """
-- 25. Query to display Name, Job, Department No. And Department Name for all the employees working at the New Delhi location.

SELECT e.Ename, e.Job_type, e.Dno AS \"Department No.\", d.Dname AS \"Department Name\"
FROM EMPLOYEE e
JOIN DEPARTMENT d ON e.Dno = d.Dno
WHERE d.Location = \"New Delhi\";""";

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
