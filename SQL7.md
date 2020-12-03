```mysql
[vchintapally@yboledge02 ~]$ mysql -u pktrainee -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 708
Server version: 8.0.21 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use dbo;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A

Database changed

mysql> select name,fathername,dob from tblemployees where employeenumber in (select employeenumber from tblemployees where presentbasic>30000 or  presentbasic<3000 or presentbasic bet
ween 3000 and 5000);
+-------------------------+-----------------------+---------------------+--------------+
| name                    | fathername            | dob                 | presentbasic |
+-------------------------+-----------------------+---------------------+--------------+
| ABDUL RAHEEM            | S/O ABDUL MAJEED      | 1950-01-20 00:00:00 |      4218.00 |
| CH.GANGARAM             | S/O CHANDRAIAH        | 1955-01-19 00:00:00 |      4411.00 |
| IQBAL AHMED             | S/O AHMED RASOOL      | 1958-06-10 00:00:00 |         0.00 |
| YOUSUF PASHA            | S/O SHAIK ABDULLAH    | 1961-01-01 00:00:00 |         0.00 |
| N.RAMESH                | S/O VENKATAIAH        | 1960-01-01 00:00:00 |         0.00 |
| SABIR KHAN              | S/O GHOUSE KHAN       | 1953-01-01 00:00:00 |         0.00 |
| SHAIK MOHD MANSOOR      | SHAIK ABDUL JABBAR    | 1958-03-06 00:00:00 |      3391.00 |
| S GANGADHAR             | S/O DEVAIAH           | 1958-04-06 00:00:00 |      3441.00 |
| K.PEDDA GANGADHAR       | S/O NADPI GANGARAM    | 1948-09-10 00:00:00 |      3313.00 |
| P.SATYANARAYANA         | S/O PADMA SAYANNA     | 1955-06-07 00:00:00 |      3966.00 |
| K.LAXMAN                | S/O RAMULU            | 1949-11-07 00:00:00 |      2560.00 |
| M.SATYANARAYANA         | S/O M.LAXMI RAJAM     | 1963-01-01 00:00:00 |      2773.00 |
| A.LAXMI NARAYANA        | S/O A NARAYANA        | 1961-01-01 00:00:00 |      3017.00 |
| A.GANGADHAR             | S/O. A SANTAIAH       | 1956-01-01 00:00:00 |      2135.00 |
|
|
|
| SHAIK. MOHAMMED         | NULL                  | NULL                |      4479.00 |
| MD.ATEEQ-UR-RAHMAN      | S/O YUSUF-UR-RAHMAN   | 1957-07-01 00:00:00 |      4588.00 |
| J.VISHNUDAS             | S/O GANGARAM          | 1971-05-07 00:00:00 |      4588.00 |
| SD.KHAJA MOINODDIN      | S/O SAYYED ZIYAUDDIN  | 1972-06-16 00:00:00 |      4641.00 |
| S.RAVINDER              | S/O NARSAIAH          | 1972-03-04 00:00:00 |      4705.00 |
| M.PRASAD                | S/O BHUMESHWAR        | 1970-04-14 00:00:00 |      4711.00 |
| KYADARI DAYANAND        | S/O K.NARAYANA        | 1970-07-10 00:00:00 |      4711.00 |
| MOHD.RAHMATH ALI        | S/O MOHD ALI          | 1971-08-25 00:00:00 |      4775.00 |
| MOHD.ABDUL FAHEEM       | M.A AZEEZ             | 1957-03-05 00:00:00 |      4778.00 |
| SHAKEELULLAH HUSSAIN    | S/O.SYED KHALEELULAH  | 1976-05-21 00:00:00 |      4888.00 |
| K.GANGA RAJAM           | S/O K.MALLAIAH        | 1964-11-14 00:00:00 |      4968.00 |
| K.GANGA RAJAM           | S/O K.MALLAIAH        | 1964-11-14 00:00:00 |      4968.00 |
+-------------------------+-----------------------+---------------------+--------------+
2199 rows in set (0.02 sec)

mysql> select name from tblemployees where name in (select name from tblemployees where name like '%khan' or name like 'chandra%' or name like 'a.ramesh%' or name like 'b.ramesh%' or name like 'c.ramesh%
' or name like 'd.ramesh%' or name like 'e.ramesh%' or name like 'f.ramesh%' or name like 'g.ramesh%' or name like 'h.ramesh%' or name like 'i.ramesh%' or name like 'j.ramesh%' or name like 'k.ramesh%' o
r name like 'l.ramesh%' or name like 'm.ramesh%' or name like 'n.ramesh%' or name like 'o.ramesh%' or name like 'p.ramesh%' or name like 'q.ramesh%' or name like 'r.ramesh%' or name like 's.ramesh%' or name like 't.ramesh%');
+----------------------+
| name                 |
+----------------------+
| MUJIB KHAN           |
| N.RAMESH             |
| SABIR KHAN           |
| AKTHAR KHAN          |
| T.RAMESH             |
| MUJIB KHAN           |
| N.RAMESH             |
| SABIR KHAN           |
| AKTHAR KHAN          |
| T.RAMESH             |
| A.RAMESH             |
| CHANDRAKALA AGNOOR   |
| KHATUNBEE KHAN       |
| CHANDRAKALA KARANKOT |
| CHANDRAKALA MANCHI   |
| CHANDRAKALA GANURE   |
| HAYATH KHAN          |
| CHANDRABHAGE.M       |
| S.RAMESH             |
| MD.SAJEED KHAN       |
|
|
|
| D.RAMESH             |
| TAJAMMUL KHAN        |
| A.RAMESH             |
| MOHD SHAKEEL KHAN    |
| R.RAMESH             |
| MD.IBRAHIM KHAN      |
| G.RAMESH             |
| ASLAM KHAN           |
| N.RAMESH             |
| N.RAMESH             |
| G.RAMESH             |
+----------------------+
57 rows in set (0.01 sec)

mysql> select centrecode from (select max(length(name))=2 * min(length(name)) as answer,centrecode from tblemployees group by centrecode) as a where a.answer=1;                       +------------+
| centrecode |
+------------+
|         29 |
+------------+
1 row in set (0.01 sec)

mysql> select distinct(departmentcode) from tblemployees where departmentcode not in(select departmentcode from tblemployees where presentbasic like '%00.00' order by departmentcode);

+----------------+
| departmentcode |
+----------------+
|              1 |
|              4 |
+----------------+
2 rows in set (0.00 sec)

mysql> select departmentcode,presentbasic from tblemployees where departmentcode not in(select departmentcode from tblemployees where presentbasic not like '%00.00');
Empty set (0.01 sec)

mysql> select * from (select rank() over (order by presentbasic desc)my_rank, name,presentbasic from tblemployees)as c where c.my_rank<10;
+---------+---------------------+--------------+
| my_rank | name                | presentbasic |
+---------+---------------------+--------------+
|       1 | M.A.GHANI           |     19885.00 |
|       2 | ABDUL MUNEER        |     17290.00 |
|       3 | M.LAKSHMANA CHARY   |     10900.00 |
|       4 | MUJIB KHAN          |     10741.00 |
|       4 | MUJIB KHAN          |     10741.00 |
|       6 | SHAKEEL ABDUL MALIK |      9212.00 |
|       7 | MOHAMMED ARIFUDDIN  |      8923.00 |
|       8 | AIJAZ WASEEM        |      8280.00 |
|       8 | AIJAZ WASEEM        |      8280.00 |
|       8 | AIJAZ WASEEM        |      8280.00 |
+---------+---------------------+--------------+
10 rows in set (0.01 sec)




