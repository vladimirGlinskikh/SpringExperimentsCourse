DROP DATABASE IF EXISTS my_db;
CREATE DATABASE IF NOT EXISTS my_db;

USE my_db;

CREATE TABLE departments
(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(15),
    max_salary INT,
    min_salary INT,
    PRIMARY KEY (id)
);

CREATE TABLE employees
(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(15),
    surname VARCHAR(25),
    salary INT,
    department_id INT,
    PRIMARY KEY (id),
    FOREIGN KEY (department_id) REFERENCES departments(id)
);

SHOW TABLES;

SELECT * FROM employees;
SELECT * FROM departments;
