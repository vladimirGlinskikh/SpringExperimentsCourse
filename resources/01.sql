DROP DATABASE IF EXISTS my_db;
CREATE DATABASE IF NOT EXISTS my_db;
USE my_db;

CREATE TABLE details
(
    id int NOT NULL AUTO_INCREMENT,
    city VARCHAR(15),
    phone_number VARCHAR(25),
    email VARCHAR(30),
    PRIMARY KEY (id)
);

CREATE TABLE employees
(
    id         int NOT NULL AUTO_INCREMENT,
    name       VARCHAR(15),
    surname    VARCHAR(25),
    department VARCHAR(20),
    salary     int,
    details_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (details_id) REFERENCES details(id)
);

SHOW TABLES;

SELECT * FROM details;
SELECT * FROM employees;
