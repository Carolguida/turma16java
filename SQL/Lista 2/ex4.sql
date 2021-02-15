create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);
select * from tb_categoria;
insert tb_categoria(descricao,ativo) values ("Bovino",true);
insert tb_categoria(descricao,ativo) values ("Suína",true);
insert tb_categoria(descricao,ativo) values ("Aves",true);
insert tb_categoria(descricao,ativo) values ("Embutidos",true);
insert tb_categoria(descricao,ativo) values ("Acessórios",true);

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco double not null,
quantidade int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

select * from tb_produtos;

insert tb_produtos (nome,preco,quantidade,categoria_id) values ("Picanha", 45.00, 40, 1);
insert tb_produtos (nome,preco,quantidade,categoria_id) values ("Asinha", 25.00, 40, 3);
insert tb_produtos (nome,preco,quantidade,categoria_id) values ("Costelinha", 35.00, 40, 2);
insert tb_produtos (nome,preco,quantidade,categoria_id) values ("Peito de Frango", 15.00, 40, 3);
insert tb_produtos (nome,preco,quantidade,categoria_id) values ("Linguiça Calabresa", 10.00, 30, 4);
insert tb_produtos (nome,preco,quantidade,categoria_id) values ("Medalhão", 47.00, 40, 1);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco between 3 and 60;
select nome from tb_produtos where nome like "%C%";
select  nome, preco, quantidade, tb_categoria.descricao from tb_produtos inner join tb_categoria on 
tb_categoria.id = tb_produtos.categoria_id;

select*from tb_produtos where categoria_id = 2;



