// 15. Query to display Name, Salary and Commission for all employees whose Commission 
//     Amount is 14 greater than their Salary increased by 5%

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $15_salary14TimesCommission {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Salary, Commission"
                    + " FROM EMPLOYEE"
                    + " WHERE Commission = (Salary * 1.05) + 14;";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Employees whose Commission Amount is 14 greater than their Salary increased by 5%:");
            while (rs.next()) {
                String Ename = rs.getString("Ename");
                double Salary = rs.getDouble("Salary");
                double Commission = rs.getDouble("Commission");
                System.out.println(Ename);
                System.out.println(Salary);
                System.out.println(Commission);
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
