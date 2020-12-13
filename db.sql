drop database if exists emps;
create database emps;
use emps;
CREATE TABLE employee(
id INT primary key auto_increment,
empno INT,
ename VARCHAR(50),
job VARCHAR(50),
mgr INT,
hiredate DATE,
sal DOUBLE,
comm DOUBLE,
deptno INT
) ;
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7369,'SMITH','CLERK',7902,'1980-12-17',800,NULL,20);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7499,'ALLEN','SALESMAN',7698,'1981-02-20',1600,300,30);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7521,'WARD','SALESMAN',7698,'1981-02-22',1250,500,30);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7566,'JONES','MANAGER',7839,'1981-04-02',2975,NULL,20);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7654,'MARTIN','SALESMAN',7698,'1981-09-28',1250,1400,30);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7698,'BLAKE','MANAGER',7839,'1981-05-01',2850,NULL,30);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7782,'CLARK','MANAGER',7839,'1981-06-09',2450,NULL,10);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7788,'SCOTT','ANALYST',7566,'1987-04-19',3000,NULL,20);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7839,'KING','PRESIDENT',NULL,'1981-11-17',5000,NULL,10);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7844,'TURNER','SALESMAN',7698,'1981-09-08',1500,0,30);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7876,'ADAMS','CLERK',7788,'1987-05-23',1100,NULL,20);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7900,'JAMES','CLERK',7698,'1981-12-03',950,NULL,30);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7902,'FORD','ANALYST',7566,'1981-12-03',3000,NULL,20);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7934,'MILLER','CLERK',7782,'1982-01-23',1300,NULL,10);
INSERT INTO employee(empno,ename,job,mgr,hiredate,sal,comm,deptno) values(7981,'MILLER','CLERK',7788,'1992-01-23',2600,500,20);

CREATE TABLE dept(
deptno INT,
dname varchar(14),
loc varchar(13)
);
INSERT INTO dept values(10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO dept values(20, 'RESEARCH', 'DALLAS');
INSERT INTO dept values(30, 'SALES', 'CHICAGO');
INSERT INTO dept values(40, 'OPERATIONS', 'BOSTON');