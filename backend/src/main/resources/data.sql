INSERT INTO usuario(nome, cpf_cnpj) VALUES('Breno Sumaeta', '14');

INSERT INTO cidade(nome_cidade) VALUES('Manaus');
INSERT INTO cidade(nome_cidade) VALUES('Manacapuru');

INSERT INTO estado(nome_estado) VALUES('Amazonas');

INSERT INTO tb_usuario_cidade(cd_usuario, cidade_id) VALUES(1, 1);

INSERT INTO tb_cidade_estado(cidade_id, estado_id) VALUES(1, 1);
INSERT INTO tb_cidade_estado(cidade_id, estado_id) VALUES(2, 1);