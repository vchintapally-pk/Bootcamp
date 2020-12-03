```mysql

[vchintapally@yboledge02 ~]$ mysql -u pktrainee -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 603
Server version: 8.0.21 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> use dbo;
Reading table information for completion of table and column names
You can turn off this feature to get a quicker startup with -A


mysql> select name from tblemployees where name like '%suresh%' union select name from tblemployees where name like '%sures%' union select name from tblemployees where name like '%sure%'union select name from tblemployees where name like '%sur%'union select name from tblemployees where name like '%su%'union select
name from tblemployees where name like '%s%' ;
+-------------------------+
| name                    |
+-------------------------+
| A.SURESH                |
| SURESH BANSODE          |
| S.SURESH                |
| G.SURESH                |
| SUREKHA CHAUDEKAR       |
| AMBIKA SURE             |
| C.SURENDHAR             |
| SUREKHA DEVALE          |
| M.SUREKHA               |
| S.SURENDER              |
| SURYAKANT PADMUKHE      |
| V.ANASURYA              |
| SUNANDA SURA            |
| SURVARNA DIKONDA        |
| PRABHAVATI SURRAM       |
| KASTURI SURAM           |
| SURAIYYA SHAIKH         |
| ANUSURIYA KUCHAN        |
| SAVITHA SURA            |
| YOUSUF PASHA            |
| S.SUDARSHAN             |
| C.SUNANDA               |
| P.SUNITA                |
| SULOCHANA BUSSA         |
|
|
|
| SK.BURHAN               |
| G.SAYANNA               |
| M.VENKATASWAMY          |
| A.SHIVA PRASAD          |
| M.POSHETTY              |
| U.SANTHOSH              |
| CH.BHUMESHWER           |
| G.POSHALU               |
| V.SRIDHAR               |
| CH.VENKATESHAM          |
| S.RAJASHEKHAR           |
| A.SANJEEV               |
| M.SAYANNA               |
| M.GNANESHWAR            |
| A.SATHYARANAYANA        |
| S.MUTHANNA              |
| K.ASHOK                 |
| SK.AHMED HUSSAIN        |
| VISHWANATH              |
| S.RAJENDER              |
| SK.SHADULLA             |
+-------------------------+
1077 rows in set (0.03 sec)

mysql> select concat(rtrim(name),'INDIAN') as Indian from tblemployees where name between 'a%' and 'm%' union  select concat(rtrim(name),'AMERICAN') as Americ
an from tblemployees
+---------------------------------+
| Indian                          |
+---------------------------------+
| ABDUL RAHEEMINDIAN              |
| CH.GANGARAMINDIAN               |
| IQBAL AHMEDINDIAN               |
| AIJAZ WASEEMINDIAN              |
| K.PEDDA GANGADHARINDIAN         |
| C.NARSAIAHINDIAN                |
| K.LAXMANINDIAN                  |
| A.LAXMI NARAYANAINDIAN          |
| A.GANGADHARINDIAN               |
| K.NAGABHUSHANAMINDIAN           |
| B.PURSHOTHAMINDIAN              |
| AKTHAR KHANINDIAN               |
| K.GANGA RAJAMINDIAN             |
| A.RAJAMOULIINDIAN               |
| G.MADHUINDIAN                   |
| A.NANDAIAHINDIAN                |
| CH.GANGADHARINDIAN              |
| A.CHANDARIAHINDIAN              |
| E.RAJAGANGA RAMINDIAN           |
| K.DAMODHARINDIAN                |
| B.DAMODHARINDIAN                |
| D.BALAIAHINDIAN                 |
| LALITHA DONNALINDIAN            |
| ESHWARAVVAINDIAN                |
| LALITHA TUMMAINDIAN             |
|
|
|
| V.NIRANJAN RAJAMERICAN          |
| N.RAJESHWERAMERICAN             |
| V.MADHUKAR REDDYAMERICAN        |
| P.SHIVA PRASADAMERICAN          |
| SK.BURHANAMERICAN               |
| P.DEVANANDAMERICAN              |
| U.SANTHOSHAMERICAN              |
| U.BHUMANNAAMERICAN              |
| V.SRIDHARAMERICAN               |
| S.RAJASHEKHARAMERICAN           |
| SUBANAMERICAN                   |
| S.MUTHANNAAMERICAN              |
| P.MADHUKARAMERICAN              |
| SK.AHMED HUSSAINAMERICAN        |
| VISHWANATHAMERICAN              |
| V.RAJUAMERICAN                  |
| P.MAHENDERAMERICAN              |
| SK.SUBHAN ALIAMERICAN           |
| S.RAJENDERAMERICAN              |
| SK.SHADULLAAMERICAN             |
+---------------------------------+
1782 rows in set (0.01 sec)

mysql> select name,length(name) from tblemployees order by length(name) desc limit 1;
+-------------------------+--------------+
| name                    | length(name) |
+-------------------------+--------------+
| VADLA KONDA ASHOK KUMAR |           23 |
+-------------------------+--------------+
1 row in set (0.00 sec)

mysql> select name from tblemployees where LEFT(name,1)=LEFT(reverse(name),1);
+-------------------+
| name              |
+-------------------+
| A. NARAYANA       |
| S.SRINIVAS        |
| M.PEDDA GANGARAM  |
| MD.IBRAHIM        |
| MOHD ABDUL KALEEM |
+-------------------+
5 rows in set (0.00 sec)

mysql> select name from tblemployees where SUBSTRING(name,1,1)=SUBSTRING((name),2,1);
+----------------------+
| name                 |
+----------------------+
| AADAM BALMANI        |
| AASMA MUJAWAR        |
| 00                   |
| 00                   |
| 00                   |
+----------------------+
5 rows in set (0.01 sec)

mysql> select name from tblemployees where SUBSTRING(name,1,1)=SUBSTRING((name),3,1) and name like '%.%';
+----------------------+
| name                 |
+----------------------+
| S.SUDARSHAN          |
| P.PRAKASH            |
| A.ANURADHA           |
| P.PADMA              |
| T.TILAK RAJ          |
| S.SUDARSHAN          |
| P.PRAKASH            |
| A.ANURADHA           |
| P.PADMA              |
| T.TILAK RAJ          |
| G.GANGADHAR          |
| S.SUDARSHAN          |
| S.SUNITHA            |
| S.SHAMSHAAD          |
| N.NEELAMMA           |
| C.CHANDRAKALA        |
| S.SUMAN              |
| R.RAJESHWAR          |
| M.MINAKSHI           |
| S.SHARADA YESHWANTH  |
| M.MADHUSUDHAN        |
| M.MALLESH            |
| G.GANGASHANKER       |
| S.SURENDER           |
| B.BHUMAIAH           |
| S.SURESH             |
| D.DATHADRI           |
| S.SAYANNA            |
| S.SRINIVAS           |
| R.RAMAKRISHNA        |
| R.RAJA REDDY         |
| S.SURESH             |
| A.ASHOK              |
| R.RAMESH             |
| S.SRINIVAS           |
| M.MURALI             |
+----------------------+
36 rows in set (0.00 sec)

mysql> select max(grosspay) as maximum_salary,min(grosspay) as minimum_salary from tblpayemployees;
+----------------+----------------+
| maximum_salary | minimum_salary |
+----------------+----------------+
|       30352.00 |           0.00 |
+----------------+----------------+
1 row in set (0.02 sec)

mysql> select max(netpay) as maximum_salary,min(netpay) as minimum_salary from tblpayemployees;
+----------------+----------------+
| maximum_salary | minimum_salary |
+----------------+----------------+
|       30352.00 |           0.00 |
+----------------+----------------+
1 row in set (0.02 sec)

