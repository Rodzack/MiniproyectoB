-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-03-2015 a las 04:21:07
-- Versión del servidor: 5.6.20
-- Versión de PHP: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `miniproyecto`
--
CREATE DATABASE IF NOT EXISTS `miniproyecto` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `miniproyecto`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descripcion`
--

DROP TABLE IF EXISTS `descripcion`;
CREATE TABLE IF NOT EXISTS `descripcion` (
`idDescripcion` int(11) NOT NULL,
  `capacidad` varchar(15) DEFAULT NULL,
  `velocidad` varchar(10) DEFAULT NULL,
  `tipoDeConexion` varchar(20) DEFAULT NULL,
  `tecnologia` varchar(25) CHARACTER SET utf16 COLLATE utf16_spanish_ci DEFAULT NULL,
  `voltaje` varchar(25) DEFAULT NULL,
  `tamanio` varchar(20) DEFAULT NULL,
  `descripcionAdicional` varchar(100) DEFAULT NULL,
  `compatibilidad` int(11) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=77 ;

--
-- Volcado de datos para la tabla `descripcion`
--

INSERT INTO `descripcion` (`idDescripcion`, `capacidad`, `velocidad`, `tipoDeConexion`, `tecnologia`, `voltaje`, `tamanio`, `descripcionAdicional`, `compatibilidad`) VALUES
(2, '12g', '12mhz', 'usb', 'ddr3', '1.5v', '15''', 'primer registrro', 24),
(3, '4 gb', '1333 mhz', '', 'ddr3', '', '', '', 24),
(4, '8 gb', '1333 mhz', '', 'ddr3', '', '', '', 24),
(5, '8 gb', '1600 mhz', '', 'ddr3', '', '', 'PC3L-12800S', 24),
(6, '8 gb', '1066 mhz', '', 'ddr3', '', '', 'Pc3-8500', 24),
(7, '32 gb', '26666 mhz', '', 'ddr4', '1.2v', '', '(4 X 8gb)', 24),
(8, '16 gb', '2400 mhz', '', 'ddr3', '1.65 v', '', '(2x8GB) ', 24),
(9, '8 gb', '1600 mhz', '', 'ddr3', '', '', '', 24),
(10, '8 gb', '1600 mhz', '', 'ddr3', '', '', '', 24),
(11, '8 gb', '1600 mhz', '', 'ddr3', '', '', '2x4gb color rojo', 24),
(12, '500 gb', '5400 rpm', '', 'sata', '', '', '', 24),
(13, '1 tb', '7200 rpm', '', 'sata', '', '', '', 24),
(14, '1 tb', '7200 rpm', '', 'sata', '', '', '', 24),
(15, '2 tb', '7200 rpm', '', 'sata', '', '', '', 24),
(16, '1 tb', '7200 rpm', '', 'sata', '', '', '64 mb de cache', 24),
(17, '1 gb', '1200 mhz', '', 'ddr3', '', '', 'Memory Bandwidth Interface PCI-E 2.0 16x DVI-I, HDMI, VGA', 24),
(18, '1 gb', '1075 mhz', '', 'ddr5', '', '', '', 24),
(19, '2 gb', '1620 mhz', '', 'ddr3', '', '', '48 nucleos CUDA', 24),
(20, '2 gb', '1620 mhz', '', 'ddr3', '', '', 'Tasa de relleno de texturas 2048 MB', 24),
(21, '2 gb', '1000 mhz', '', 'ddr5', '', '', '', 24),
(22, '2 gb', '1620 mhz', '', 'ddr3', '', '', '', 24),
(23, '2 gb', '1600 mhz', '', 'ddr3', '', '', '', 24),
(24, '4 nucleos', '3.5 Ghz', 'Socket Lga 1150', '4ta Gen', '', '', '', 3),
(25, '6 Nucleos ', '3.5 Ghz', 'Am3+ ', '', '95w', '', '', 4),
(26, '6 nucleos', '4.2 Ghz', 'Am3+', '', '125 w', '', '', 4),
(27, '2 nucleos', '2.8 Ghz', 'Socket Lga1150', '4ta Gen', '', '', '', 3),
(28, '2 nucleos', '3.2 Ghz', 'Socket Lga1150', 'Devils Cayon', '', '', '', 3),
(29, '2 nucleos', '3.2 Ghz', 'Socket Lga1150', '', '', '', '', 3),
(30, '', '', 'Inalambrica', 'Plug and play', '', '', 'Touchpad Integrado de 9 cm, 10 metros de alcance inalambrico', 24),
(31, '', '', 'USB', '', '', '', 'retroiluminacion LED azul', 24),
(32, '', '', 'USB', '', '', '', 'Pantalla Tactil 4.05', 24),
(33, '', '', 'USB', '', '', '', '', 24),
(34, '', '', 'USB', '', '', '', 'Diseno ergonomico', 24),
(35, '', '', 'PS/2', '', '', '', '', 24),
(36, '', '', 'USB', '', '', '', 'Negro, 8 teclas de acceso rapido', 24),
(37, '', '', 'USB', '', '', '', 'Synapse 2.0', 24),
(38, '', '', 'Bluetooth', '', '', '', '', 24),
(39, '', '', 'USB ', '', '', '', '', 24),
(40, '', '', 'USB', '', '', '', 'Retroiluminado,programable,programacion de teclas', 24),
(41, '', '3.5 GHz', '', 'Devils Cayon', '', '', '4 nucleos,Turbo host', 3),
(42, '', '3.2 GHz', '', '', '', '', '2 nucleos', 3),
(43, '', '3.5ghz', 'Socket Lga1150', '4ta Gen', '88 W', '37.5mm x 37.5mm', '4 nucleos', 3),
(44, '', '', '775', 'DDR3', '', '', 'VS3', 3),
(45, '', '', '', 'DDR2 / DDR3', '', '', '2 puestos PCI', 4),
(46, '', '', '', 'DDR2 / DDR3', '', '', '4ta Gen Uefi Bios', 3),
(47, '', '', 'Lga 1150', 'DDR3', '', '', 'Soporte Multi-gpu', 3),
(48, '', '', 'AM3+', 'DDR3', '', '', 'Atx Crossfire Usb 3.0 Sata3', 4),
(49, '', '', 'Skt 1150', 'DDR3', '', '', 'Proc. 4a Gen', 3),
(50, '', '', 'Tpc 812', '', '', '', 'Proc. 4a Gen', 24),
(51, '', '', '', '', '', '', 'Seidon120m', 24),
(52, '', '', '', '', '', '', 'Glacer 240l', 24),
(53, '', '', '', '', '', '', 'Seidon120v', 24),
(54, '', '2.4ghz', 'Bluetooth - Usb ', 'Optico ', '', '', 'Ergonomico', 24),
(55, '', '', 'Usb', 'Optico ', '', '', 'Con teclado numerico retractil', 24),
(56, '', '', 'Wireless - USB', '', '', '', '2.4g - usb 10 metros de alcance inalambrico', 24),
(57, '', '', '', '', '', '', 'Acaba Con El Dolor De Mano', 24),
(58, '', '2.4ghz', 'Inalambrico - USB', 'Optico', '', '', '1000dpi', 24),
(59, '', '', 'USB', '', '', '', 'Cable 1.8m - 6 botones transferencia usb 1000hz', 24),
(60, '', '1000hz', 'USB', '', '', '', '3500dpi - 3 botones programables -  Botones antideslizantes - 72g - Cable 2mts', 24),
(61, '', '', 'USB', 'Óptico', '', '', 'Ergonomico', 24),
(62, '', '', '', '16:9', '', '23"', 'Pantalla LED-Lit', 24),
(63, '', '', '', '16:9', '', '23.6"', 'Pantalla LED Full HD', 24),
(64, '', '', '', '16:9', '', '27"', 'Ultrafast 1ms', 24),
(65, '', '', '', '16:9', '', '21.5"', 'Pantalla Slim', 24),
(66, '', '', '', '16:9', '', '19.5"', 'Monitor Led', 24),
(67, '', '', '', '16:9', '', '20"', 'Monitor Led Lit', 24),
(68, '', '', '', '16:9', '', '19.5"', 'Monitor Led Lit', 24),
(69, '', '', '', 'Atx', '750 Watts', '', '20-24 Pines', 24),
(70, '', '', '', 'Micro Atx', '450 Watts', '', '20-24 Pines ventilador 12cm', 24),
(71, '', '', '', 'Atx', '1250 Watts', '', 'Modular 80 Plus Gold', 24),
(72, '', '', '', 'Atx', '1250 Watts', '', 'Semi Modular 80 Plus Gold', 24),
(73, '', '', '', 'Atx', '450 Watts', '', 'Doble Sata E Ide', 24),
(74, '', '', '', 'Atx', '450 Watts', '', 'Semi Modular 80 Plus Gold', 24),
(75, '', '', '', 'Atx', '500 Watts', '', '80 Plus Bronce Modular', 24),
(76, '', '', '', 'Atx', '350 Watts (Reales)', '', '80 Plus Bronce Modular', 24);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `descripcionproducto`
--

DROP TABLE IF EXISTS `descripcionproducto`;
CREATE TABLE IF NOT EXISTS `descripcionproducto` (
  `idProducto` int(11) DEFAULT NULL,
  `idMarca` int(11) DEFAULT NULL,
  `idDescripcion` int(11) DEFAULT NULL,
  `precio` double DEFAULT NULL,
`idDescripcionProducto` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=76 ;

--
-- Volcado de datos para la tabla `descripcionproducto`
--

INSERT INTO `descripcionproducto` (`idProducto`, `idMarca`, `idDescripcion`, `precio`, `idDescripcionProducto`) VALUES
(2, 5, 2, 53456, 1),
(3, 25, 3, 84000, 2),
(4, 6, 4, 204990, 3),
(5, 26, 5, 179900, 4),
(6, 28, 6, 212000, 5),
(7, 19, 7, 3360000, 6),
(8, 19, 8, 650000, 7),
(9, 26, 9, 220000, 8),
(10, 6, 10, 225000, 9),
(11, 29, 11, 204900, 10),
(12, 1, 12, 125900, 11),
(13, 30, 13, 137900, 12),
(14, 6, 14, 129900, 13),
(15, 1, 15, 209000, 14),
(16, 31, 16, 119000, 15),
(17, 5, 17, 94400, 16),
(18, 32, 18, 264000, 17),
(19, 5, 19, 134900, 18),
(20, 5, 20, 154900, 19),
(21, 4, 21, 384000, 20),
(22, 4, 22, 220000, 21),
(23, 5, 23, 199900, 22),
(24, 3, 24, 504900, 23),
(25, 4, 25, 304900, 24),
(26, 4, 26, 364900, 25),
(27, 3, 27, 159900, 26),
(28, 3, 28, 664900, 27),
(29, 3, 29, 230000, 28),
(30, 22, 30, 99000, 29),
(31, 21, 31, 71000, 30),
(32, 23, 32, 649000, 31),
(33, 33, 33, 17900, 32),
(34, 24, 34, 12999, 33),
(35, 24, 35, 15299, 34),
(36, 21, 36, 31900, 35),
(37, 23, 37, 289000, 36),
(38, 34, 38, 89900, 37),
(39, 21, 38, 30900, 38),
(40, 22, 40, 87900, 39),
(41, 3, 41, 664900, 40),
(42, 3, 42, 230000, 41),
(43, 3, 43, 664900, 42),
(44, 9, 44, 189000, 43),
(45, 9, 45, 139990, 44),
(46, 2, 46, 174900, 45),
(47, 13, 47, 654900, 46),
(48, 13, 48, 254000, 47),
(49, 9, 49, 124900, 48),
(50, 18, 50, 99000, 49),
(51, 18, 51, 70900, 50),
(52, 18, 52, 65900, 51),
(53, 18, 53, 78900, 52),
(54, 24, 54, 19900, 53),
(55, 24, 55, 13000, 54),
(56, 24, 56, 119999, 55),
(57, 24, 57, 39900, 56),
(58, 21, 58, 24900, 57),
(59, 21, 59, 45000, 58),
(60, 23, 60, 94900, 59),
(61, 24, 61, 7950, 60),
(62, 16, 62, 318500, 61),
(63, 2, 63, 382592, 62),
(64, 2, 64, 686000, 63),
(65, 2, 65, 343000, 64),
(66, 16, 66, 220500, 65),
(67, 14, 67, 166500, 66),
(68, 15, 68, 196020, 67),
(69, 8, 69, 24900, 68),
(70, 22, 70, 27990, 69),
(71, 19, 71, 539900, 70),
(72, 18, 72, 369900, 71),
(73, 24, 73, 25000, 72),
(74, 18, 74, 334900, 73),
(75, 19, 75, 234900, 74),
(76, 22, 76, 70000, 75);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

DROP TABLE IF EXISTS `marca`;
CREATE TABLE IF NOT EXISTS `marca` (
`idMarca` int(11) NOT NULL,
  `nombreMarca` varchar(20) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=35 ;

--
-- Volcado de datos para la tabla `marca`
--

INSERT INTO `marca` (`idMarca`, `nombreMarca`) VALUES
(1, 'Toshiba'),
(2, 'Asus'),
(3, 'Intel'),
(4, 'AMD'),
(5, 'Envidia'),
(6, 'Kingston'),
(7, 'Biostar'),
(8, 'Termaltek'),
(9, 'Asrock'),
(10, 'MSI'),
(11, 'Apple'),
(12, 'Acer'),
(13, 'Gigabyte'),
(14, 'HP'),
(15, 'Dell'),
(16, 'Samsung'),
(17, 'Lenovo'),
(18, 'Cooler Master'),
(19, 'Corsair'),
(20, 'EVGA'),
(21, 'Genius'),
(22, 'Logitech'),
(23, 'Razer'),
(24, 'variasMarcas'),
(25, 'Transcend '),
(26, 'Portatil'),
(28, 'Crucial'),
(29, 'G.skill'),
(30, 'Hitachi'),
(31, 'seagate'),
(32, 'Xfx'),
(33, 'Unitec'),
(34, 'Microsoft');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
`idProducto` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `idTipoProducto` int(11) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=77 ;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombre`, `idTipoProducto`) VALUES
(2, 'prubea', 5),
(3, 'Memoria RAM', 11),
(4, 'Memoria RAM', 11),
(5, 'Memoria RAM', 11),
(6, 'Mac Ram', 11),
(7, 'Dominator Platinum', 11),
(8, 'Vengeance Pro', 11),
(9, 'Gskill Ripjaws', 11),
(10, 'Hyperx Fury', 11),
(11, 'G.skill Ripjawsx ', 11),
(12, 'Disco duro', 1),
(13, 'Dig', 1),
(14, 'Disco duro', 1),
(15, 'Disco duro', 1),
(16, 'seagate Barracuda', 1),
(17, '8400 GS ', 6),
(18, 'Xfx R7 260x', 6),
(19, 'Nvidia Geforce Gt 52', 6),
(20, 'Gt610', 6),
(21, 'Ati Radeon Sapphire ', 6),
(22, 'Evga Geforce Gt 620', 6),
(23, 'Nvidia Geforce Evga ', 6),
(24, 'Intel Core I5 4440', 9),
(25, 'Amd Fx 6300 Vishera', 9),
(26, 'Amd Fx 6350', 9),
(27, 'Intel Celeron G1840', 9),
(28, 'Core I5 4690k', 9),
(29, 'Pentium G3258', 9),
(30, 'Teclado inalambrico', 4),
(31, 'Teclado Manticore Kb-g255', 4),
(32, 'Teclado Deathstalker Ultimate ', 4),
(33, 'Teclado Flexible', 4),
(34, 'Teclado Usb', 4),
(35, 'Teclado Kb-110x', 4),
(36, 'Teclado Kb G235 Gaming ', 4),
(37, 'Teclado Blackwidow Standar 2014', 4),
(38, 'Teclado Wedge Mobile', 4),
(39, 'Teclado Kb-g235', 4),
(40, 'Teclado G105 Gaming', 4),
(41, 'Procesador 4690k ', 9),
(42, 'Procesador Pentium G3258', 9),
(43, 'Procesador I5 4690k', 9),
(44, 'Board G41M', 5),
(45, 'Board', 5),
(46, 'Board H81m-c', 5),
(47, 'Board Z97x-ud7', 5),
(48, 'Board Ga-970a-ds3p', 5),
(49, 'Board H81m-vg4', 5),
(50, 'Disipador con Camara De Vapor Vertical', 8),
(51, 'Disipador De Refrigeracion Liquida', 8),
(52, 'Disipador Liquido', 8),
(53, 'Sistema Montaje Universal', 8),
(54, 'Mouse Inalambrico', 3),
(55, 'Mouse Usb', 3),
(56, 'Mouse Anker Vertical Ergonomic', 3),
(57, 'Mouse Vertical Wowpen', 3),
(58, 'Mouse Optico Ns-6000', 3),
(59, 'Mouse Genius Xscroll para pc', 3),
(60, 'Mouse Abyssus', 3),
(61, 'Mouse Tipo Genius', 3),
(62, 'Monitor Screen LED-Lit', 2),
(63, 'Asus VS247H-P', 2),
(64, 'ASUS VS278Q-P Full HD', 2),
(65, 'ASUS VS228H-P Full HD', 2),
(66, 'Monitor Samsung LED S20D300H', 2),
(67, 'HP Pavilion ', 2),
(68, 'Dell D2015H', 2),
(69, 'Fuente De Poder', 7),
(70, 'Fuente Logitech', 7),
(71, 'Fuente De Poder Corsair Rm850w', 7),
(72, 'Fuente De Poder Cooler Master V750', 7),
(73, 'Fuente De Poder Jyr Psu002', 7),
(74, 'Fuente Cooler Master V650', 7),
(75, 'Fuente Cx 500w M', 7),
(76, 'Fuente Logitech Atx 350', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoproducto`
--

DROP TABLE IF EXISTS `tipoproducto`;
CREATE TABLE IF NOT EXISTS `tipoproducto` (
`idTipoProducto` int(11) NOT NULL,
  `tipoProducto` varchar(30) DEFAULT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=12 ;

--
-- Volcado de datos para la tabla `tipoproducto`
--

INSERT INTO `tipoproducto` (`idTipoProducto`, `tipoProducto`) VALUES
(1, 'discoDuro'),
(2, 'monitor'),
(3, 'mouse'),
(4, 'teclado'),
(5, 'mainBoard'),
(6, 'tarjetaGrafica'),
(7, 'fuentePoder'),
(8, 'coolers'),
(9, 'procesador'),
(10, 'gabinete'),
(11, 'ram');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `descripcion`
--
ALTER TABLE `descripcion`
 ADD PRIMARY KEY (`idDescripcion`), ADD KEY `compatibilidad` (`compatibilidad`);

--
-- Indices de la tabla `descripcionproducto`
--
ALTER TABLE `descripcionproducto`
 ADD PRIMARY KEY (`idDescripcionProducto`), ADD KEY `idProducto` (`idProducto`), ADD KEY `idMarca` (`idMarca`), ADD KEY `idDescripcion` (`idDescripcion`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
 ADD PRIMARY KEY (`idMarca`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
 ADD PRIMARY KEY (`idProducto`), ADD KEY `idTipoProducto` (`idTipoProducto`);

--
-- Indices de la tabla `tipoproducto`
--
ALTER TABLE `tipoproducto`
 ADD PRIMARY KEY (`idTipoProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `descripcion`
--
ALTER TABLE `descripcion`
MODIFY `idDescripcion` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=77;
--
-- AUTO_INCREMENT de la tabla `descripcionproducto`
--
ALTER TABLE `descripcionproducto`
MODIFY `idDescripcionProducto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=76;
--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
MODIFY `idMarca` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=77;
--
-- AUTO_INCREMENT de la tabla `tipoproducto`
--
ALTER TABLE `tipoproducto`
MODIFY `idTipoProducto` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `descripcion`
--
ALTER TABLE `descripcion`
ADD CONSTRAINT `descripcion_ibfk_1` FOREIGN KEY (`compatibilidad`) REFERENCES `marca` (`idMarca`);

--
-- Filtros para la tabla `descripcionproducto`
--
ALTER TABLE `descripcionproducto`
ADD CONSTRAINT `descripcionproducto_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
ADD CONSTRAINT `descripcionproducto_ibfk_2` FOREIGN KEY (`idMarca`) REFERENCES `marca` (`idMarca`),
ADD CONSTRAINT `descripcionproducto_ibfk_3` FOREIGN KEY (`idDescripcion`) REFERENCES `descripcion` (`idDescripcion`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`idTipoProducto`) REFERENCES `tipoproducto` (`idTipoProducto`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
