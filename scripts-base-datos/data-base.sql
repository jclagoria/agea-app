--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-05-2014 a las 10:48:35
-- Versión del servidor: 5.5.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `lagoria`
--
CREATE DATABASE IF NOT EXISTS `lagoria` DEFAULT CHARACTER SET latin1;
USE `lagoria`;

--
-- Estructura de tabla para la tabla `l_sistema`
--

DROP TABLE IF EXISTS `l_sistema`;
CREATE TABLE IF NOT EXISTS `l_sistema` (
  `ID` int(11) NOT NULL,
  `DESCRIPCION` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `l_sistema`
--

INSERT INTO `l_sistema` (`ID`, `DESCRIPCION`) VALUES
(1, 'Afip'),
(2, 'Obra Social'),
(3, 'Bancario'),
(4, 'Deportivo'),
(5, 'Social');

