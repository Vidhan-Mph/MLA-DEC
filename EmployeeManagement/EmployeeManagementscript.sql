create database  if not exists Employee_db;
use Employee_db;
create table employees(
eid Int UNSIGNED  PRIMARY KEY auto_increment,
ename varchar(100) not null,
salary decimal(10,2) not null check(salary>=0),
location varchar(100) null,
designation varchar(100) not null,
INDEX idx_ename(ename),
Index idx_designation(designation));

INSERT INTO employees (ename, salary, location, designation) VALUES
  ('Aarav Sharma',   75000.00, 'Bangalore', 'Software Engineer'),
  ('Isha Gupta',     90000.00, 'Pune',       'Senior Developer'),
  ('Rahul Menon',    65000.00, 'Hyderabad',  'QA Engineer'),
  ('Neha Reddy',     82000.00, 'Bangalore',  'Business Analyst'),
  ('Vikram Singh',  120000.00, 'Mumbai',     'Tech Lead');


