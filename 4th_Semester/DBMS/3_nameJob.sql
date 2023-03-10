-- 3. Query to display the Employee Name concatenated by a Job separated by a comma

SELECT CONCAT(Ename, ', ', Job_type) AS 'Employee & Job' FROM EMPLOYEE;