-- Query to display the Highest, Lowest, Sum and Average Salaries of all the employees

SELECT MAX(Salary) AS "Highest Salary",
       MIN(Salary) AS "Lowest Salary",
       SUM(Salary) AS "Total Salary",
       AVG(Salary) AS "Average Salary"
FROM EMPLOYEE;
