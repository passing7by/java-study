-- Active: 1749604230285@@127.0.0.1@3306@library_project
CREATE DATABASE library_project;
USE library_project;
SELECT DATABASE();

CREATE TABLE book (
  isbn CHAR(13),
  type VARCHAR(50),
  price INTEGER,
  PRIMARY KEY (isbn)
);

INSERT INTO book (isbn, type, price)
VALUES ("2234567891234", "시", 10000);

SELECT * FROM book;