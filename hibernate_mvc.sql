CREATE DATABASE IF NOT EXISTS `hibernate_mvc`;
USE `hibernate_mvc`;

DROP TABLE IF EXISTS `marca`;
CREATE TABLE IF NOT EXISTS `marca` (
  `id_marca` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `presentacion`;
CREATE TABLE IF NOT EXISTS `presentacion` (
  `id_presentacion` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `proveedor`;
CREATE TABLE IF NOT EXISTS `proveedor` (
  `id_proveedor` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(100) NOT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `zona`;
CREATE TABLE IF NOT EXISTS `zona` (
  `id_zona` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(50) NOT NULL
) ENGINE=InnoDB;

DROP TABLE IF EXISTS `producto`;
CREATE TABLE IF NOT EXISTS `producto` (
  `id_producto` int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_marca` int(11) NOT NULL,
  `id_presentacion` int(11) NOT NULL,
  `id_proveedor` int(11) NOT NULL,
  `id_zona` int(11) NOT NULL,
  `codigo` int(11) NOT NULL,
  `descripcion_producto` VARCHAR(100) NOT NULL,
  `precio` double NOT NULL,
  `stock` int(11) NOT NULL,
  `iva` int(11) NOT NULL,
  `peso` double NOT NULL,
  CONSTRAINT `FK_producto_marca` FOREIGN KEY (`id_marca`) REFERENCES `marca` (`id_marca`),
  CONSTRAINT `FK_producto_presentacion` FOREIGN KEY (`id_presentacion`) REFERENCES `presentacion` (`id_presentacion`),
  CONSTRAINT `FK_producto_proveedor` FOREIGN KEY (`id_proveedor`) REFERENCES `proveedor` (`id_proveedor`),
  CONSTRAINT `FK_producto_zona` FOREIGN KEY (`id_zona`) REFERENCES `zona` (`id_zona`)
) ENGINE=InnoDB;

INSERT INTO marca (descripcion) VALUES ('Marca 1');
INSERT INTO presentacion (descripcion) VALUES ('Presentacion 1');
INSERT INTO proveedor (descripcion) VALUES ('Proveedor 1');
INSERT INTO zona (descripcion) VALUES ('Zona 1');
INSERT INTO producto (id_marca, id_presentacion, id_proveedor, id_zona, codigo, descripcion_producto, precio, stock, iva, peso) VALUES (1,1,1,1,1,'Descripcion de producto 1', 120, 10, 12, 20.90);
