create database db_farmacia_do_bem;
use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
tipoao varchar(255) not null,
ativo boolean not null,
primary key(id)
);
select*from tb_categoria;

alter table tb_categoria change tipoao tipo varchar(255);

insert tb_categoria (tipo,ativo) values ("Medicamentos",true);
insert tb_categoria (tipo,ativo) values ("Genéricos",true);
insert tb_categoria (tipo,ativo) values ("Beleza",true);
insert tb_categoria (tipo,ativo) values ("Mamãe e bebê",true);

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
quantidade int not null,
preco double not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);
select*from tb_produtos;

insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Ivermectina 6mg", 20, 17.79, 1);
insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Dipirona", 20, 10, 1);
insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Simeticona", 20, 4.99, 2);
insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Azelan Gel", 20, 59.69, 3);
insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Mascara de tratamento TRESEMMÉ", 10, 13.99, 3);
insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Creme Para Assaduras Huggies", 20, 29.99, 4);
insert tb_produtos(nome,quantidade,preco,categoria_id) values ("Composto Lácteo Nestlé Neslac Comfor", 20, 29.00, 4);

select nome,preco from tb_produtos where preco > 50;
select nome,preco from tb_produtos where preco between 3 and 60;
select nome from tb_produtos where nome like "%B%";
select * from tb_produtos where categoria_id = 4;
select nome,quantidade,preco,tb_categoria.tipo from tb_produtos inner join tb_categoria on 
tb_categoria.id = tb_produtos.categoria_id;