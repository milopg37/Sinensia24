CREATE TABLE agenciaviajes.vuelos (
  id_vuelo INT NOT NULL AUTO_INCREMENT,
  companhia VARCHAR(45) NOT NULL,
  fecha_vuelo DATE NOT NULL,
  precio DOUBLE NOT NULL,
  plazas INT NULL,
  PRIMARY KEY (id_vuelo));