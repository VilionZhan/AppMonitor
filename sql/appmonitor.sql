/*
Navicat MySQL Data Transfer

Source Server         : appmonitor
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : appmonitor

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2019-01-02 20:55:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `permission` varchar(255) DEFAULT NULL,
  `rid` int(11) DEFAULT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(255) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- add by zhangbendong 2019 03 30- ----------------------------
user appMonitor;
SHOW TABLES ;
/*用户表*/
DROP TABLE IF EXISTS `APP_USER`;
CREATE TABLE APP_USER(
  USER_NAME VARCHAR(20),
  USER_PASSWORD VARCHAR(20),
  USER_POWER VARCHAR(10),
  USER_PHONE INT(20),
  EMAIL VARCHAR(20),
  REGISTER_DATE DATE,
  EXT1 VARCHAR(100),
  EXT2 VARCHAR(100),
  EXT3 VARCHAR(100)
);
ALTER TABLE `APP_USER` ADD UNIQUE (`USER_PHONE`);
describe APP_USER;

/**应用注册表*/
DROP TABLE IF EXISTS `app_register`;
 create table app_register (
   app_name varchar(20),
   app_address varchar(50) primary key,
   app_port int (6) unique ,
   app_regdate date,
   app_status int(2)
 );
describe app_register;
