create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nome_produto varchar (60) not null,
preco double not null,
cor varchar(20),
descricao varchar(255) not null,
marca varchar(60) not null,
primary key (id)
);
select * from tb_produtos;
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Caneca", 15.00, "Azul", "Utensílios domésticos", "Nadir");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Jogo de Panelas", 250.00, "Vermelho", "Utensílios domésticos", "Tramontina");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Jogo de talheres", 150.00, "Inox", "Utensílios domésticos", "Tramontina");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Pratos vidro", 20.00, "Transparente", "Utensílios domésticos", "Nadir");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Jogo de toalhas", 100.00, "Rosa", "Cama e banho", "Santista");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Lençol", 20.00, "Azul", "Cama e banho", "Santista");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Colcha", 200.00, "Amarelo", "Cama e banho", "Santista");
insert into tb_produtos(nome_produto,preco,cor,descricao,marca) values ("Travesseiro", 100.00, "Branco", "Cama e banho", "Ortobom");

select nome_produto,preco from  tb_produtos where preco > 500;
select nome_produto,preco from  tb_produtos where preco < 500;
update tb_produtos set cor = "Verde" where id = 6;