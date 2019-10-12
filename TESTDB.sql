create database TESTDB;
use TESTDB;

create table t_subject(
subId int auto_increment primary key,
SubjectDescription varchar (30),
SubjectTime varchar(20)
);

create table t_teacher(
teacherId int auto_increment primary key,
Fname varchar (30),
Lname varchar (30),
DOB varchar (20),
EType varchar (10),
subjectID int,
FOREIGN KEY (subjectID) REFERENCES t_subject(subId)
);

create table t_student(
studId int auto_increment primary key,
FirstName varchar(30),
LastName varchar(30),
TeacherId int,
SubjId int,
MiddleName varchar(20),
DOB varchar(20),
contact int,
course varchar(10),
address varchar(50),
gender char(2),
FOREIGN KEY (TeacherId) REFERENCES t_teacher(teacherId),
FOREIGN KEY (SubjId) REFERENCES t_subject(subId)
);

create table t_user(
UserId int auto_increment primary key,
UserName varchar(20),
Pass varchar(20),
StudId int,
FOREIGN KEY (StudId) REFERENCES t_student(studId)
);