```mysql

[vchintapally@yboledge02 ~]$ mysql -u pktrainee -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 499
Server version: 8.0.21 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> show databases;
+-----------------------+
| Database              |
+-----------------------+
| classicmodels         |
| dbo                   |
| information_schema    |
| mysql                 |
| performance_schema    |
| skalidindiSqlPractice |
| sviswanath            |
| sys                   |
| test                  |
| test_trainee          |
| university            |
| vchintapally          |
| ybtrainee             |
+-----------------------+
13 rows in set (0.01 sec)

mysql> use dbo;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed

mysql> select date_format(CURDATE(),"%y-%m-%d") as Date_Time_Formats union select date_format(CURDATE(),"%Y-%M-%D") union select date_format(CURTIME(),"%W %D
%M %Y %l:%i:%s:%p");
+---------------------------------------+
| Date_Time_Formats                     |
+---------------------------------------+
| 20-11-20                              |
| 2020-November-20th                    |
| Friday 20th November 2020 11:27:46:AM |
+---------------------------------------+
3 rows in set (0.00 sec)

mysql> select name,presentbasic from tblemployees where presentbasic like '%00.00';
+----------------------+--------------+
| name                 | presentbasic |
+----------------------+--------------+
| MOHAMMED SALEEM      |      2400.00 |
| ALUVALA HANMANDLU    |      4100.00 |
| NALLA RAMCHANDER     |      2400.00 |
| S.D.SAJEED           |      2800.00 |
| BILAL NIBALKAR       |      2000.00 |
| G.KISHORE            |      1500.00 |
| M.LAKSHMANA CHARY    |     10900.00 |
+----------------------+--------------+
7 rows in set (0.00 sec)

mysql> select name,length(name),length(ltrim(name)),length(rtrim(name)) from tblemployees where length(name)!=length(ltrim(name)) or length(name)!=length(rtrim(name));
+----------------------+--------------+---------------------+---------------------+
| name                 | length(name) | length(ltrim(name)) | length(rtrim(name)) |
+----------------------+--------------+---------------------+---------------------+
| ABDUL RAHEEM         |           20 |                  20 |                  12 |
| CH.GANGARAM          |           20 |                  20 |                  11 |
| IQBAL AHMED          |           20 |                  20 |                  11 |
| YOUSUF PASHA         |           20 |                  20 |                  12 |
| N.RAMESH             |           20 |                  20 |                   8 |
| SABIR KHAN           |           20 |                  20 |                  10 |
| MOHD.ALEEMUDDIN      |           20 |                  20 |                  15 |
| AIJAZ WASEEM         |           20 |                  20 |                  12 |
| SHAKEEL ABDUL MALIK  |           20 |                  20 |                  19 |
| SHAIK MOHD MANSOOR   |           20 |                  20 |                  18 |
| S GANGADHAR          |           20 |                  20 |                  11 |
| K.PEDDA GANGADHAR    |           20 |                  20 |                  17 |
| P.SATYANARAYANA      |           20 |                  20 |                  15 |
| C.NARSAIAH           |           20 |                  20 |                  10 |
| K.LAXMAN             |           20 |                  20 |                   8 |
|
|
|
| P.MADHUKAR           |           20 |                  20 |                  10 |
| K.ASHOK              |           20 |                  20 |                   7 |
| SK.AHMED HUSSAIN     |           20 |                  20 |                  16 |
| G.RAMESH             |           20 |                  20 |                   8 |
| VISHWANATH           |           20 |                  20 |                  10 |
| V.RAJU               |           20 |                  20 |                   6 |
| P.MAHENDER           |           20 |                  20 |                  10 |
| T.GANGADHAR          |           20 |                  20 |                  11 |
| SK.SUBHAN ALI        |           20 |                  20 |                  13 |
| S.RAJENDER           |           20 |                  20 |                  10 |
| V.RAMESH             |           20 |                  20 |                   8 |
| A.MARUTHI            |           20 |                  20 |                   9 |
| SK.SHADULLA          |           20 |                  20 |                  11 |
| M.MURALI             |           20 |                  20 |                   8 |
+----------------------+--------------+---------------------+---------------------+
2066 rows in set (0.01 sec)

mysql> use vchintapally;

mysql> show tables;
Empty set (0.01 sec)

mysql> create view employee as select * from dbo.tblemployees;
Query OK, 0 rows affected (0.03 sec)

mysql> select count(*) from employee;
+----------+
| count(*) |
+----------+
|     2307 |
+----------+
1 row in set (0.01 sec)

mysql> update employee set name=rtrim(name) where length(name)!=length(rtrim(name));
Query OK, 0 rows affected (0.01 sec)
Rows matched: 0  Changed: 0  Warnings: 0

-- The tblemployee was updated by some user centrally hence no rows were update in the created view;

mysql> update employee set name=ltrim(name) where length(name)!=length(ltrim(name));
Query OK, 0 rows affected (0.01 sec)
Rows matched: 0  Changed: 0  Warnings: 0

-- The tblemployee was updated by some user centrally hence no rows were update in the created view;


mysql> select distinct(employeenumber),name from tblemployees where employeenumber in (select a.employeenumber from tblpayemployeeparamdetails a inner join tblpayemployeeparamdetails b on a.employeenumber=b.employeenumber where a.paramcode='vda' and b.paramcode!='pf');
+----------------+-------------------------+
| employeenumber | name                    |
+----------------+-------------------------+
|             19 | MUJIB KHAN              |
|             37 | ABDUL RAHEEM            |
|             47 | MOHD.GHOUSE             |
|             49 | CH.GANGARAM             |
|             64 | IQBAL AHMED             |
|             80 | YOUSUF PASHA            |
|             84 | N.RAMESH                |
|             88 | SABIR KHAN              |
|           1708 | SHAIK MOHD MANSOOR      |
|           1712 | S GANGADHAR             |
|           1715 | P.SATYANARAYANA         |
|
|
|
|         337158 | G.RAMESH                |
|         337159 | VISHWANATH              |
|         337160 | V.RAJU                  |
|         337161 | P.MAHENDER              |
|         337163 | SK.SUBHAN ALI           |
|         337243 | A.MARUTHI               |
|         337244 | SK.SHADULLA             |
|         337245 | M.MURALI                |
|         337246 | ABDUL MUNEER            |
+----------------+-------------------------+
1925 rows in set (0.28 sec)

mysql> select distinct(employeenumber),name from tblemployees where employeenumber in (select a.employeenumber from tblpayemployeeparamdetails a inner join tblpayemployeeparamdetails b on a.employeenumber=b.employeenumber where a.paramcode='vda' and b.paramcode='pf');
+----------------+----------------------+
| employeenumber | name                 |
+----------------+----------------------+
|             19 | MUJIB KHAN           |
|             37 | ABDUL RAHEEM         |
|             47 | MOHD.GHOUSE          |
|             49 | CH.GANGARAM          |
|             64 | IQBAL AHMED          |
|             80 | YOUSUF PASHA         |
|             84 | N.RAMESH             |
|             88 | SABIR KHAN           |
|           1708 | SHAIK MOHD MANSOOR   |
|
|
|
|          73264 | A.BUCHANNA           |
|          73265 | T.POSHANNA           |
|          73409 | MA.MUQEED            |
|          73410 | MOHD.MUNEER          |
|          73411 | AZAR KHAN            |
|          73415 | SYED HAMEED          |
|          73416 | R.NARSAIAH           |
|          73422 | B.RAJESHWAR          |
|          73482 | AKULA RAM MOHAN      |
|          73486 | G.ANANDAM            |
|          73487 | V.RAMDAS             |
+----------------+----------------------+
1680 rows in set (0.13 sec)

mysql> select name from tblemployees where substring(name,1,1)=substring(name,-1,1) and length(name)>2;
+--------------------+
| name               |
+--------------------+
| A.LAXMI NARAYANA   |
| LALITHA DONNAL     |
| A.ANURADHA         |
| A.LAXMI NARAYANA   |
| LALITHA DONNAL     |
| A.ANURADHA         |
| A.SAROJA           |
| AMBUBAI SAKA       |
| MOHAMMED SALEEM    |
|
|
|
| MOHD ABDUL KALEEM  |
| MD.SALEEM          |
| M.A.HAKEEM         |
| M.VENKATESHAM      |
| MD.SALEEM          |
| S.SRINIVAS         |
| A.LINGANNA         |
| A.SATHYARANAYANA   |
| K.ASHOK            |
+--------------------+
99 rows in set (0.01 sec)

