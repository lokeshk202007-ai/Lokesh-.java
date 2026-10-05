CREATE TABLE Students (
    student_id INT PRIMARY KEY,
    name VARCHAR(50) PRIMARY KEY,
    roll_no INT,
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100) PRIMARY KEY,
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(100)
);
