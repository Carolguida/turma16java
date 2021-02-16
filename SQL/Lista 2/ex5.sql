create database db_construindo_a_nossa_vida;
use db_construindo_a_nossa_vida;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
ativo boolean not null,
primary key(id)
);

select * from tb_categoria;
insert tb_categoria (tipo,ativo) values ("Elétrica",true);
insert tb_categoria (tipo,ativo) values ("Hidráulica",true);
insert tb_categoria (tipo,ativo) values ("Tintas e Acessórios",true);
insert tb_categoria (tipo,ativo) values ("Máquinas e Ferramentas",true);
insert tb_categoria (tipo,ativo) values ("Materiais de Construção",true);

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
estoque int not null,
tamanho int not null,
preco double not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_produtos;
alter table tb_produtos change tamanho tamanho varchar(255);

insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Módulo Interruptor",20,1,37.90,1);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Plugue Macho",20,1,9.43,1);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Registro De Gaveta",20,"Dn40 1.1/2",9.43,2);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Isolante Térmico",20,"15X5cm",9.79,2);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Tinta Acetinada",20,"900 mL",64.90,3);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Rolo para Pintura",20,"9 cm",7.630,3);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Tinta Spray",20,"350 mL",24.90,3);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Colher pedreiro",20,"1 un",29.90,4);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Escada ",20,"12 degraus",349.90,5);
insert tb_produtos (nome,estoque,tamanho,preco,categoria_id) values ("Argamassa",20,"20 Kg",39.99,5);

select * from tb_produtos where preco > 50;
select * from tb_produtos where preco between 3 and 60;
select * from tb_produtos where nome like "%C%";
select  nome, estoque,tamanho,preco, tb_categoria.tipo, tb_categoria.ativo from tb_produtos inner join tb_categoria on 
tb_categoria.id = tb_produtos.categoria_id;
-- select * from tb_produtos where categoria_id = 3;
-- select * from tb_produtos inner join tb_categoria on tb_categoria.id = tb_produtos.id;
select tb_categoria.tipo, tb_produtos.nome from tb_categoria inner join tb_produtos on tb_categoria.id = tb_produtos.categoria_id
where tb_produtos.categoria_id = 3;	

