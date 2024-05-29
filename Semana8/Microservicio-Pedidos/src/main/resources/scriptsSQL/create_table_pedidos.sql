CREATE TABLE microalmacen.pedidos (
  cod_pedido INT NOT NULL AUTO_INCREMENT,
  producto VARCHAR(45) NOT NULL,
  unidades INT NOT NULL,
  precio_total DOUBLE NOT NULL,
  PRIMARY KEY (cod_pedido));