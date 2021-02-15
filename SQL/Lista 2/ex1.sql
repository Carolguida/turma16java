create database db_generation_game_online;

use db_generation_game_online;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao, ativo) values ("Vegetariana", true);
insert tb_categoria (descricao, ativo) values ("Normal", true);
insert tb_categoria (descricao, ativo) values ("Doce", true);
select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
preco double not null,
nome varchar(255) not null,
sabor varchar(255) not null,
tamanho int not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

alter table  tb_pizza change tamanho tamanho varchar(255);
select*from tb_pizza;

insert tb_pizza (preco,nome,sabor,tamanho,categoria_id) values ( 45.00, "Brasileira","Mussarela,Catupiry,Presunto,Tomate,Calabresa e Palmito", "Média", 2);
insert tb_pizza (preco,nome,sabor,tamanho,categoria_id) values ( 45.00, "Frango a moda do Chefe","Frango,Mussarela,Catupiry,Palmito e milho", "Média", 2);
insert tb_pizza (preco,nome,sabor,tamanho,categoria_id) values ( 55.00, "Mexicana","Mussarela,Calabresa,Pimenta, Catupiry,Cebola,Tomate e Pimentão", "Grande", 2);
insert tb_pizza (preco,nome,sabor,tamanho,categoria_id) values ( 55.00, "Portuguesa a moda","Mussarela,Calabresa,Ervilha,Presunto,Tomate,Calabresa e Cebola", "Grande", 2);
insert tb_pizza (preco,nome,sabor,tamanho,categoria_id) values ( 50.00, "Brigadeirão","Chocolate e granulado", "Média", 3);
insert tb_pizza (preco,nome,sabor,tamanho,categoria_id) values ( 55.00, "Delícia","Mussarela, Brócolis,Tomate,Catupiry", "Média", 1);

select * from tb_pizza where preco<=45;
select * from tb_pizza where preco between 29 and 60;
select nome from tb_pizza where nome like "%C%";
select  preco,nome,sabor,tamanho,tb_categoria.descricao from tb_pizza inner join tb_categoria on 
tb_categoria.id = tb_pizza.categoria_id;
select * from tb_pizza where categoria_id = "3";
