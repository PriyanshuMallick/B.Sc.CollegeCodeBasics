// 6. Query to display Employee Name and Department Number for the Employee No= 7900.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class $06_name {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/BSC_Practicals_JDBC";
        String USER = "root";
        String PASS = "";

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
                Statement stmt = conn.createStatement()) {
            String sql = "SELECT Ename, Dno"
                    + " FROM EMPLOYEE"
                    + " WHERE Eno = 021";

            ResultSet rs = stmt.executeQuery(sql);

            rs.next();
            System.out.println("Employee Name: " + rs.getString("Ename"));
            System.out.println("Department Number: " + rs.getInt("Dno"));
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
