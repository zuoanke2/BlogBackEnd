/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80032 (8.0.32)
 Source Host           : localhost:3306
 Source Schema         : blogbackend

 Target Server Type    : MySQL
 Target Server Version : 80032 (8.0.32)
 File Encoding         : 65001

 Date: 09/02/2023 02:34:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(4096) DEFAULT NULL,
  `authorid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of blog
-- ----------------------------
BEGIN;
INSERT INTO `blog` (`id`, `title`, `content`, `authorid`) VALUES (1, 'test blog1', 'this article is just for test', 2);
INSERT INTO `blog` (`id`, `title`, `content`, `authorid`) VALUES (2, 'test blog2', 'this is also for test', 2);
INSERT INTO `blog` (`id`, `title`, `content`, `authorid`) VALUES (3, 'test blog3', 'of course test', 2);
INSERT INTO `blog` (`id`, `title`, `content`, `authorid`) VALUES (4, 'zak blog1', 'this is the first blog of zak', 1);
COMMIT;

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `cmtid` int NOT NULL AUTO_INCREMENT,
  `authorid` int DEFAULT NULL,
  `blogid` int DEFAULT NULL,
  `comment` varchar(4096) DEFAULT NULL,
  PRIMARY KEY (`cmtid`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of comment
-- ----------------------------
BEGIN;
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (1, 1, 1, 'this is just a test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (2, 1, 1, 'this is my 2nd comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (7, 1, 1, 'this is a comment that add from addComent API!');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (8, 1, 1, 'this comment was modified by the updateCommend API!');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (10, 0, 1, 'unit test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (11, 0, 1, 'unit test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (12, 0, 1, 'unit test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (13, 0, 1, 'unit test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (14, 0, 1, 'unit test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (15, 0, 1, 'unit test comment');
INSERT INTO `comment` (`cmtid`, `authorid`, `blogid`, `comment`) VALUES (16, 2, 2, 'this is an comment from Anke that for testing of deleteComment API!');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userid` int DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`userid`, `username`) VALUES (1, 'zuoanke');
INSERT INTO `user` (`userid`, `username`) VALUES (2, 'bloger1');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
