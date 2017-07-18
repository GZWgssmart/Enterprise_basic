CREATE DATABASE IF NOT EXISTS enterprise_basic DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use enterprise_basic;

DROP TABLE IF EXISTS t_admin;
CREATE TABLE t_admin(
  id INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
  name varchar(30) NOT NULL COMMENT '管理员姓名',
  password varchar(50) NOT NULL COMMENT '管理员密码'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

INSERT INTO `t_admin` VALUES ('1', 'admin', '6khXbzC+FmmXFpnAmtBclA==');

DROP TABLE IF EXISTS t_news;
CREATE TABLE t_news(
  id INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号',
  title varchar(50) NOT NULL COMMENT '新闻标题',
  abstracts VARCHAR(200) NOT NULL COMMENT '摘要',
  content TEXT NOT NULL COMMENT '新闻详情',
  image varchar(500) NOT NULL COMMENT '新闻图片',
  created_time datetime NOT NULL COMMENT '发布时间'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS t_case;
CREATE TABLE t_case(
  id INT PRIMARY KEY AUTO_INCREMENT COMMENT '编号 ',
  name varchar(100) NOT NULL COMMENT '案例名称',
  customer varchar(100) NOT NULL COMMENT '客户名称',
  content TEXT NOT NULL COMMENT '案例详情',
  image varchar(500) NOT NULL COMMENT '案例图片',
  created_time datetime NOT NULL COMMENT '发布时间'
) ENGINE = InnoDB DEFAULT CHARSET = utf8;