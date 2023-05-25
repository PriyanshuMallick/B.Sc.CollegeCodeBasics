// 14. Query to display Name of all employees either have two 'R's or have two 'A's in 
// their name and are either in Dept No = 5 or their Manger‘s Employee No = 001.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $14_2RorA {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename"
                    + " FROM EMPLOYEE"
                    + " WHERE (UPPER(Ename) LIKE '%A%A%'"
                    + " OR UPPER(Ename) LIKE '%R%R%')"
                    + " AND (Dno = 5 OR Manager = 001);";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println(
                    "Name of all employees either have two 'R's\n"
                            + "or have two 'A's in their name and are either in Dept No = 5\n"
                            + "or their Manger‘s Employee No = 001:\n");
            while (rs.next()) {
                String Ename = rs.getString("Ename");
                System.out.println(Ename);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
