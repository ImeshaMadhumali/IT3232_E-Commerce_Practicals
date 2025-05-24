MariaDB [(none)]> use hrm;
Database changed
MariaDB [hrm]> show tables;
Empty set (0.014 sec)

MariaDB [hrm]> show tables;
Empty set (0.009 sec)

MariaDB [hrm]> show tables;
+------------------+
| Tables_in_hrm    |
+------------------+
| canteen          |
| daily_menu       |
| employee         |
| employee_canteen |
| food             |
| food_order       |
| menu_food        |
| order_line       |
| student          |
+------------------+
9 rows in set (0.004 sec)


MariaDB [hrm]> desc canteen;
+----------+--------------+------+-----+---------+-------+
| Field    | Type         | Null | Key | Default | Extra |
+----------+--------------+------+-----+---------+-------+
| id       | bigint(20)   | NO   | PRI | NULL    |       |
| location | varchar(255) | YES  |     | NULL    |       |
+----------+--------------+------+-----+---------+-------+
2 rows in set (0.217 sec)

MariaDB [hrm]> desc daily_menu;
+------------+------------+------+-----+---------+-------+
| Field      | Type       | Null | Key | Default | Extra |
+------------+------------+------+-----+---------+-------+
| date       | date       | YES  |     | NULL    |       |
| canteen_id | bigint(20) | YES  | MUL | NULL    |       |
| id         | bigint(20) | NO   | PRI | NULL    |       |
+------------+------------+------+-----+---------+-------+
3 rows in set (0.020 sec)

MariaDB [hrm]> desc employee;
+--------------+--------------+------+-----+---------+-------+
| Field        | Type         | Null | Key | Default | Extra |
+--------------+--------------+------+-----+---------+-------+
| age          | int(11)      | NO   |     | NULL    |       |
| id           | bigint(20)   | NO   | PRI | NULL    |       |
| gender       | varchar(255) | YES  |     | NULL    |       |
| job_position | varchar(255) | YES  |     | NULL    |       |
| name         | varchar(255) | YES  |     | NULL    |       |
+--------------+--------------+------+-----+---------+-------+
5 rows in set (0.024 sec)

MariaDB [hrm]> desc food;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| price  | double       | NO   |     | NULL    |       |
| weight | double       | NO   |     | NULL    |       |
| id     | bigint(20)   | NO   | PRI | NULL    |       |
| name   | varchar(255) | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
4 rows in set (0.029 sec)

MariaDB [hrm]> desc food_order;
+------------+-------------+------+-----+---------+-------+
| Field      | Type        | Null | Key | Default | Extra |
+------------+-------------+------+-----+---------+-------+
| id         | bigint(20)  | NO   | PRI | NULL    |       |
| order_date | datetime(6) | YES  |     | NULL    |       |
| student_id | bigint(20)  | YES  | MUL | NULL    |       |
+------------+-------------+------+-----+---------+-------+
3 rows in set (0.020 sec)

MariaDB [hrm]> desc employee_canteen;
+-------------+------------+------+-----+---------+-------+
| Field       | Type       | Null | Key | Default | Extra |
+-------------+------------+------+-----+---------+-------+
| canteen_id  | bigint(20) | NO   | MUL | NULL    |       |
| employee_id | bigint(20) | NO   | MUL | NULL    |       |
+-------------+------------+------+-----+---------+-------+
2 rows in set (0.027 sec)

MariaDB [hrm]> desc menu_food;
+---------+------------+------+-----+---------+-------+
| Field   | Type       | Null | Key | Default | Extra |
+---------+------------+------+-----+---------+-------+
| food_id | bigint(20) | NO   | MUL | NULL    |       |
| menu_id | bigint(20) | NO   | MUL | NULL    |       |
+---------+------------+------+-----+---------+-------+
2 rows in set (0.029 sec)

MariaDB [hrm]> desc order_line;
+----------+------------+------+-----+---------+-------+
| Field    | Type       | Null | Key | Default | Extra |
+----------+------------+------+-----+---------+-------+
| quantity | int(11)    | NO   |     | NULL    |       |
| food_id  | bigint(20) | YES  | MUL | NULL    |       |
| id       | bigint(20) | NO   | PRI | NULL    |       |
| order_id | bigint(20) | YES  | MUL | NULL    |       |
+----------+------------+------+-----+---------+-------+
4 rows in set (0.018 sec)

MariaDB [hrm]> desc student;
+--------+--------------+------+-----+---------+-------+
| Field  | Type         | Null | Key | Default | Extra |
+--------+--------------+------+-----+---------+-------+
| age    | int(11)      | NO   |     | NULL    |       |
| id     | bigint(20)   | NO   | PRI | NULL    |       |
| degree | varchar(255) | YES  |     | NULL    |       |
| gender | varchar(255) | YES  |     | NULL    |       |
| name   | varchar(255) | YES  |     | NULL    |       |
+--------+--------------+------+-----+---------+-------+
5 rows in set (0.027 sec)

MariaDB [hrm]>