/*
SQLyog Professional v12.09 (64 bit)
MySQL - 8.0.12 : Database - redbean
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`redbean` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;

USE `redbean`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `account_id` int(11) NOT NULL COMMENT '主键Id',
  `account_name` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '用户名',
  `account_phone` varchar(11) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '手机号码',
  `account_password` varchar(16) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '密码',
  `account_headurl` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '头像',
  `account_status` int(1) DEFAULT NULL COMMENT '账号状态',
  PRIMARY KEY (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `account` */

/*Table structure for table `dailynote` */

DROP TABLE IF EXISTS `dailynote`;

CREATE TABLE `dailynote` (
  `note_id` int(11) NOT NULL COMMENT '日迹ID',
  `account_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `note_url` varchar(100) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '日迹图片',
  `note_description` varchar(50) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '日迹描述',
  `note_date` varchar(20) COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '日迹时间',
  PRIMARY KEY (`note_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `dailynote` */

/*Table structure for table `lostnote` */

DROP TABLE IF EXISTS `lostnote`;

CREATE TABLE `lostnote` (
  `lost_id` int(11) NOT NULL COMMENT '自暴自弃ID',
  `account_id` int(11) DEFAULT NULL COMMENT '自暴自弃用户ID',
  `lost_date` date DEFAULT NULL COMMENT '自暴自弃时间',
  PRIMARY KEY (`lost_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

/*Data for the table `lostnote` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
