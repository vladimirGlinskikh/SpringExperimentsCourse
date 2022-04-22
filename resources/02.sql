DROP DATABASE IF EXISTS my_db;
CREATE DATABASE IF NOT EXISTS my_db;

USE my_db;

CREATE TABLE children
(
    id   INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(15),
    age  INT,
    PRIMARY KEY (id)
);

CREATE TABLE section
(
    id   INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(15),
    PRIMARY KEY (id)
);

CREATE TABLE child_section
(
    child_id   INT NOT NULL,
    section_id INT NOT NULL,
    PRIMARY KEY (child_id, section_id),
    FOREIGN KEY (child_id) REFERENCES children (id),
    FOREIGN KEY (section_id) REFERENCES section (id)
);

SELECT * FROM section;
SELECT * FROM children;
SELECT * FROM child_section;