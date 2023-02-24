CREATE DATABASE  IF NOT EXISTS `concerto`;
USE `concerto`;

CREATE TABLE `concerts` (
  `id_concerts` int NOT NULL AUTO_INCREMENT,
  `genre` varchar(100) DEFAULT NULL,
  `titre` varchar(100) DEFAULT NULL,
  `artiste` varchar(100) DEFAULT NULL,
  `date` varchar(10) DEFAULT NULL,
  `heure` varchar(5) DEFAULT NULL,
  `prix` decimal(5,2) DEFAULT NULL,
  PRIMARY KEY (`id_concerts`)
) ;


INSERT INTO `concerts` VALUES (1,'Pop','The Eras Tour','Taylor Swift','12-09-2022','22:00',100.00);
UNLOCK TABLES;