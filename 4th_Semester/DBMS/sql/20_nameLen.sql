-- 20.  Query to display Name with the 1st letter capitalized and all other letter lower case 
-- and length of their name of all the employees whose name starts with 'J', 'A' and 'M'

SELECT CONCAT(UCASE(SUBSTRING(Ename, 1, 1)), LCASE(SUBSTRING(Ename, 2))) AS Name,
       LENGTH(Ename) AS Name_Length
FROM EMPLOYEE
WHERE UPPER(SUBSTRING(Ename, 1, 1)) IN ('J', 'A', 'M');
