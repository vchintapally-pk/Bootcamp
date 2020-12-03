```mysql
[vchintapally@yboledge02 ~]$ mysql -u pktrainee -p
Enter password:
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 681
Server version: 8.0.21 MySQL Community Server - GPL

Copyright (c) 2000, 2020, Oracle and/or its affiliates. All rights reserved.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> select a.employeenumber,a.name,b.grosspay,b.row_num from tblemployees a inner join (select row_number() over(order by GrossPay desc) row_num,employeenumber,grosspay from tblpayemployees) as b on a.employeenumber=b.employeenumber where b.row_num in (1,2,3,4);
+----------------+------------------+----------+---------+
| employeenumber | name             | grosspay | row_num |
+----------------+------------------+----------+---------+
|          76236 | PITTALA LACHAIAH | 30352.00 |       1 |
|         337001 | G.ANIL KUMAR     | 28185.00 |       2 |
|         337246 | ABDUL MUNEER     | 22405.00 |       3 |
|         337246 | ABDUL MUNEER     | 22405.00 |       4 |
+----------------+------------------+----------+---------+
4 rows in set (0.05 sec)

-- If we need unique then the query below

mysql> select c.name,c.actualgrosspay from (select row_number() over(order by b.actualgrosspay desc)rownumber,(a.employeenumber),(a.name),b.actualgrosspay,b.row_num from tblemployees a inner join (select row_number() over(partition by employeenumber order by actualGrossPay desc) row_num,employeenumber,actualgrosspa
y from tblpayemployees) as b on a.employeenumber=b.employeenumber where row_num=1) as c where rownumber in (1,2,3,4);
+------------------+----------------+
| name             | actualgrosspay |
+------------------+----------------+
| PITTALA LACHAIAH |       30352.00 |
| G.ANIL KUMAR     |       28185.00 |
| ABDUL MUNEER     |       22290.00 |
| M.A.GHANI        |       19885.00 |
+------------------+----------------+
4 rows in set (0.10 sec)

mysql> select a.employeenumber,a.name,b.actualgrosspay,b.row_num from tblemployees a inner join (select row_number() over(order by actualGrossPay desc) row_num,employeen
+----------------+------------------+----------------+---------+
| employeenumber | name             | actualgrosspay | row_num |
+----------------+------------------+----------------+---------+
|          76236 | PITTALA LACHAIAH |       16128.00 |      10 |
+----------------+------------------+----------------+---------+
1 row in set (0.06 sec)

-- If we need unique then the query below

mysql> select c.name,c.actualgrosspay from (select row_number() over(order by b.actualgrosspay desc)rownumber,(a.employeenumber),(a.name),b.actualgrosspay,b.row_num from tblemployees a inner join (select row_number() over(partition by employeenumber order by actualGrossPay desc) row_num,employeenumber,actualgrosspay from tblpayemployees) as b on a.employeenumber=b.employeenumber where row_num=1) as c where rownumber=10;
+------------+----------------+
| name       | actualgrosspay |
+------------+----------------+
| MUJIB KHAN |       11565.00 |
+------------+----------------+
1 row in set (0.09 sec)

mysql> select c.name from (select name,presentbasic,row_number() over(order by presentbasic desc)row_num from tblemployees)as c where c.row_num between 8 and 15;
+----------------------+
| name                 |
+----------------------+
| AIJAZ WASEEM         |
| AIJAZ WASEEM         |
| AIJAZ WASEEM         |
| SHAKEEL ABDUL MALIK  |
| SHAKEEL ABDUL MALIK  |
| S.AZIZULLAH HUSSAINI |
| AHMED FASIUDDIN      |
| MOHD.GHOUSE          |
+----------------------+
8 rows in set (0.01 sec)

mysql> select name from tblemployees where servicetype=1 and employeetype=1 and (year(CURDATE()) -year(DOJ)>=10) and (year(retirementdate)-year(curdate()))>=15 and (year(retirementdate)-year(dob))=60 union select name from tblemployees where servicetype=1 and employeetype=2 and (year(CURDATE()) -year(DOJ)>=12) and (year(retirementdate)-year(curdate()))>=14 and (year(retirementdate)-year(dob))=55 union select name from tblemployees where servicetype=1 and employeetype=3 and (year(CURDATE()) -year(DOJ)>=12) and (year(retirementdate)-year(curdate()))>=12 and (year(retirementdate)-year(dob))=55 union select name from tblemployees where servicetype in (2,3,4) and employeetype=3 and (year(CURDATE()) -year(DOJ)>=15) and (year(retirementdate)-year(curdate()))>=20 and (year(retirementdate)-year(dob))=65;
Empty set (0.01 sec)


