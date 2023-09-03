-- Creating the Employee table
CREATE TABLE employees (
    emp_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    emp_name VARCHAR(255) NOT NULL,
    emp_dept_id INT NOT NULL,
    in_time TIME DEFAULT '09:00:00',
    out_time TIME DEFAULT '17:30:00',
    face_id VARCHAR(255) NOT NULL
);
