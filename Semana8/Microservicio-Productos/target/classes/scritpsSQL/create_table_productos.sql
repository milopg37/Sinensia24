CREATE TABLE microalmacen.productos (
  cod_producto INT NOT NULL AUTO_INCREMENT,
  nombre_producto VARCHAR(45) NOT NULL,
  stock INT NOT NULL,
  precio DOUBLE NOT NULL,
  pedido INT NOT NULL,
  PRIMARY KEY (cod_producto));