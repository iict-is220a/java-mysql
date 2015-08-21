# Java + MySQL
Included in this repository is the exercise source code for connecting your Java application with MySQL.

##Preparing the Development Environment
Before we start, be sure that you have a JDK (Java Development Kit), MySQL connector for Java (JDBC) which can be downloaded [here](http://dev.mysql.com/downloads/connector/j/) and  MySQL database management system installed on your workstation.You can also use NetBeans IDE for your convenience.

##Database Setup
This exercise will require you to connect your Java application on a remote database which is hosted from your teacher's workstation.

If you want to create your own locally-hosted database, please refer to these instructions:
* Login to your local MySQL server.
```bash
mysql -uroot -p<your password> -h127.0.0.1
```
* Create the school database.
```sql
CREATE DATABASE school;
```
* Set your default database.
```sql
USE school;
```
* Create the students table.
```sql
CREATE TABLE students (
  id INT auto_increment,
  name VARCHAR(40),
  pass VARCHAR(100),
  primary key(id)
);
```
* Populate your students table by inserting dummy entries. Encrypt the password using MySQL's PASSWORD() function.
```sql
INSERT INTO students (name,pass) values ('Foo', PASSWORD('Bar'));
```
##Getting the Source Code
[Download this repository](https://github.com/iict-is220a/java-mysql/archive/master.zip) and modify the code to suit your needs.
