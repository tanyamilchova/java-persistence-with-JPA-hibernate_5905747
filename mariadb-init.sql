-- Create a database
DROP DATABASE IF EXISTS artclass;
CREATE DATABASE IF NOT EXISTS artclass;
-- Use the database
USE artclass;
-- Crate tables in the database
CREATE TABLE IF NOT EXISTS student(
  book_id INT AUTO_INCREMENT PRIMARY KEY,
  book_name VARCHAR(255),
  isbn VARCHAR(255)
);
CREATE TABLE IF NOT EXISTS author(
  author_id INT AUTO_INCREMENT PRIMARY KEY,
  author_name VARCHAR(255)
);