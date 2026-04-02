CREATE DATABASE login;
USE login;
CREATE TABLE usuarios(
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL,
    senha VARCHAR(255) NOT NULL
);

INSERT INTO usuarios SET nome = "Admin", senha = 123 , email = "adimin@gmail.com"