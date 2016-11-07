CREATE DATABASE demo DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

create table USR_INFO(
  id int(11) not null primary key auto_increment,
  name char(20) not null,
  password char(20) not null
);

INSERT INTO USR_INFO values(1,"张三", "111");
INSERT INTO USR_INFO values(2,"李四", "222");
INSERT INTO USR_INFO values(3,"王五", "333");