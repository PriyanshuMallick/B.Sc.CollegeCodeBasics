-- 4. Query to display all the data from the Employee Table. Separate each Column by a 
-- comma and name the said column as THE_OUTPUT

SELECT CONCAT_WS(', ', Eno, Ename, Job_type, Manager, Hire_date, Dno, Commission, Salary)
AS THE_OUTPUT FROM EMPLOYEE;
