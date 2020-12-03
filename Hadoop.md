 ```mobaxterm
 
  01/12/2020   16:16.24   /home/mobaxterm  ssh 10.1.1.27
Warning: Permanently added '10.1.1.27' (RSA) to the list of known hosts.
X11 forwarding request failed on channel 0
Last login: Tue Dec  1 11:57:42 2020 from 10.1.10.15

[vchintapally@yboledge02 ~]$ pwd
/home/vchintapally

[vchintapally@yboledge02 ~]$ hadoop fs -ls

[vchintapally@yboledge02 ~]$ hadoop fs -ls /user
Found 100 items
drwxr-xr-x   - aadarsh               aadarsh                        0 2019-11-11 10:02 /user/aadarsh
drwxr-xr-x   - admin                 admin                          0 2017-10-10 01:49 /user/admin
drwxr-xr-x   - ajain1                ajain1                         0 2020-12-01 16:02 /user/ajain1
drwxr-xr-x   - amal                  amal                           0 2018-09-05 05:23 /user/amal
drwxr-xr-x   - ankireddy             ankireddy                      0 2020-09-15 12:17 /user/ankireddy
|
|
|
drwxr-xr-x   - vchintapally          vchintapally                   0 2020-11-27 15:28 /user/vchintapally
drwxrwxrwx   - vinayak               supergroup                     0 2018-02-14 09:39 /user/vinayak
drwxr-xr-x   - virashree             virashree                      0 2019-05-24 12:34 /user/virashree
drwxr-xr-x   - ybapp                 ybapp                          0 2019-12-12 01:57 /user/ybapp
drwxr-xr-x   - ybkr                  ybkr                           0 2018-05-03 17:14 /user/ybkr
drwxr-xr-x   - yesh                  yesh                           0 2020-09-03 15:17 /user/yesh

[vchintapally@yboledge02 ~]$ hadoop fs -mkdir /user/vchintapally/sample
[vchintapally@yboledge02 ~]$ hadoop fs -ls
Found 1 items
drwxr-xr-x   - vchintapally vchintapally          0 2020-12-01 16:26 sample

[vchintapally@yboledge02 ~]$ hadoop fs -copyFromLocal first.txt /user/vchintapally/sample

[vchintapally@yboledge02 ~]$ hadoop fs -ls /user/vchintapally/sample
Found 1 items
-rw-r--r--   3 vchintapally vchintapally       5709 2020-12-01 16:38 /user/vchintapally/sample/first.txt

[vchintapally@yboledge02 ~]$ hadoop fs -touchz local.txt

[vchintapally@yboledge02 ~]$ hadoop fs -ls /user/vchintapally/
Found 2 items
-rw-r--r--   3 vchintapally vchintapally          0 2020-12-01 16:42 /user/vchintapally/local.txt
drwxr-xr-x   - vchintapally vchintapally          0 2020-12-01 16:38 /user/vchintapally/sample

[vchintapally@yboledge02 ~]$ hadoop fs -copyToLocal /user/vchintapally/local.txt .
[vchintapally@yboledge02 ~]$ ls -l
total 16
-rw-r--r-- 1 vchintapally hadoop-trainee    0 Oct 29 17:43 dev
-rw-r--r-- 1 vchintapally hadoop-trainee 5709 Dec  1 12:01 first.txt
-rw-r--r-- 1 vchintapally hadoop-trainee    0 Dec  1 16:45 local.txt
-rw-r--r-- 1 vchintapally hadoop-trainee 5709 Oct 29 11:23 second.txt
drwxr-xr-x 2 vchintapally hadoop-trainee    6 Dec  1 16:36 test
