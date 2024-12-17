CREATE DATABASE livraria;

USE livraria;

CREATE TABLE professores (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome_completo VARCHAR(100) NOT NULL,
    cpf VARCHAR(14) UNIQUE,
    data_nascimento DATE,
    email_institucional VARCHAR(100) UNIQUE,
    telefone VARCHAR(15),
    area_atuacao VARCHAR(100),
    titulacao ENUM('Graduacao', 'Mestrado', 'Doutorado'),
    data_admissao DATETIME DEFAULT CURRENT_TIMESTAMP,
    registro_profissional VARCHAR(100) NULL,
    status ENUM('Ativo', 'Inativo') DEFAULT 'Ativo'
)

CREATE TABLE autores(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome_completo VARCHAR(150) NOT NULL,
    nome_artistico VARCHAR(100) NULL,
    nacionalidade VARCHAR(50),
    data_nascimento DATE,
    biografia VARCHAR(text),
    email_contato VARCHAR(100),
    area_principal VARCHAR(100),
    status ENUM('Ativo', 'Inativo') DEFAULT 'Ativo'
)

 -- ALTER TABLE autores RENAME COLUMN nascionalidade TO nacionalidade;


CREATE TABLE categorias(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome_categoria VARCHAR(100) NOT NULL,
    codigo_categoria VARCHAR(20) UNIQUE,
    descricao VARCHAR(text),
    categoria_pai_id INT,
    FOREIGN KEY (categoria_pai_id) REFERENCES categorias(id),
    status ENUM ('Ativa', 'Inativa') DEFAULT 'Ativa'
)

CREATE TABLE editoras(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome_editora VARCHAR(150) NOT NULL,
    cnpj VARCHAR(18) UNIQUE,
    razao_social VARCHAR(200),
    endereco VARCHAR(200),
    telefone_comercial VARCHAR(15),
    email_comercial VARCHAR(100),
    site VARCHAR(100),
    nome_contato VARCHAR(100),
    telefone_contato VARCHAR(15),
    data_cadastro DATE,
    status ENUM('Ativa' , 'Inativa')
)
    
CREATE TABLE livros(
	id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(200) NOT NULL,
    subtitulo VARCHAR(200) NULL,
    editora_id INT,
    FOREIGN KEY (editora_id) REFERENCES editoras (id),
    ano_publicacao INT,
    edicao VARCHAR(50),
    numero_paginas INT,
    sinopse VARCHAR(text),
    capa_url VARCHAR(255),
    preco DECIMAL(10, 2),
    quantidade_estoque INT,
    status ENUM('Disponivel', 'Indisponivel'),
    data_cadastro TIMESTAMP
)

-- ALTER TABLE livros
-- ADD subtitulo VARCHAR(200) NULL;

CREATE TABLE livros_autores(
	livro_id INT,
    FOREIGN KEY (livro_id) REFERENCES livros (id),
    autor_id INT,
    FOREIGN KEY (autor_id) REFERENCES autores (id)
)

CREATE TABLE livros_categorias(
	livro_id INT,
    FOREIGN KEY (livro_id) REFERENCES livros (id),
    categoria_id INT,
    FOREIGN KEY (categoria_id) REFERENCES categorias (id)
)
    
-- Inserts type like shit fr fr oh nah

-- Inserção de Professores

INSERT INTO professores 
(nome_completo, cpf, data_nascimento, email_institucional, 
telefone, area_atuacao, titulacao, data_admissao, 
registro_profissional, status) 
VALUES 
('João Silva Santos', '123.456.789-10', '1980-05-15', 
'joao.santos@universidade.edu.br', '(11) 98765-4321', 
'Literatura Brasileira', 'Doutorado', '2010-03-01', 
'REG-123456', 'Ativo'),

('Maria Oliveira Pereira', '987.654.321-00', '1975-09-22', 
'maria.pereira@universidade.edu.br', '(21) 97654-3210', 
'História da Literatura', 'Mestrado', '2015-08-15', 
'REG-654321', 'Ativo'),

('Carlos Eduardo Rocha', '456.789.123-45', '1985-11-10', 
'carlos.rocha@universidade.edu.br', '(31) 96543-2109', 
'Linguística', 'Graduação', '2018-02-01', 
'REG-789012', 'Inativo');

-- Inserção de Autores

INSERT INTO autores 
(nome_completo, nome_artistico, nacionalidade, 
data_nascimento, biografia, email_contato, 
area_principal, status) 
VALUES 
('Machado de Assis', 'Machado de Assis', 'Brasileiro', 
'1839-06-21', 'Considerado um dos maiores escritores brasileiros', 
'machado@literatura.com.br', 'Romance', 'Ativo'),

