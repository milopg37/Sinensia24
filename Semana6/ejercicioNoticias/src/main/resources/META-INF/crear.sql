CREATE TABLE noticias (titulo VARCHAR(255) NOT NULL,autor VARCHAR(255) NOT NULL,fecha VARCHAR(255) ,PRIMARY KEY (titulo));
CREATE TABLE comentarios (id VARCHAR(255) NOT NULL,texto VARCHAR(255) NOT NULL,autor VARCHAR(255), noticia_titulo VARCHAR(255), PRIMARY KEY (id));
ALTER TABLE comentarios ADD CONSTRAINT comentarios_fk0 FOREIGN KEY (noticia_titulo) REFERENCES noticias(titulo);