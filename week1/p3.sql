CREATE DATABASE CompanyDB;

USE CompanyDB;

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(30),
    salary DECIMAL(10,2)
);

INSERT INTO Employee VALUES
(101,'Ashi','HR',35000),
(102,'Aman','IT',50000),
(103,'Archi','Finance',45000);

CREATE PROCEDURE GetEmployee(IN p_emp_id INT)
BEGIN
    SELECT * FROM Employee
    WHERE emp_id = p_emp_id;
END //

DELIMITER ;

CALL GetEmployee(102);