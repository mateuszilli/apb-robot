/* 
Scripts usados no back-end do projeto ABP;
Não há alguns scripts de relatórios, pois não conseguimos concluir esta etapa na programação;
'?' são parametros passados no codigo;
*/


-- INSERT na tabela LINHAS;
INSERT INTO LINHAS (ID_LINHA, ORDEM_LINHA, SENTIDO_LINHA, DESCRICAO_LINHA) VALUES (?, ?, ?, ?);

-- SELECT na tabela LINHAS;
SELECT * FROM LINHAS;

-- SELECT na tabela LINHAS filtrando pelo ID_LINHA;
SELECT * FROM LINHAS WHERE ID_LINHA = ?;

-- UPDATE na tabela LINHAS especificando o ID_LINHA;
UPDATE LINHAS SET ORDEM_LINHA = ?, SENTIDO_LINHA = ?, DESCRICAO_LINHA = ? WHERE ID_LINHA = ?;

-- DELETE na tabela LINHAS especificando o ID_LINHA;
DELETE FROM LINHAS WHERE ID_LINHA = ?;



-- INSERT na tabela LOCAIS;
INSERT INTO LOCAIS (ID_LOCAL, ID_LINHA, ORDEM_LOCAL, TIPO_LOCAL, DESCRICAO_LOCAL, HASH_LOCAL) VALUES (?, ?, ?, ?, ?, ?);

-- SELECT na tabela LOCAIS com JOIN na tabela LINHAS ordenando pelo campo ID_LOCAL da tabela LOCAIS;
SELECT LINHAS.ID_LINHA AS ID_LINHA LOC.ID_LOCAL,
       LOCAIS.ORDEM_LOCAL,
       LOCAIS.TIPO_LOCAL,
       LOCAIS.DESCRICAO_LOCAL,
       LOCAIS.HASH_LOCAL 
FROM LINHAS 
INNER JOIN LOCAIS ON LINHAS.ID_LINHA = LOCAIS.ID_LINHA 
ORDER BY LOCAIS.ID_LOCAL ASC;

-- SELECT na tabela RESERVAS com JOIN na tabela PALETES, filtrando o ID_RESERVA da tabela RESERVAS, e ordenação pela DH_VALIDADE_PALETE da tabela PALETES;
SELECT RESERVAS.ID_LOCAL AS ID_LOCAL_ATUAL,
       PALETES.ID_PALETE,
       PALETES.DESCRICAO_PALETE,
       PALETES.DH_VALIDADE_PALETE 
FROM RESERVAS 
INNER JOIN PALETES ON PALETES.ID_PALETE = RESERVAS.ID_PALETE 
WHERE RESERVAS.ID_RESERVA = ? 
ORDER BY PALETES.DH_VALIDADE_PALETE ASC;

-- SELECT na tabela LOCAIS filtrando pelo ID_LOCAL;
SELECT * FROM LOCAIS WHERE ID_LOCAL = ?;

-- DELETE na tabela LOCAIS especificando o ID_LOCAL;
DELETE FROM LOCAIS WHERE ID_LOCAL = ?;

-- UPDATE na tabela LOCAIS;
UPDATE LOCAIS SET ID_LINHA = ?, ORDEM_LOCAL = ?, TIPO_LOCAL = ?, DESCRICAO_LOCAL = ?, HASH_LOCAL = ? WHERE ID_LOCAL = ?



-- INSERT na tabela PALETES;
INSERT INTO PALETES (ID_PALETE, DESCRICAO_PALETE, DH_VALIDADE_PALETE) VALUES (?, ?, TO_DATE(?, 'DD-MM-YYYY'))

-- SELECT na tabela PALETES ordenando ID_PALETE;
SELECT ID_PALETE, 
       DESCRICAO_PALETE,
       TO_CHAR(DH_VALIDADE_PALETE,'DD-MM-YYYY') AS DH_VALIDADE_PALETE 
FROM PALETES 
ORDER BY ID_PALETE

-- SELECT na tabela PALETES filtrando pelo ID_PALETE;
SELECT ID_PALETE, 
       DESCRICAO_PALETE, 
       TO_CHAR(DH_VALIDADE_PALETE,'DD-MM-YYYY') AS DH_VALIDADE_PALETE 
FROM PALETES 
WHERE ID_PALETE = ?

-- UPDATE na tabela PALETES especificando o ID_PALETE;
UPDATE PALETES SET DESCRICAO_PALETE = ?, DH_VALIDADE_PALETE = (TO_DATE(?, 'DD-MM-YYYY')) WHERE ID_PALETE = ?

-- DELETE na tabela PALESTES especificando o ID_PALETE;
DELETE FROM PALETES WHERE ID_PALETE = ?



-- INSERT na tabela PALETES;
INSERT INTO RESERVAS (ID_RESERVA, ID_LOCAL, ID_PALETE) VALUES (?, ?, ?)

-- SELECT na tabela RESERVAS;
SELECT * FROM RESERVAS

-- SELECT na tabela RESERVAS filtrando pelo ID_RESERVA;
SELECT * FROM RESERVAS WHERE ID_RESERVA = ?

-- UPDATE na tabela RESERVAS especificando o ID_RESERVA;
UPDATE RESERVAS SET ID_LOCAL = ?, ID_PALETE = ? WHERE ID_RESERVA = ?

-- DELETE na tabela RESERVAS especificando o ID_RESERVA;
DELETE FROM RESERVAS WHERE ID_RESERVA = ?