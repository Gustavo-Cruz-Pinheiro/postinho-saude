-- MariaDB dump 10.19  Distrib 10.11.2-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: posto_saude
-- ------------------------------------------------------
-- Server version	10.11.2-MariaDB

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
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `datnasc` date DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL,
  `tele` varchar(11) DEFAULT NULL,
  `cel` varchar(10) DEFAULT NULL,
  `ogexp` varchar(50) DEFAULT NULL,
  `rg` varchar(12) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `cpf` varchar(11) DEFAULT NULL,
  `funcao` varchar(15) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
INSERT INTO `funcionario` VALUES
(1,'Aline Duran','1985-03-15','Rua Fictícia, 123','1123456789','9987654321','MS','1234567 ','SP','Nova Andradina','Portal','98765432100','Medica','Feminino'),
(2,'Carlos Oliveira','1990-07-22',' Avenida das Flores, 456','2134567890','9876543210','MG','8765432','MG','Florópolis','Jardim Primavera','23456789012','Enfermeiro','Masculino'),
(3,'Marina Santos','1988-05-10','Travessa do Sol, 789','3198765432','9876541230','MG/SSP','5432109','MG','Belo Vale','Centro Histórico','34567890123','Medica','Feminino'),
(4,'Lucas Pereira','1982-11-05','Rua da Liberdade, 321','7187654321','9870123456','BH/SSP','9876543','BH','Salvador','Liberdade','45678901234','Medico','Masculino'),
(5,'Joaquim Ledo','1980-12-18','Avenida das Árvores, 567','5134567890','9876543210','RS/SSP','4321098','RS','Porto Alegre','Arborizado','78901234567','Enfermeiro','Masculino'),
(6,'Joana Lima','1987-04-03','Rua das Estrelas, 234','4134567890','9987654321','PR/SSP','6543210','PR','Curitiba','Estelar','67890123456','Medica','Feminino'),
(7,'Alberto Almaral','1984-02-08','Travessa das Oliveiras, 876','8134567890','9987654321','PE/SSP','7654321','PE','Recife','Oliveirinha','90123456789','Medico','Masculino'),
(8,'Larissa Oliveira','1993-06-25','Rua das Palmeiras, 765','8534567890','9870123456','CE/SSP','8765432','CE','Fortaleza','Palmeiral','89012345678','Medica','Feminino');
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) DEFAULT NULL,
  `senha` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES
(1,'adin','root'),
(2,'jales_lucio','123');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `paciente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `datnasc` date DEFAULT NULL,
  `end` varchar(255) DEFAULT NULL,
  `tele` varchar(11) DEFAULT NULL,
  `cel` varchar(10) DEFAULT NULL,
  `sexo` varchar(10) DEFAULT NULL,
  `rg` varchar(12) DEFAULT NULL,
  `uf` varchar(2) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `certidao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES
(1,'Ana Silva','1988-07-15','Rua da Esperança, 234','6734567890','6798765432','Feminino','1234567 ','MS','Nova Andradina','Jardim Nova Vida','NAM123456'),
(2,'Marina Oliveira','2023-09-23','Travessa da Alegria, 789','6712345678','6798765432','Feminino','3456789','MS','Nova Andradina','Jardim Feliz','NAM345678'),
(3,'Jonas Santos','1999-12-13','Avenida da Paz, 567','6723456789','6790123456','Masculino','9876543','MS','Centro','Nova Andradina','NAM987654'),
(4,'Pedro Lima  ','1984-03-25','Rua da Saúde, 123','6723456789','6790123456','Masculino','4567890','MS','Bem-Viver','Nova Andradina','NAM456789');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plantao`
--

DROP TABLE IF EXISTS `plantao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plantao` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `data` date DEFAULT NULL,
  `horaEntrada` time DEFAULT NULL,
  `horaSaida` time DEFAULT NULL,
  `codigo_enf` int(11) DEFAULT NULL,
  `codigo_med` int(11) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_enf` (`codigo_enf`),
  KEY `codigo_med` (`codigo_med`),
  CONSTRAINT `plantao_ibfk_1` FOREIGN KEY (`codigo_enf`) REFERENCES `funcionario` (`codigo`),
  CONSTRAINT `plantao_ibfk_2` FOREIGN KEY (`codigo_med`) REFERENCES `funcionario` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plantao`
--

LOCK TABLES `plantao` WRITE;
/*!40000 ALTER TABLE `plantao` DISABLE KEYS */;
INSERT INTO `plantao` VALUES
(1,'2023-02-10','19:00:00','07:00:00',2,1),
(2,'2023-02-15','22:30:00','08:30:00',5,3),
(3,'2023-02-20','14:00:00','14:00:00',5,4),
(4,'2023-02-25','18:45:00','06:15:00',2,7);
/*!40000 ALTER TABLE `plantao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacina`
--

DROP TABLE IF EXISTS `vacina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vacina` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nomeVaci` varchar(255) DEFAULT NULL,
  `form_admvaci` varchar(15) DEFAULT NULL,
  `via_admvaci` varchar(15) DEFAULT NULL,
  `lugar_admvaci` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacina`
--

LOCK TABLES `vacina` WRITE;
/*!40000 ALTER TABLE `vacina` DISABLE KEYS */;
INSERT INTO `vacina` VALUES
(1,'Poliomelite','Parenteral','Oral','Posto de Vacinação','Contra a paralisia intantil'),
(2,'G1P1','Parenteral','Oral','Unidade da Saúde','Vacina Contra o RotaVírus'),
(3,'ImmuCare','Intramuscular','Parenteral','Centro de Vacinação Infantil','Vacina Infantil'),
(4,'ElderGuard','Intramuscular','Parenteral','Residência Sênior','Vacina para idoso'),
(5,'COVID','Intramuscular','Parenteral','Centro de Saúde Municipal','Vacina contra o covid-19'),
(6,'TetanoGuard','Intramuscular','Parenteral','Posto','TetanoGuard é uma vacina essencial para prevenção do tétano');
/*!40000 ALTER TABLE `vacina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacinapaciente`
--

DROP TABLE IF EXISTS `vacinapaciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `vacinapaciente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_vacina` int(11) DEFAULT NULL,
  `codigo_paciente` int(11) DEFAULT NULL,
  `data` date DEFAULT NULL,
  `dose` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `codigo_vacina` (`codigo_vacina`),
  KEY `codigo_paciente` (`codigo_paciente`),
  CONSTRAINT `vacinapaciente_ibfk_1` FOREIGN KEY (`codigo_vacina`) REFERENCES `funcionario` (`codigo`),
  CONSTRAINT `vacinapaciente_ibfk_2` FOREIGN KEY (`codigo_paciente`) REFERENCES `funcionario` (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacinapaciente`
--

LOCK TABLES `vacinapaciente` WRITE;
/*!40000 ALTER TABLE `vacinapaciente` DISABLE KEYS */;
INSERT INTO `vacinapaciente` VALUES
(1,5,1,'2022-04-22','1º'),
(2,5,1,'2022-10-20','2º'),
(3,6,4,'2019-02-18','2º'),
(4,6,4,'2012-12-20','1º'),
(5,2,2,'1999-01-23','1º'),
(6,3,2,'2023-11-21','1º');
/*!40000 ALTER TABLE `vacinapaciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-11-30 10:58:15
