CREATE DATABASE Products;
USE Products;

SHOW DATABASES;

USE Products;

CREATE TABLE Product_detail (
    Product_id INT PRIMARY KEY AUTO_INCREMENT,
    Product_name VARCHAR(100) NOT NULL,
    description TEXT,
    variation VARCHAR(50)
);

CREATE TABLE units_of_measure (
    id INT AUTO_INCREMENT PRIMARY KEY,
    unit_of_measure VARCHAR(50) NOT NULL,
    price DECIMAL(10, 2) NOT NULL
);

SELECT 
    pd.Product_id,
    pd.Product_name,
    pd.description,
    pd.variation,
    uom.unit_of_measure,
    uom.price
FROM 
    Product_detail pd
LEFT JOIN 
    units_of_measure uom ON pd.Product_id = uom.id;

SELECT 
    pd.Product_id,
    pd.Product_name,
    pd.description,
    pd.variation,
    uom.unit_of_measure,
    uom.price
FROM 
    Product_detail pd
RIGHT JOIN 
    units_of_measure uom ON pd.Product_id = uom.id;
    
  SELECT 
    pd.Product_id,
    pd.Product_name,
    pd.description,
    pd.variation,
    uom.unit_of_measure,
    uom.price
FROM 
    Product_detail pd
LEFT JOIN 
    units_of_measure uom ON pd.Product_id = uom.id;
    
    SELECT 
    pd.Product_id,
    pd.Product_name,
    pd.description,
    pd.variation,
    uom.unit_of_measure,
    uom.price
FROM 
    Product_detail pd
RIGHT JOIN 
    units_of_measure uom ON pd.Product_id = uom.id;
    
   SELECT
    pd.Product_id,
    pd.Product_name,
    COUNT(uom.id) AS uom_count,
    SUM(uom.price) AS uom_sum_price,
    MIN(uom.price) AS uom_min_price,
    MAX(uom.price) AS uom_max_price,
    AVG(uom.price) AS uom_avg_price
FROM
    Product_detail pd
LEFT JOIN
    units_of_measure uom ON pd.Product_id = uom.id
GROUP BY
    pd.Product_id, pd.Product_name;

SELECT 
    Product_name,
    COUNT(variation) AS variation_count
FROM 
    Product_detail
GROUP BY 
    Product_name;

CREATE DATABASE  Employee
USE  Employee

Drop table employee

CREATE TABLE Employee (
    Employee_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE,
    phone_number VARCHAR(20),
    hire_date DATE,
    job_title VARCHAR(100),
    department VARCHAR(100),
    salary DECIMAL(10, 2),
    manager_id INT,
    city VARCHAR(50),
    CONSTRAINT fk_manager_id FOREIGN KEY (manager_id) REFERENCES employee(employee_id)
);

SELECT department, COUNT(*) AS num_employees
FROM Employee
GROUP BY department;


SELECT city, COUNT(*) AS num_employees
FROM employee
GROUP BY city;

INSERT INTO employee (first_name, last_name, email, phone_number, hire_date, job_title, department, salary, manager_id, city)
VALUES 
    ('John', 'Doe', 'john.doe@example.com', '123-456-7890', '2023-01-15', 'Manager', 'Sales', 80000.00, NULL, 'New York'),
    ('Jane', 'Smith', 'jane.smith@example.com', '987-654-3210', '2022-05-20', 'Engineer', 'Engineering', 70000.00, 1, 'Los Angeles'),
    ('Michael', 'Johnson', 'michael.johnson@example.com', '456-789-0123', '2023-03-10', 'Analyst', 'Finance', 60000.00, 1, 'Chicago'),
    ('Emily', 'Brown', 'emily.brown@example.com', '789-012-3456', '2022-11-30', 'Developer', 'Engineering', 75000.00, 2, 'Los Angeles'),
    ('David', 'Lee', 'david.lee@example.com', '234-567-8901', '2023-02-28', 'Designer', 'Design', 65000.00, 2, 'San Francisco');

SELECT * FROM Employee GROUP BY city;

SELECT city, COUNT(*) AS num_employees
FROM employee
GROUP BY city;

SELECT 
    city,
    COUNT(*) AS num_employees,
    AVG(salary) AS avg_salary
FROM 
    employee
GROUP BY 
    city
HAVING 
    COUNT(*) > 1;

