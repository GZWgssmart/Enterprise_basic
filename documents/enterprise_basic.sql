CREATE DATABASE IF NOT EXISTS enterprise_basic DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use enterprise_basic;

DROP TABLE IF EXISTS t_admin;
CREATE TABLE t_admin(
  id varchar(36) NOT NULL COMMENT '编号',
  name varchar(100) NOT NULL COMMENT '管理员姓名',
  password varchar(500) NOT NULL COMMENT '管理员密码',
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

INSERT INTO `t_admin` VALUES ('ad5d5660-6ac5-11e7-8543-d017c205bc97', 'admin', '123456');

DROP TABLE IF EXISTS t_news;
CREATE TABLE t_news(
  id varchar(36) NOT NULL COMMENT '编号',
  title varchar(200) NOT NULL COMMENT '新闻标题',
  des varchar(1500) NOT NULL COMMENT '新闻详情',
  image varchar(500) NOT NULL COMMENT '新闻图片',
  created_time datetime NOT NULL COMMENT '发布时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;

DROP TABLE IF EXISTS t_case;
CREATE TABLE t_case(
  id varchar(36) NOT NULL COMMENT '编号',
  name varchar(100) NOT NULL COMMENT '案例名称',
  customer varchar(100) NOT NULL COMMENT '客户名称',
  des varchar(500) NOT NULL COMMENT '案例详情',
  image varchar(500) NOT NULL COMMENT '案例图片',
  created_time datetime NOT NULL COMMENT '发布时间',
  PRIMARY KEY (id)
) ENGINE = InnoDB DEFAULT CHARSET = utf8;