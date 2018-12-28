-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Dec 28, 2018 at 02:42 AM
-- Server version: 5.6.34-log
-- PHP Version: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examen`
--

-- --------------------------------------------------------

--
-- Table structure for table `estudiante`
--

CREATE TABLE `estudiante` (
  `matricula` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `ap_paterno` varchar(255) NOT NULL,
  `ap_materno` varchar(255) NOT NULL,
  `calificacion` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `examen`
--

CREATE TABLE `examen` (
  `n_pregunta` int(11) NOT NULL,
  `num_pregunta_vista` varchar(255) NOT NULL,
  `respuesta_estudiante` varchar(255) NOT NULL,
  `matricula` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `profesor`
--

CREATE TABLE `profesor` (
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `profesor`
--

INSERT INTO `profesor` (`email`, `password`) VALUES
('profesor@gmail.com', '123');

-- --------------------------------------------------------

--
-- Table structure for table `reactivos`
--

CREATE TABLE `reactivos` (
  `num_pregunta` int(11) NOT NULL,
  `pregunta` varchar(255) NOT NULL,
  `opcion_a` varchar(255) NOT NULL,
  `opcion_b` varchar(255) NOT NULL,
  `opcion_c` varchar(255) NOT NULL,
  `opcion_d` varchar(255) NOT NULL,
  `respuesta` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reactivos`
--

INSERT INTO `reactivos` (`num_pregunta`, `pregunta`, `opcion_a`, `opcion_b`, `opcion_c`, `opcion_d`, `respuesta`) VALUES
(1, '¿En que año el hombre piso la luna?', '1964', '1986', '1996', '1955', 'a'),
(2, '¿Cuanto vale x en la ecuacion x-10=0?', 'x=1', 'x=10', 'x=9', 'x=15', 'b'),
(3, '¿Quien escribio \"El Quijote de la mancha\"?', 'Cervantes Saavedra', 'Carlos Fuentes', 'Elena Poniatovska', 'William Shakespeare', 'a'),
(4, '¿Cuando empezo la 2 Guerra Mundial?', '2016', '2013', '1945', '2000', 'c'),
(5, '¿Donde esta ubicado el Museo de Louvre?', 'Alemania', 'Francia', 'Italia', 'Tokio', 'b'),
(6, '¿Cual es la fecha de la batalla de Puebla?', '3 de Mayo', '5 de Mayo', '7 de Mayo', '18 de Marzo', 'b'),
(7, '¿Cual es la capital de Japon?', 'Berlin', 'Seul', 'Tokio', 'Roma', 'c'),
(8, '¿Cual es la capital de Argentina?', 'Lima', 'Caracas', 'Buenos Aires', 'Seul', 'c'),
(9, '¿Donde se encuentra la Torre Latinoamericana?', 'EUA', 'Ciudad de Mexico', 'Canada', 'Peru', 'b'),
(10, '¿En que estado quedan las ruinas de Tenochtitlan?', 'Morelos', 'Ciudad de Mexico', 'Puebla', 'Morelos', 'b'),
(11, '¿Cual es la capital de EUA?', 'Washington D.C.', 'Sidney', 'Tokio', 'Roma', 'a'),
(12, '¿Cuanto es x-3=0 ?', 'x=7', 'x=9', 'x=3', 'x=8', 'c'),
(13, '¿Cual es la capital de Australia?', 'Sidney', 'Tokio', 'Beijing', 'Buenos Aires', 'a'),
(14, '¿Cuando se celebra el dia del trabajo?', '18 de Marzo', '16 de Septiembre', '10 de Mayo', '1 de Mayo', 'd'),
(15, '¿Cual es la capital de Alemania?', 'Tokio', 'Sidney', 'Buenos Aires', 'Berlin', 'd');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`matricula`);

--
-- Indexes for table `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`matricula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
