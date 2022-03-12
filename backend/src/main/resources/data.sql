INSERT INTO usuario(nome) VALUES('Breno Sumaeta');

INSERT INTO cidade(nome_cidade) VALUES('Manaus');

INSERT INTO estado(nome_estado) VALUES('Amazonas');

INSERT INTO tb_usuario_cidade(cd_usuario, cidade_id) VALUES(1, 1);

INSERT INTO tb_cidade_estado(cidade_id, estado_id) VALUES(1, 1);