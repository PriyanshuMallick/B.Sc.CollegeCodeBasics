// Create and use the following database schemas to answer the given queries.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class $00_CreateDBSchema {
    public static void main(String[] args) {
        String DB_URL = "jdbc:mysql://localhost:3306/";
        String USER = "root";
        String PASS = "";
        String DB_NAME = "BSC_Practicals_JDBC";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to the database!");

            // Creating DB if it doesn't already exist
            Statement stmt = conn.createStatement();
            String sql = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;

            stmt.executeUpdate(sql);

            // Use the database
            sql = "USE " + DB_NAME;
            stmt.executeUpdate(sql);

            // Create the EMPLOYEE table
            sql = "CREATE TABLE IF NOT EXISTS EMPLOYEE ("
                    + "Eno CHAR(3) NOT NULL PRIMARY KEY,"
                    + "Ename VARCHAR(50) NOT NULL,"
                    + "Job_type VARCHAR(50) NOT NULL,"
                    + "Manager CHAR(3),"
                    + "Hire_date DATE NOT NULL,"
                    + "Dno INTEGER,"
                    + "Commission DECIMAL(10, 2),"
                    + "Salary DECIMAL(7, 2) NOT NULL"
                    + ")";
            stmt.executeUpdate(sql);

            // Create the DEPARTMENT table
            sql = "CREATE TABLE IF NOT EXISTS DEPARTMENT ("
                    + "Dno INTEGER NOT NULL PRIMARY KEY,"
                    + "Dname VARCHAR(50),"
                    + "Location VARCHAR(50) DEFAULT 'New Delhi'"
                    + ")";
            stmt.executeUpdate(sql);

            // Adding Foreign Key constraint to EMPLOYEE table
            sql = "ALTER TABLE EMPLOYEE"
                    + " ADD CONSTRAINT fk_employee_department FOREIGN KEY (Dno) REFERENCES DEPARTMENT(Dno),"
                    + " ADD CONSTRAINT fk_employee_manager FOREIGN KEY (Manager) REFERENCES EMPLOYEE(Eno)";
            stmt.executeUpdate(sql);

            System.out.println("Database schema created successfully.");
        } catch (SQLException e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }
}