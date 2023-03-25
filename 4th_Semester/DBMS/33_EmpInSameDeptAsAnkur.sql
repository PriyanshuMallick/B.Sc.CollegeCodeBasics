-- 33. Query to display Name and Hire Date for all employees in the same dept. as Ankur.

SELECT Ename, Hire_date
FROM EMPLOYEE
WHERE Dno = (
    SELECT Dno
    FROM EMPLOYEE
    WHERE Ename LIKE "Ankur%"
);