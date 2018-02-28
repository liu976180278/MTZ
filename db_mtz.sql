/*
SQLyog Enterprise v12.08 (64 bit)
MySQL - 5.5.12-log : Database - db_mtz
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`db_mtz` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `db_mtz`;

/*Table structure for table `tb_mtz` */

DROP TABLE IF EXISTS `tb_mtz`;

CREATE TABLE `tb_mtz` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `time` varchar(225) NOT NULL,
  `grade` varchar(225) NOT NULL,
  `state` varchar(225) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=159 DEFAULT CHARSET=latin1;

/*Data for the table `tb_mtz` */

insert  into `tb_mtz`(`id`,`time`,`grade`,`state`) values (1,'Tue Aug 29 10:27:29 CST 2017','1000','2222'),(2,'Tue Aug 29 18:03:11 CST 2017','100','1'),(3,'Wed Aug 30 17:16:14 CST 2017','200','1'),(4,'2017/05/21 03:01','1000','0'),(5,'2017/05/21 10:52','300','0'),(6,'2017/05/21 10:52','0','1'),(7,'2017/05/21 10:52','100','1'),(8,'2017/05/21 10:54','200','0'),(9,'2017/05/21 10:57','100','0'),(10,'2017/05/21 10:57','300','0'),(11,'2017/05/21 10:57','0','1'),(12,'2017/05/21 10:58','0','1'),(13,'2017/05/21 10:58','0','1'),(14,'2017/05/21 10:58','0','1'),(15,'2017/05/21 10:58','0','1'),(16,'2017/05/21 11:00','0','1'),(17,'2017/05/21 11:01','0','1'),(18,'2017/05/21 11:03','400','1'),(19,'2017/05/21 11:04','100','1'),(20,'2017/05/21 11:04','0','1'),(21,'2017/05/21 11:04','0','0'),(22,'2017/05/21 12:43','400','0'),(23,'2017/05/22 09:09','400','0'),(24,'2017/05/22 09:09','400','0'),(25,'','100','100'),(26,'','100','100'),(27,'100','100','100'),(28,'100','100','100'),(29,'100','100','100'),(30,'Fri Aug 25 11:54:10 CST 2017','100','100'),(31,'Fri Aug 25 11:54:43 CST 2017','100','100'),(32,'Fri Aug 25 11:55:39 CST 2017','100','100'),(33,'Fri Aug 25 11:57:24 CST 2017','100','100'),(34,'Fri Aug 25 13:41:11 CST 2017','100','100'),(35,'Fri Aug 25 13:47:40 CST 2017','100','100'),(36,'Fri Aug 25 14:19:21 CST 2017','100','100'),(37,'Fri Aug 25 14:21:08 CST 2017','100','100'),(38,'Fri Aug 25 14:23:01 CST 2017','100','100'),(39,'Fri Aug 25 14:23:32 CST 2017','100','100'),(40,'Fri Aug 25 14:25:58 CST 2017','100','100'),(41,'Fri Aug 25 14:26:50 CST 2017','100','100'),(42,'Fri Aug 25 14:27:08 CST 2017','100','100'),(43,'Fri Aug 25 14:29:21 CST 2017','100','100'),(44,'Fri Aug 25 14:31:54 CST 2017','100','100'),(45,'Fri Aug 25 14:35:20 CST 2017','100','100'),(46,'Fri Aug 25 14:36:22 CST 2017','100','100'),(47,'Fri Aug 25 14:38:28 CST 2017','100','100'),(48,'Fri Aug 25 14:39:42 CST 2017','100','100'),(49,'Fri Aug 25 14:41:45 CST 2017','100','100'),(50,'Fri Aug 25 14:44:09 CST 2017','100','100'),(51,'Fri Aug 25 14:50:20 CST 2017','100','100'),(52,'Fri Aug 25 14:51:29 CST 2017','100','100'),(53,'Fri Aug 25 14:51:37 CST 2017','100','100'),(54,'Fri Aug 25 15:03:02 CST 2017','100','100'),(55,'Fri Aug 25 15:04:23 CST 2017','100','100'),(56,'Fri Aug 25 15:05:03 CST 2017','100','100'),(57,'Fri Aug 25 15:15:11 CST 2017','100','100'),(58,'Fri Aug 25 15:15:17 CST 2017','100','100'),(59,'Fri Aug 25 15:19:21 CST 2017','100','100'),(60,'Fri Aug 25 15:27:24 CST 2017','100','100'),(61,'Fri Aug 25 15:30:06 CST 2017','100','100'),(62,'Fri Aug 25 15:31:12 CST 2017','100','100'),(63,'Fri Aug 25 15:33:39 CST 2017','100','100'),(64,'Fri Aug 25 15:37:30 CST 2017','100','100'),(66,'Fri Aug 25 16:34:26 CST 2017','102','102'),(67,'Fri Aug 25 16:38:52 CST 2017','101','101'),(68,'Fri Aug 25 16:40:56 CST 2017','101','101'),(69,'Fri Aug 25 16:41:53 CST 2017','101','101'),(70,'Fri Aug 25 16:42:47 CST 2017','101','101'),(71,'Fri Aug 25 16:43:50 CST 2017','101','101'),(72,'Fri Aug 25 16:43:57 CST 2017','101','101'),(73,'Fri Aug 25 16:43:57 CST 2017','101','101'),(74,'Fri Aug 25 16:43:57 CST 2017','101','101'),(75,'Fri Aug 25 16:43:57 CST 2017','101','101'),(76,'Fri Aug 25 16:43:58 CST 2017','101','101'),(77,'Fri Aug 25 16:43:58 CST 2017','101','101'),(78,'2017/05/21 10:52','9999999','99'),(79,'2017/05/21 10:52','9999999','100'),(82,'Thu Sep 21 16:35:27 CST 2017','102','102'),(83,'Thu Sep 21 16:39:57 CST 2017','102','102'),(84,'Tue Oct 10 09:17:28 CST 2017','102','102'),(85,'Fri Sep 29 16:45:09 CST 2017','102','102'),(86,'Fri Sep 29 17:12:35 CST 2017','102','102'),(87,'Fri Sep 29 17:15:27 CST 2017','102','102'),(88,'Fri Sep 29 17:22:51 CST 2017','102','102'),(89,'Fri Sep 29 17:26:55 CST 2017','102','102'),(90,'Fri Sep 29 17:31:02 CST 2017','102','102'),(91,'Wed Oct 11 09:17:59 CST 2017','102','102'),(92,'Wed Oct 11 09:24:10 CST 2017','102','102'),(93,'Wed Oct 11 09:27:04 CST 2017','102','102'),(94,'Wed Oct 11 09:53:53 CST 2017','102','102'),(95,'Wed Oct 11 10:04:32 CST 2017','102','102'),(96,'Wed Oct 11 10:06:32 CST 2017','102','102'),(97,'Wed Oct 11 10:07:49 CST 2017','102','102'),(98,'Wed Oct 11 10:08:26 CST 2017','102','102'),(99,'Wed Oct 11 10:14:34 CST 2017','102','102'),(100,'Wed Oct 11 10:14:39 CST 2017','102','102'),(101,'Wed Oct 11 10:32:59 CST 2017','102','102'),(102,'Wed Oct 11 10:33:53 CST 2017','102','102'),(103,'Wed Oct 11 10:42:08 CST 2017','102','102'),(104,'Wed Oct 11 10:44:53 CST 2017','102','102'),(105,'Wed Oct 11 10:57:29 CST 2017','102','102'),(106,'Wed Oct 11 10:58:37 CST 2017','102','102'),(107,'Wed Oct 11 10:59:13 CST 2017','102','102'),(108,'Wed Oct 11 10:59:55 CST 2017','102','102'),(109,'Wed Oct 11 11:01:19 CST 2017','102','102'),(110,'Wed Oct 11 11:06:57 CST 2017','102','102'),(111,'Wed Oct 11 11:07:47 CST 2017','102','102'),(112,'Wed Oct 11 11:08:37 CST 2017','102','102'),(113,'Wed Oct 11 11:13:50 CST 2017','102','102'),(114,'Wed Oct 11 11:49:24 CST 2017','102','102'),(115,'Wed Oct 11 11:53:46 CST 2017','102','102'),(116,'Wed Oct 11 11:55:13 CST 2017','102','102'),(117,'Wed Oct 11 14:17:22 CST 2017','102','102'),(118,'Wed Oct 11 14:18:48 CST 2017','102','102'),(119,'Wed Oct 11 14:18:58 CST 2017','102','102'),(120,'Wed Oct 11 14:24:37 CST 2017','102','102'),(121,'Wed Oct 11 14:32:05 CST 2017','102','102'),(122,'Wed Oct 11 14:36:37 CST 2017','102','102'),(123,'Wed Oct 11 14:37:53 CST 2017','102','102'),(124,'Wed Oct 11 14:39:26 CST 2017','102','102'),(125,'Wed Oct 11 14:40:24 CST 2017','102','102'),(126,'Wed Oct 11 14:42:43 CST 2017','102','102'),(127,'Wed Oct 11 14:45:59 CST 2017','102','102'),(128,'Wed Oct 11 14:46:17 CST 2017','102','102'),(129,'Wed Oct 11 14:49:00 CST 2017','102','102'),(130,'Wed Oct 11 14:49:59 CST 2017','102','102'),(131,'Wed Oct 11 14:53:05 CST 2017','102','102'),(132,'Wed Oct 11 14:53:41 CST 2017','102','102'),(133,'Wed Oct 11 14:54:16 CST 2017','102','102'),(134,'Wed Oct 11 14:58:02 CST 2017','102','102'),(135,'Wed Oct 11 14:59:04 CST 2017','102','102'),(136,'Wed Oct 11 14:59:35 CST 2017','102','102'),(137,'Wed Oct 11 14:59:59 CST 2017','102','102'),(138,'Wed Oct 11 15:10:04 CST 2017','102','102'),(139,'Wed Oct 11 15:11:44 CST 2017','102','102'),(140,'Wed Oct 11 15:12:24 CST 2017','102','102'),(141,'Wed Oct 11 15:12:33 CST 2017','102','102'),(142,'Wed Oct 11 15:15:52 CST 2017','102','102'),(143,'Wed Oct 11 15:19:07 CST 2017','102','102'),(144,'Wed Oct 11 15:22:54 CST 2017','102','102'),(145,'Wed Oct 11 15:27:35 CST 2017','102','102'),(146,'Wed Oct 11 15:28:12 CST 2017','102','102'),(147,'Wed Oct 11 15:28:14 CST 2017','102','102'),(148,'Wed Oct 11 15:31:23 CST 2017','102','102'),(149,'Wed Oct 11 15:31:31 CST 2017','102','102'),(150,'Wed Oct 11 18:04:24 CST 2017','102','102'),(151,'Wed Oct 11 18:05:21 CST 2017','102','102'),(152,'Wed Oct 11 18:06:36 CST 2017','102','102'),(153,'Wed Oct 11 18:07:16 CST 2017','102','102'),(154,'Wed Oct 11 18:09:28 CST 2017','102','102'),(155,'Wed Oct 11 18:10:06 CST 2017','102','102'),(156,'Fri Nov 17 15:37:25 CST 2017','102','102'),(157,'Fri Nov 17 15:38:16 CST 2017','102','102'),(158,'Fri Nov 17 15:42:32 CST 2017','102','102');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
