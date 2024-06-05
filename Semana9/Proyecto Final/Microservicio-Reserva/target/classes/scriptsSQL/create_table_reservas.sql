CREATE TABLE agenciaviajes.reservas (
  id_reserva INT NOT NULL AUTO_INCREMENT,
  nombre_cliente VARCHAR(45) NOT NULL,
  dni VARCHAR(45) NOT NULL,
  id_hotel INT NOT NULL,
  id_vuelo INT NOT NULL
  PRIMARY KEY (id_reserva));