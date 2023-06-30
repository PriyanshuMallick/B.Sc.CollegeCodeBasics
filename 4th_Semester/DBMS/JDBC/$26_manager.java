import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $26_manager {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = """
-- Query to display Name and Employee no. Along with their Manger's Name and the Manager's employee no; along with the Employees Name who do not have a manager.

SELECT e1.Ename, e1.Eno, COALESCE(e2.Ename, \"No Manager\") AS \"Manager Name\", COALESCE(e2.Eno, \"No Manager\") AS \"Manager's Employee No.\"
FROM EMPLOYEE e1
LEFT JOIN EMPLOYEE e2 ON e1.Manager = e2.Eno
ORDER BY e1.Eno;
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
