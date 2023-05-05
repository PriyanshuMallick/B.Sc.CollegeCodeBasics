// 4. Query to display all the data from the Employee Table.
// Separate each Column by a comma and name the said column as THE_OUTPUT.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $04_EmployeeDataAsOutput {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT"
                    + " Eno, Ename, Job_type, Manager, Hire_date, Dno, Commission, Salary"
                    + " FROM EMPLOYEE";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("THE_OUTPUT:");
            while (rs.next()) {
                System.out.print(rs.getInt("Eno") + ", ");
                System.out.print(rs.getString("Ename") + ", ");
                System.out.print(rs.getString("Job_type") + ", ");
                System.out.print(rs.getString("Manager") + ", ");
                System.out.print(rs.getDate("Hire_date") + ", ");
                System.out.print(rs.getInt("Dno") + ", ");
                System.out.print(rs.getFloat("Commission") + ", ");
                System.out.print(rs.getFloat("Salary"));
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
