-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: student
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrator`
--

DROP TABLE IF EXISTS `administrator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrator` (
  `admin_id` int NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `contact` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci,
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrator`
--
INSERT INTO `administrator` (`admin_id`, `admin_name`, `password`, `contact`) VALUES
(1, 'Alexis Elke Moolman', 'L13X13', '578298@student.belgiumcampus.ac.za'),
(2, 'Comfort Sibuyi', 'ComfyNas', '577231@student.belgiumcampus.ac.za'),
(3, 'Nathen de Wet', 'OrangEgg21', '578320@student.belgiumcampus.ac.za'),
(4, 'Stephanus Jacobus Mathee', 'timejunky1', '578381@student.belgiumcampus.ac.za'),
(5, 'Jacobus Gerhardus Lotter', 'HardusLotter', '578559@student.belgiumcampus.ac.za'),
(6, 'Pious Sutherland', 'PiousSutherland-BC', '578341@student.belgiumcampus.ac.za');

LOCK TABLES `administrator` WRITE;
/*!40000 ALTER TABLE `administrator` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrator` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `register` (
  `register_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `student_address` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `student_email` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `student_password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `course_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`register_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `register`
--
INSERT INTO `register` (`register_id`, `student_name`, `student_address`, `student_email`, `student_password`, `course_name`) VALUES
(1, 'Alexis Elke Moolman', 'Nanya Street', '578298@student.belgiumcampus.ac.za', 'randimThingz1', 'PRG381'),
(2, 'Comfort Sibuyi', 'Nanya Street', '577231@student.belgiumcampus.ac.za', 'randimThingz2', 'PRG381'),
(3, 'Jacobus Gerhardus Lotter', 'Nanya Street', '578559@student.belgiumcampus.ac.za', 'randimThingz3', 'PRG381'),
(4, 'Nathen de Wet', 'Nanya Street', '578320@student.belgiumcampus.ac.za', 'randimThingz4', 'PRG381'),
(5, 'Stephanus Jacobus Mathee', 'Nanya Street', '578381@student.belgiumcampus.ac.za', 'randimThingz5', 'PRG381'),
(6, 'Pious Sutherland', 'Nanya Street', '578341@student.belgiumcampus.ac.za', 'randimThingz6', 'PRG381');

LOCK TABLES `register` WRITE;
/*!40000 ALTER TABLE `register` DISABLE KEYS */;
/*!40000 ALTER TABLE `register` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `student_id` int NOT NULL AUTO_INCREMENT,
  `student_name` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `student_address` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `student_email` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  `student_password` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL,
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--
INSERT INTO `student` (`student_id`, `student_name`, `student_address`, `student_email`, `student_password`) VALUES
(1, 'Alexis Elke Moolman', 'Nanya Street', '578298@student.belgiumcampus.ac.za', 'randimThingz1'),
(2, 'Comfort Sibuyi', 'Nanya Street', '577231@student.belgiumcampus.ac.za', 'randimThingz2'),
(3, 'Jacobus Gerhardus Lotter', 'Nanya Street', '578559@student.belgiumcampus.ac.za', 'randimThingz3'),
(4, 'Nathen de Wet', 'Nanya Street', '578320@student.belgiumcampus.ac.za', 'randimThingz4'),
(5, 'Stephanus Jacobus Mathee', 'Nanya Street', '578381@student.belgiumcampus.ac.za', 'randimThingz5'),
(6, 'Pious Sutherland', 'Nanya Street', '578341@student.belgiumcampus.ac.za', 'randimThingz6');

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
ALTER TABLE `administrator`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `register`
--
ALTER TABLE `register`
  MODIFY `register_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `student_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;
-- Dump completed on 2023-08-22 22:43:27
