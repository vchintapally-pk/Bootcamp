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
mysql> show tables;
+----------------------------+
| Tables_in_dbo              |
+----------------------------+
| course_data_external       |
| examschedule               |
| tblcentremaster            |
| tbldesignations            |
| tblemployees               |
| tblemployeetypes           |
| tbllocations               |
| tblpayemployeeparamdetails |
| tblpayemployees            |
| tblpaymaster               |
| tblservicestatus           |
| tblservicetypes            |
| tblstatemaster             |
+----------------------------+
13 rows in set (0.00 sec)

mysql> select name from tblemployees where name not like '%.%' and name not like '%0%';
+-------------------------+
| name                    |
+-------------------------+
| MUJIB KHAN              |
| ABDUL RAHEEM            |
| IQBAL AHMED             |
| YOUSUF PASHA            |
| SABIR KHAN              |
| AIJAZ WASEEM            |
| SHAKEEL ABDUL MALIK     |
| SHAIK MOHD MANSOOR      |
|
|
|
| MIRZA TANVEER BAIG      |
| Temp                    |
| Temp                    |
| ABDUL RASHEED           |
| ABDUL RAHEEM            |
| SUBAN                   |
| VISHWANATH              |
| ABDUL MUNEER            |
+-------------------------+
1389 rows in set (0.01 sec)

mysql> select name from tblemployees where name like '%.%.%';
+----------------------+
| name                 |
+----------------------+
| M.A.WAHEED           |
| M.A.WAHEED           |
| K.P.RAJENDER         |
| K.O.LAKHSMI          |
| M.A.WAHEED           |
| M.A.KALEEMUDDIN      |
| S.K.AHMED            |
| S.D.SAJEED           |
| V.K.PRABAKAR         |
| S.K.SALEEM           |
| V.K.RAJU             |
| M.D.AFSAR            |
| M.A.MAQBOOL          |
| M.A.KALEEM           |
| K.P.GANESH           |
| M.A.KAREEM           |
| M.A.HAFEEZ           |
| M.A.GHANI            |
| M.A.NAVEED           |
| M.A.AZHAR            |
| P.B.MOTEWAR          |
| M.A.HAKEEM           |
| M.A.MAJEED           |
+----------------------+
23 rows in set (0.01 sec)

mysql> select name from tblemployees where name like '% ram %' or name like '%.ram %' or name like '% ram';
+----------------------+
| name                 |
+----------------------+
| E.RAJAGANGA RAM      |
| E.RAJAGANGA RAM      |
| J.GANGA RAM          |
| M.RAM BAI            |
| AKULA RAM MOHAN      |
+----------------------+
5 rows in set (0.00 sec)


mysql> select * from tblemployeetypes;
+--------------+-------------+
| EmployeeType | Description |
+--------------+-------------+
|            1 | REGULAR     |
|            2 | TRANSPORT   |
|            3 | SECURITY    |
+--------------+-------------+
3 rows in set (0.00 sec)

select employeenumber from tblemployees where employeenumber%10 in (2,4,8);
+----------------+
| employeenumber |
+----------------+
|             64 |
|             84 |
|             88 |
|           1664 |
|           1702 |
|           1708 |
|           1712 |
|           1754 |
|           1762 |
|           1784 |
|           1838 |
|           1882 |
|           3592 |
|           3662 |
|           4732 |
|           4738 |
|
|
|
|         337002 |
|         337004 |
|         337008 |
|         337012 |
|         337014 |
|         337118 |
|         337122 |
|         337124 |
|         337128 |
|         337132 |
|         337134 |
|         337138 |
|         337142 |
|         337144 |
|         337158 |
|         337162 |
|         337164 |
|         337244 |
+----------------+
671 rows in set (0.00 sec)

select name,servicetype from tblemployees where centrecode=21 order by servicetype ;
+----------------------+-------------+
| name                 | servicetype |
+----------------------+-------------+
| MUJIB KHAN           |           1 |
| K.BUCHI RAJAM        |           1 |
| RAGOLA MALLAIAH      |           1 |
| KARINGALA GANGADHAR  |           1 |
| MUJIB KHAN           |           1 |
| N.RAMESH             |           1 |
| K.CHANDRAMOULI       |           1 |
| MOTHUNUR SRINIVAS    |           1 |
| GODAPUR SANDEEP      |           3 |
| RACHAKONDA NIRANJAN  |           3 |
| D.MAHENDHAR          |           3 |
| N.RAMU               |           3 |
| MOHD.AHAD            |           3 |
| GOUSE KHAN           |           3 |
| MOHD.ADILUDDIN       |           3 |
| AKKAPALLY.USHANNA    |           3 |
| B.RAJESHWAR          |           3 |
| AKULA RAM MOHAN      |           3 |
| PUDURI RAVI          |           3 |
| K.RAJENDHAR          |           3 |
| B.RAJESHWER          |           3 |
| D.GANGADHAR          |           3 |
| D.MAHENDER           |           3 |
| G.RAMESH             |           3 |
| ALLADI VENU          |           3 |
| AKKAPALLY ASHANNA    |           3 |
| ABDUL RAZZAQ         |           3 |
| SHAIK WAHEED         |           3 |
| A.GANGARAM           |           3 |
| MD.UMAR              |           3 |
| MOHD.GOUSE           |           3 |
| S.K.SALEEM           |           3 |
| ANKAM RAMESH         |           3 |
| SATLA BOJANNA        |           3 |
| SHAIK IQBAL          |           3 |
| ARE POTHANNA         |           3 |
| S.NANDA KISHORE      |           3 |
| SK.BURHAN            |           4 |
| SK.SUBHAN ALI        |           4 |
| CHITYALA GANGANNA    |           4 |
| BOGA RAVI            |           4 |
| CHILVERI MUTHANNA    |           4 |
| DASARI PRAVEEN       |           4 |
| SHAIK JAMAL          |           4 |
| G.PURUSHOTHAM        |           4 |
| B.NARSINGA RAO       |           4 |
| S.DHARMAIAH          |           4 |
| SK.GOREMIYA          |           4 |
| DYAGA SWAMY          |           4 |
| S.SURENDER           |           4 |
| S.JANARDHAN          |           4 |
| MOHD.NIZAMUDDIN      |           4 |
+----------------------+-------------+
52 rows in set (0.00 sec)

