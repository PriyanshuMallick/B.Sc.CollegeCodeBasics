-- 13. Query to display Name of all the employees where the third letter of their name is 'A'

SELECT Ename FROM EMPLOYEE
WHERE UPPER(SUBSTR(Ename,3,1)) = 'A';