('Jorge Amado', 'Jorge Amado', 'Brasileiro', 
'1912-08-10', 'Importante escritor modernista brasileiro', 
'jorge@literatura.com.br', 'Romance Regional', 'Ativo'),

('Paulo Coelho', 'Paulo Coelho', 'Brasileiro', 
'1947-08-24', 'Autor de best-sellers internacionais', 
'paulo@literatura.com.br', 'Romance Contemporâneo', 'Ativo');

-- Inserção de Categorias

-- Step 1: Insert initial records without dependencies
INSERT INTO categorias 
(nome_categoria, codigo_categoria, descricao, categoria_pai_id, status) 
VALUES 
('Ficção', 'CAT-FIC', 'Obras de ficção literária', NULL, 'Ativa'),
('Poesia', 'CAT-POE', 'Obras poéticas', NULL, 'Ativa');

-- Step 2: Use a user-defined variable to store the ID of 'Ficção'
SET @id_ficcao = (SELECT id FROM categorias WHERE nome_categoria = 'Ficção');

-- Step 3: Insert 'Romance' using the stored variable
INSERT INTO categorias 
(nome_categoria, codigo_categoria, descricao, categoria_pai_id, status)
VALUES 
('Romance', 'CAT-ROM', 'Obras de romance', @id_ficcao, 'Ativa');

-- Step 4: Use a user-defined variable to store the ID of 'Romance'
SET @id_romance = (SELECT id FROM categorias WHERE nome_categoria = 'Romance');

-- Step 5: Insert 'Romance Brasileiro' using the stored variable
INSERT INTO categorias 
(nome_categoria, codigo_categoria, descricao, categoria_pai_id, status)
VALUES 
('Romance Brasileiro', 'CAT-ROM-BR', 'Romances de autores brasileiros', @id_romance, 'Ativa');

-- Inserção de Editoras

INSERT INTO editoras 
(nome_editora, cnpj, razao_social, endereco, 
telefone_comercial, email_comercial, site, 
nome_contato, telefone_contato, data_cadastro, status) 
VALUES 
('Editora Moderna', '12.345.678/0001-90', 'Moderna Ltda', 
'Rua das Editoras, 100 - São Paulo, SP', 
'(11) 3333-4444', 'contato@modernaedicoes.com.br', 
'www.modernaedicoes.com.br', 'Ana Souza', 
'(11) 99999-8888', '2020-01-15', 'Ativa'),

('Companhia das Letras', '98.765.432/0001-10', 'Companhia das Letras Editora', 
'Av. Editores, 500 - São Paulo, SP', 
'(11) 2222-3333', 'contato@companhiadasletras.com.br', 
'www.companhiadasletras.com.br', 'Carlos Oliveira', 
'(11) 98888-7777', '2015-05-20', 'Ativa');

-- Inserção de Livros

INSERT INTO livros 
(titulo, subtitulo, editora_id, ano_publicacao, 
edicao, numero_paginas, sinopse, capa_url, 
preco, quantidade_estoque, status, data_cadastro) 
VALUES 
('Dom Casmurro', 'Um Clássico da Literatura Brasileira', 
(SELECT id FROM editoras WHERE nome_editora = 'Editora Moderna'), 
1899, '50ª Edição', 250, 
'Romance clássico de Machado de Assis que explora temas como ciúme e traição', 
'https://exemplo.com/dom-casmurro.jpg', 
45.90, 100, 'Disponível', NOW()),

('Capitães da Areia', 'Romance Sobre Crianças Abandonadas', 
(SELECT id FROM editoras WHERE nome_editora = 'Companhia das Letras'), 
1937, '30ª Edição', 300, 
'Obra que retrata a realidade social de crianças marginalizadas', 
'https://exemplo.com/capitaes-areia.jpg', 
55.00, 75, 'Disponível', NOW());

-- Inserção na Tabela Intermediária Livro_Autores

INSERT INTO livros_autores (livro_id, autor_id)
VALUES 
((SELECT id FROM livros WHERE titulo = 'Dom Casmurro'), 
 (SELECT id FROM autores WHERE nome_completo = 'Machado de Assis')),

((SELECT id FROM livros WHERE titulo = 'Capitães da Areia'), 
 (SELECT id FROM autores WHERE nome_completo = 'Jorge Amado'));

-- Inserção na Tabela Intermediária Livro_Categorias
INSERT INTO livros_categorias (livro_id, categoria_id)
VALUES 
((SELECT id FROM livros WHERE titulo = 'Dom Casmurro'), 
 (SELECT id FROM categorias WHERE nome_categoria = 'Romance Brasileiro')),

((SELECT id FROM livros WHERE titulo = 'Capitães da Areia'), 
 (SELECT id FROM categorias WHERE nome_categoria = 'Romance Brasileiro'));



-- Agora os selects


