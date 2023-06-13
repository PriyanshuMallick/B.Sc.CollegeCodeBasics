// 19. Query to display the following for each employee <E-Name> earns < Salary> 
//     monthly but wants < 3 * Current Salary >. Label the Column as Dream Salary.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $19_dreamSalary {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Salary,  3 * Salary as 'Dream Salary'"
                    + "FROM EMPLOYEE";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Unique Jobs Are:");
            while (rs.next()) {
                String eName = rs.getString("Ename");
                Double salary = rs.getDouble("Salary");
                Double dreamSalary = rs.getDouble("Dream Salary");
                System.out.println(eName + " earns " + salary + " monthly but wants " + dreamSalary);
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
