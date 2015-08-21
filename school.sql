/*

SQL code for the school database

*/
CREATE DATABASE school;

USE school;

CREATE TABLE students (
  id INT auto_increment,
  name VARCHAR(40),
  pass VARCHAR(100),
  primary key(id)
);

INSERT INTO students (name,pass) values ('Foo', PASSWORD('Bar'));
