CREATE DATABASE Billy_Blog;

USE Billy_Blog;

CREATE TABLE IF NOT EXISTS plataformas(
	id_plataforma int AUTO_INCREMENT PRIMARY KEY,
    nome_plataforma VARCHAR(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS usuarios(
	id_usuario int AUTO_INCREMENT PRIMARY KEY,
    nome_usuario VARCHAR(25) NOT NULL
);

CREATE TABLE Usuarios_Plataformas (
	id_plataforma INT,
    id_usuario INT
);

ALTER TABLE Usuarios_Plataformas ADD CONSTRAINT FOREIGN KEY (id_plataforma) REFERENCES plataformas (id_plataforma);
ALTER TABLE Usuarios_Plataformas ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);

CREATE TABLE IF NOT EXISTS privilegios(
	id_privilegio int AUTO_INCREMENT PRIMARY KEY,
    tipo_privilegio VARCHAR(25) NOT NULL
);

CREATE TABLE Usuarios_Privilegios (
	id_usuario INT,
    id_privilegio INT
);

ALTER TABLE Usuarios_Privilegios ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);
ALTER TABLE Usuarios_Privilegios ADD CONSTRAINT FOREIGN KEY (id_privilegio) REFERENCES privilegios (id_privilegio);

CREATE TABLE IF NOT EXISTS categorias(
	id_categoria int AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR(25) NOT NULL
);

CREATE TABLE IF NOT EXISTS posts(
	id_post int AUTO_INCREMENT PRIMARY KEY,
    id_plataforma INT,
    id_usuario INT,
    id_categoria INT,
    titulo VARCHAR(50) NOT NULL,
    conteudo VARCHAR(255) NOT NULL,
    dh_publicacao_post TIME NOT NULL
);

ALTER TABLE posts ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);
ALTER TABLE posts ADD CONSTRAINT FOREIGN KEY (id_plataforma) REFERENCES plataformas (id_plataforma);
ALTER TABLE posts ADD CONSTRAINT FOREIGN KEY (id_categoria) REFERENCES categorias (id_categoria);

CREATE TABLE IF NOT EXISTS visualizacoes (
	id_visualizacao int AUTO_INCREMENT PRIMARY KEY,
    id_post INT,
    id_usuario INT,
    dh_visualizacao TIME NOT NULL
);

ALTER TABLE visualizacoes ADD CONSTRAINT FOREIGN KEY (id_post) REFERENCES posts (id_post);
ALTER TABLE visualizacoes ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);

CREATE TABLE IF NOT EXISTS comentarios (
	id_comentario int AUTO_INCREMENT PRIMARY KEY,
    id_post INT,
    id_usuario INT,
    comentario VARCHAR(255) NOT NULL,
    dh_publicacao_comentario TIME NOT NULL
);

ALTER TABLE comentarios ADD CONSTRAINT FOREIGN KEY (id_post) REFERENCES posts (id_post);
ALTER TABLE comentarios ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);

CREATE TABLE Curtidas_Posts (
	id_usuario INT,
    id_post INT
);

ALTER TABLE Curtidas_Posts ADD CONSTRAINT FOREIGN KEY (id_post) REFERENCES posts (id_post);
ALTER TABLE Curtidas_Posts ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);

CREATE TABLE Curtidas_Comentarios (
	id_usuario INT,
    id_comentario INT
);

ALTER TABLE Curtidas_Comentarios ADD CONSTRAINT FOREIGN KEY (id_comentario) REFERENCES comentarios (id_comentario);
ALTER TABLE Curtidas_Comentarios ADD CONSTRAINT FOREIGN KEY (id_usuario) REFERENCES usuarios (id_usuario);



INSERT INTO plataformas(id, nome) VALUES (1, "Espiritualidade");

INSERT INTO usuarios(id, nome) VALUES (1, "Gustavo");