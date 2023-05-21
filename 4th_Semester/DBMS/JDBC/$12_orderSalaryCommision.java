// 12. Sort the data in descending order of Salary and Commission

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $12_orderSalaryCommision {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT * FROM EMPLOYEE"
                    + " ORDER BY Salary DESC, Commission DESC;";

            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("Data in descending order of Salary and Commission:");
            while (rs.next()) {
                String Eno = rs.getString("Eno");
                String Ename = rs.getString("Ename");
                String Job_type = rs.getString("Job_type");
                String Manager = rs.getString("Manager");
                Date Hire_date = rs.getDate("Hire_date");
                int Dno = rs.getInt("Dno");
                Double Commission = rs.getDouble("Commission");
                Double Salary = rs.getDouble("Salary");

                System.out.println("Eno: " + Eno);
                System.out.println("Ename: " + Ename);
                System.out.println("Job_type: " + Job_type);
                System.out.println("Manager: " + Manager);
                System.out.println("Hire_date: " + Hire_date);
                System.out.println("Dno: " + Dno);
                System.out.println("Commission: " + Commission);
                System.out.println("Salary: " + Salary);
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
