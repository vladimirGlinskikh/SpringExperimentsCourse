DROP DATABASE IF EXISTS my_db;
CREATE DATABASE IF NOT EXISTS my_db;
USE my_db;

CREATE TABLE employees
(
    id         int NOT NULL AUTO_INCREMENT,
    name       VARCHAR(15),
    surname    VARCHAR(25),
    department VARCHAR(20),
    salary     int,
    PRIMARY KEY (id)
);

SHOW TABLES;
