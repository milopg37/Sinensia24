CREATE TABLE agenciaviajes.hoteles (
  id_hotel INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(45) NOT NULL,
  categoria VARCHAR(45) NOT NULL,
  precio DOUBLE NOT NULL,
  disponible TINYINT NOT NULL,
  PRIMARY KEY (id_hotel));