-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: desarrollo
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `detalle_ventas`
--

DROP TABLE IF EXISTS `detalle_ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_ventas` (
  `Codigo` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio` double NOT NULL,
  `cantidad` int NOT NULL,
  `monto_pro` double NOT NULL,
  `detalle_ventas` int NOT NULL AUTO_INCREMENT,
  `ID_ventas` int NOT NULL,
  PRIMARY KEY (`detalle_ventas`),
  KEY `Codigo_idx` (`Codigo`),
  CONSTRAINT `Codigo` FOREIGN KEY (`Codigo`) REFERENCES `producto` (`Codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=122 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_ventas`
--

LOCK TABLES `detalle_ventas` WRITE;
/*!40000 ALTER TABLE `detalle_ventas` DISABLE KEYS */;
INSERT INTO `detalle_ventas` VALUES (4,'ZTE',4000,1,4000,2,2),(18,'iMac ',80000,1,80000,3,2),(7,'Samsung Galaxy Note 4',7000,1,7000,4,5),(12,'cover rojo',250,2,500,5,5),(15,'case negro de Samsung Note',250,2,500,6,6),(21,'Airpods Pro Max',28000,1,28000,7,7),(18,'iMac ',80000,1,80000,8,8),(7,'Samsung Galaxy Note 4',7000,1,7000,9,8),(19,'iPhone 6s',6000,2,12000,10,9),(7,'Samsung Galaxy Note 4',7000,1,7000,11,10),(4,'ZTE',4000,1,4000,12,10),(6,'iPhone 11',26000,1,26000,13,11),(12,'cover rojo',250,1,250,14,11),(22,'Airpods serie 2',5000,1,5000,15,12),(20,'Case verde esperanza',240,1,240,16,13),(22,'Airpods serie 2',5000,1,5000,17,13),(4,'ZTE',4000,1,4000,18,14),(7,'Samsung Galaxy Note 4',7000,1,7000,19,14),(19,'iPhone 6s',6000,2,12000,20,15),(19,'iPhone 6s',6000,2,12000,21,16),(22,'Airpods serie 2',5000,2,5000,22,16),(9,'LG z1',9000,1,9000,23,17),(4,'ZTE',4000,1,4000,24,18),(18,'iMac ',80000,1,80000,25,18),(4,'ZTE',4000,1,4000,26,19),(12,'cover rojo',250,1,250,27,19),(7,'Samsung Galaxy Note 4',7000,1,7000,28,20),(4,'ZTE',4000,1,4000,29,21),(13,'Computadora Lenovo',50000,1,50000,30,21),(13,'Computadora Lenovo',50000,1,50000,31,22),(19,'iPhone 6s',6000,1,6000,32,22),(7,'Samsung Galaxy Note 4',7000,1,7000,33,22),(14,'Case rojo de iPhone 11',450,1,450,34,23),(20,'Case verde esperanza',240,1,240,35,24),(4,'ZTE',4000,2,8000,36,25),(9,'LG z1',9000,8,72000,37,25),(4,'ZTE',4000,8,4000,38,26),(15,'case negro de Samsung Note',250,1,250,39,27),(19,'iPhone 6s',6000,1,6000,40,27),(10,'iPhone Galaxy',2000,1,2000,41,28),(4,'ZTE',4000,1,4000,42,28),(4,'ZTE',4000,2,8000,43,29),(16,'ZTE 2',5000,2,10000,44,29),(17,'Xiaomi 001',15000,1,15000,45,30),(9,'LG z1',9000,1,9000,46,30),(10,'iPhone Galaxy',2000,1,2000,47,31),(19,'iPhone 6s',6000,1,6000,48,31),(18,'iMac ',80000,1,80000,49,31),(6,'iPhone 11',26000,1,26000,50,32),(13,'Computadora Lenovo',50000,1,50000,51,33),(14,'Case rojo de iPhone 11',450,2,900,52,33),(22,'Airpods serie 2',5000,1,5000,53,34),(14,'Case rojo de iPhone 11',450,1,450,54,34),(8,'iPhone 12',40000,1,40000,55,35),(6,'iPhone 11',26000,1,26000,56,36),(8,'iPhone 12',40000,2,80000,57,37),(17,'Xiaomi 001',15000,1,15000,58,38),(19,'iPhone 6s',6000,1,6000,59,38),(8,'iPhone 12',40000,1,40000,60,39),(13,'Computadora Lenovo',50000,1,50000,61,40),(18,'iMac ',80000,1,80000,62,41),(6,'iPhone 11',26000,1,26000,63,42),(6,'iPhone 11',26000,1,26000,64,43),(13,'Computadora Lenovo',50000,1,50000,65,44),(23,'case azul iPhone 11',250,1,250,66,45),(16,'ZTE 2',5000,1,5000,67,46),(18,'iMac ',80000,1,80000,68,46),(23,'case azul iPhone 11',250,2,500,69,47),(12,'cover rojo',250,2,500,70,47),(23,'case azul iPhone 11',250,1,250,71,48),(19,'iPhone 6s',6000,1,6000,72,48),(6,'iPhone 11',26000,1,26000,73,49),(8,'iPhone 12',40000,1,40000,74,49),(6,'iPhone 11',26000,1,26000,75,50),(10,'iPhone Galaxy',2000,1,2000,76,51),(14,'Case rojo de iPhone 11',450,2,900,77,52),(17,'Xiaomi 001',15000,1,15000,78,53),(20,'Case verde esperanza',240,1,240,79,53),(22,'Airpods serie 2',5000,1,5000,80,53),(9,'LG z1',9000,1,9000,81,54),(8,'iPhone 12',40000,1,40000,82,54),(20,'Case verde esperanza',240,1,240,83,55),(21,'Airpods Pro Max',28000,1,28000,84,55),(6,'iPhone 11',26000,1,26000,85,56),(4,'ZTE',4000,2,8000,86,56),(18,'iMac ',80000,1,80000,87,57),(5,'iPhone 7 ',12000,1,12000,88,58),(16,'ZTE 2',5000,1,5000,89,59),(22,'Airpods serie 2',5000,1,5000,90,59),(6,'iPhone 11',26000,1,26000,91,60),(6,'iPhone 11',26000,4,104000,92,61),(12,'cover rojo',250,1,250,93,61),(13,'Computadora Lenovo',50000,1,50000,94,61),(8,'iPhone 12',40000,1,40000,95,63),(18,'iMac ',80000,1,80000,96,63),(20,'Case verde esperanza',240,1,240,97,65),(4,'ZTE',4000,1,4000,98,66),(6,'iPhone 11',26000,2,52000,99,67),(18,'iMac ',80000,2,160000,100,67),(20,'Case verde esperanza',240,2,480,101,67),(5,'iPhone 7 ',12000,1,12000,102,68),(23,'case azul iPhone 11',250,1,250,103,68),(8,'iPhone 12',40000,1,40000,104,69),(22,'Airpods serie 2',5000,1,5000,105,69),(17,'Xiaomi 001',15000,1,15000,106,70),(7,'Samsung Galaxy Note 4',7000,1,7000,107,70),(24,'Samsung Galaxy Flip Z',40000,1,40000,108,71),(28,'Samsung Galaxy S20 Plus',15000,1,15000,109,72),(27,'iPhone SE',20000,1,20000,110,72),(18,'iMac ',80000,1,80000,111,73),(29,'Air Tag',2000,5,10000,112,74),(29,'Air Tag',2000,4,8000,113,75),(27,'iPhone SE',20000,1,20000,114,75),(6,'iPhone 11',26000,1,26000,115,76),(6,'iPhone 11',26000,1,26000,116,77),(21,'Airpods Pro Max',28000,1,28000,117,77),(29,'Air Tag',2000,4,8000,118,77),(8,'iPhone 12',40000,2,80000,119,78),(28,'Samsung Galaxy S20 Plus',15000,1,15000,120,79),(6,'iPhone 11',26000,1,26000,121,80);
/*!40000 ALTER TABLE `detalle_ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `Codigo` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Precio` varchar(45) DEFAULT NULL,
  `stock` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES (4,'ZTE','4000','0'),(5,'iPhone 7 ','12000','10'),(6,'iPhone 11','26000','6'),(7,'Samsung Galaxy Note 4','7000','10'),(8,'iPhone 12','40000','5'),(9,'LG z1','10000','10'),(10,'iPhone Galaxy','2000','5'),(12,'cover rojo','250','2'),(13,'Computadora Lenovo','50000','6'),(14,'Case rojo de iPhone 11','450','7'),(15,'case negro de Samsung Note','250','5'),(16,'ZTE 2','5000','0'),(17,'Xiaomi 001','15000','5'),(18,'iMac ','80000','10'),(19,'iPhone 6s','6000','10'),(20,'Case verde esperanza','240','5'),(21,'Airpods Pro Max','28000','5'),(22,'Airpods serie 2','5000','10'),(23,'case azul iPhone 11','250','10'),(24,'Samsung Galaxy Flip Z','40000','10'),(25,'Motorola G8 Power','25000','7'),(26,'Huawei P40 Pro','26000','10'),(27,'iPhone SE','20000','10'),(28,'Samsung Galaxy S20 Plus','15000','10'),(29,'Air Tag','2000','20'),(31,'Sony X1000 Headphones','20600','10'),(32,'case negra iPhone 12','450','20');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro` (
  `ID_user` int NOT NULL AUTO_INCREMENT,
  `datetime_ingreso` datetime NOT NULL,
  `datetime_logout` datetime NOT NULL,
  KEY `ID_user_idx` (`ID_user`),
  CONSTRAINT `ID_user` FOREIGN KEY (`ID_user`) REFERENCES `usuario` (`ID_user`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `ID_user` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `User` varchar(30) NOT NULL,
  `correo_electronico` varchar(45) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `id_rol` int NOT NULL,
  PRIMARY KEY (`ID_user`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','admin','admin@','admin',1),(4,'camilo','userone','camilo','userone',2),(5,'Francisco','franfran4','francisco122@gmail.com','fran7',2),(8,'emil','Emil','emil122@gmail.com','aaa',1),(11,'jungkook','abcde','jungkookabc@gmail.com','abcde',1),(12,'wanda','wanda','wandamm@gmail.com','wanda1',2),(17,'Janet','janette','janet1@gmail.com','122',2),(18,'Benny Jiménez','benny','bennyaaa@gmail.com','bennya',2),(19,'Silvana','SilvanaPerez','silvana10@gmail.com','silvana',1),(20,'Santiago','Santi','santiago122@gmail.com','santi',1),(22,'oliver','oliver1','oliver122@gmail.com','oliver2',1),(23,'admin2','admin2','admin2@gmail.com','admin2',1),(24,'admintres','admintres','admintres@gmail.com','admintres',2),(26,'user','user','usuariouno@gmail.com','user',2),(28,'Mancha Perez','Mancha','manchaperez@gmail.com','manchita',1),(29,'Cindy Peña','Cindy Peña','cindypeña@gmail.com','cindy',1),(30,'Alejandro','Alejandro','alejandromontero@gmail.com','ale',1),(31,'Caroline Jimenez','caroline1','carolinejimnez@gmail.com','caro',2),(32,'wandy','wandy','wandy122@gmail.com','wandy',1),(33,'Alba','alba122','alba@gmail.com','alba',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ventas`
--

DROP TABLE IF EXISTS `ventas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ventas` (
  `ID_ventas` int NOT NULL AUTO_INCREMENT,
  `total` double NOT NULL,
  `facturado_por` varchar(45) NOT NULL,
  `fecha_venta` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`ID_ventas`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ventas`
--

LOCK TABLES `ventas` WRITE;
/*!40000 ALTER TABLE `ventas` DISABLE KEYS */;
INSERT INTO `ventas` VALUES (1,4000,'admin','2022-06-13 09:22:33'),(4,84000,'Miguelo','2022-06-13 10:04:17'),(5,7500,'admin','2022-06-13 10:35:58'),(6,500,'','2022-06-13 10:43:47'),(7,28000,'admin','2022-06-13 11:07:31'),(8,87000,'admin','2022-06-13 16:47:54'),(9,12000,'admin','2022-06-13 16:54:14'),(10,11000,'admin','2022-06-13 17:04:21'),(11,26250,'','2022-06-13 17:22:46'),(12,5000,'admin','2022-06-13 17:34:09'),(13,5240,'admin','2022-06-13 17:45:25'),(14,11000,'','2022-06-13 17:50:42'),(15,12000,'Admin','2022-06-13 17:56:14'),(16,17000,'','2022-06-13 17:59:46'),(17,9000,'admin','2022-06-13 18:21:39'),(18,84000,'admin','2022-06-13 18:27:12'),(19,4250,'admin','2022-06-13 18:42:52'),(20,7000,'admin','2022-06-13 18:44:07'),(21,54000,'miguel','2022-06-13 18:47:39'),(22,63000,'admin','2022-06-13 19:18:04'),(23,450,'admin','2022-06-13 19:23:42'),(24,240,'admin','2022-06-13 19:27:47'),(25,80000,'Santi','2022-06-13 19:29:02'),(26,4000,'miguel','2022-06-13 19:30:31'),(27,6250,'admin','2022-06-14 19:28:51'),(28,6000,'','2022-06-14 19:29:45'),(29,18000,'admin','2022-06-14 19:30:43'),(30,24000,'admintres','2022-06-14 19:43:00'),(31,88000,'admintres','2022-06-14 19:51:18'),(32,26000,'admintres','2022-06-14 19:55:19'),(33,50900,'admintres','2022-06-14 20:04:29'),(34,5450,'admintres','2022-06-14 20:25:32'),(35,40000,'admintres','2022-06-14 20:46:07'),(36,26000,'admin','2022-06-14 21:01:34'),(37,80000,'admin','2022-06-14 22:17:53'),(38,21000,'admin','2022-06-15 15:59:06'),(39,40000,'admin','2022-06-15 16:16:20'),(40,50000,'admin','2022-06-15 16:20:41'),(41,80000,'admin','2022-06-15 16:24:22'),(42,26000,'admin','2022-06-15 17:12:12'),(43,26000,'admin','2022-06-15 17:21:33'),(44,50000,'admin','2022-06-15 17:37:06'),(45,250,'admin','2022-06-21 18:58:53'),(46,85000,'admin','2022-06-21 19:11:53'),(47,1000,'admin','2022-06-21 19:13:59'),(48,6250,'admin','2022-06-21 19:41:03'),(49,66000,'Emil','2022-06-21 19:43:57'),(50,26000,'','2022-06-21 19:44:36'),(51,2000,'admin','2022-06-21 19:51:37'),(52,900,'admin','2022-06-21 19:57:57'),(53,20240,'admin','2022-06-21 20:00:43'),(54,49000,'admin','2022-06-22 15:43:23'),(55,28240,'admin','2022-06-22 15:47:54'),(56,34000,'admin','2022-06-22 15:50:16'),(57,80000,'admin','2022-06-22 15:51:39'),(58,12000,'admin','2022-06-22 15:52:51'),(59,10000,'admin','2022-06-22 16:12:43'),(60,26000,'admin','2022-06-22 16:43:45'),(61,104000,'admin','2022-06-22 17:24:03'),(62,50250,'admintres','2022-06-22 17:25:19'),(63,40000,'admin','2022-06-22 17:29:12'),(64,80000,'admin','2022-06-22 17:30:06'),(65,240,'admin','2022-06-22 17:30:56'),(66,4000,'admin','2022-06-22 17:31:34'),(67,212480,'admin','2022-06-22 18:12:34'),(68,12250,'admin','2022-06-22 18:57:37'),(69,45000,'admin','2022-06-22 18:58:12'),(70,22000,'admin','2022-06-22 19:00:08'),(71,40000,'admin','2022-06-22 19:20:48'),(72,35000,'admin','2022-06-22 19:32:48'),(73,80000,'Karina','2022-06-22 19:39:56'),(74,10000,'admin','2022-06-23 19:21:50'),(75,28000,'admin','2022-06-24 19:20:22'),(76,26000,'mancha','2022-06-26 14:47:54'),(77,62000,'admin','2022-06-27 19:42:46'),(78,80000,'admin','2022-06-28 17:02:24'),(79,15000,'alba122','2022-06-28 17:07:39'),(80,26000,'admin','2022-10-04 19:18:23');
/*!40000 ALTER TABLE `ventas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'desarrollo'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-11  9:27:50
