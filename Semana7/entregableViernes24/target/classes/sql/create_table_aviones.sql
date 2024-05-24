CREATE TABLE aviones (
    id_avion VARCHAR(10) PRIMARY KEY,
    modelo VARCHAR(50) NOT NULL,
    fabricante VARCHAR(50) NOT NULL,
    numero_serie VARCHAR(50) NOT NULL UNIQUE,
    capacidad_pasajeros INT NOT NULL,
    tipo_avion VARCHAR(50) NOT NULL,
    estado VARCHAR(50) NOT NULL,
    horas_vuelo INT NOT NULL,
    aerolinea VARCHAR(50) NOT NULL
);