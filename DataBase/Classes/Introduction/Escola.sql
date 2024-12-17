CREATE DATABASE escola;

USE escola;

CREATE TABLE alunos (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(200) NOT NULL,
    email VARCHAR(150) UNIQUE,
    idade INT,
    data_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP
)

-- Inserir alunos
INSERT INTO alunos (nome, email, idade)
VALUES ('Maria Silva', 'maria@email.com', '25');

INSERT INTO alunos (nome, email, idade) VALUES
('Joao Santos', 'joao@email.com', '20'),
('Ana Oliveira', 'ana-oliveira@emaiil.com', '18');

INSERT INTO alunos (nome, email, idade)
VALUES ('Sergio Silva','sergio@email.com','30');

-- Selecionar todos os alunos da tabela alunos
SELECT * FROM alunos;
SELECT idade FROM alunos;
SELECT * FROM alunos ORDER BY email;
SELECT * FROM alunos WHERE idade > 18;
SELECT * FROM alunos WHERE idade BETWEEN 18 AND 25;
SELECT * FROM alunos WHERE nome LIKE 'M%';  -- Começa com M
SELECT * FROM alunos WHERE email IS NOT NULL;

-- Altera a tabela de alunos
-- Adicionei a tabela Telefone

ALTER TABLE alunos
ADD COLUMN telefone VARCHAR(15);

-- Modificar tipo de coluna existente

ALTER TABLE alunos
MODIFY COLUMN email VARCHAR(250);

-- Renomear Coluna

ALTER TABLE alunos
CHANGE COLUMN telefone contato VARCHAR(15);

-- Remover uma coluna

ALTER TABLE alunos
DROP COLUMN telefone;

-- Deletar um registro expecfico

-- DELETE FROM alunos;

-- Operadores de comparacao

SELECT * FROM alunos WHERE idade BETWEEN 20 AND 28;

-- LIKE (Busca por termo)

SELECT * FROM alunos WHERE nome LIKE 'M%';

SELECT COUNT(*) as 'total alunos' from alunos;

-- Altera a tabela de alunos
-- Adicionei a tabela Telefone

ALTER TABLE alunos
ADD COLUMN telefone VARCHAR(15);

-- Modificar tipo de coluna existente

ALTER TABLE alunos
MODIFY COLUMN email VARCHAR(250);

-- Renomear Coluna

ALTER TABLE alunos
CHANGE COLUMN telefone contato VARCHAR(15);

-- Remover uma coluna

ALTER TABLE alunos
DROP COLUMN telefone;

-- Deletar um registro expecfico

DELETE FROM alunos;

-- Operadores de comparacao

SELECT * FROM alunos WHERE idade BETWEEN 20 AND 28;

-- LIKE (Busca por termo)

SELECT * FROM alunos WHERE nome LIKE 'M%';

-- Operadores lógicos

SELECT * FROM alunos WHERE (idade > 25) AND (email = 'maria.soares@email.com.br');

SELECT * FROM alunos WHERE (idade < 30) OR nome LIKE 'M%';

SELECT * FROM alunos WHERE NOT nome LIKE 'M%';

-- Funcoes de agregacao

SELECT COUNT(*) as total_alunos FROM alunos;

SELECT AVG(idade) as media_idade FROM alunos;

SELECT MAX(idade) as idade_maxima FROM alunos;

SELECT MIN(idade) as idade_minima FROM alunos;

SELECT SUM(idade) as soma_idades FROM alunos;

SELECT idade, COUNT(*) as total_alunos
FROM alunos
GROUP BY idade;

SELECT nome, idade
FROM alunos
WHERE idade > (SELECT AVG(idade) FROM alunos);

SELECT * FROM alunos;

UPDATE alunos
SET idade = '31'
WHERE id = 8;

-- ---------------- Class 3 ---------------------
CREATE TABLE cursos (
	id INT PRIMARY KEY AUTO_INCREMENT,
    nome_curso VARCHAR(100),
    duracao INT
);

INSERT INTO cursos(nome_curso, duracao)
VALUES ('Algoritmos', 100);

SELECT * FROM matriculas

CREATE TABLE matriculas (
	id INT PRIMARY KEY AUTO_INCREMENT,
    aluno_id INT,
    curso_id INT, 
    data_matricula DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (aluno_id) REFERENCES alunos(id),
    FOREIGN KEY (curso_id) REFERENCES cursos(id)
);

SELECT * FROM alunos;

SELECT alunos.nome, alunos.id as 'ID alunos',
 cursos.nome_cursos, cursos.id as 'ID cursos',
 matriculas.id as 'ID MATRICULA'
FROM matriculas
INNER JOIN alunos ON matriculas.aluno_id = alunos.id
INNER JOIN cursos ON matriculas.curso_id = cursos.id;

-- as eh tipo um nome q vc esta dando para mostrar
SELECT a.nome as 'nome aluno', c.nome
FROM alunos a
INNER JOIN matriculas m ON a.id = m.alunos_id
INNER JOIN cursos c ON m.cursos.id = c.id;