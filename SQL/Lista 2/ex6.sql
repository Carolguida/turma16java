create database db_cursoDaMinhaVida;
use db_cursoDaMinhaVida;

create table tb_categoria(
id bigint auto_increment,
tipo varchar(255) not null,
modalidade varchar(255) not null,
ativo boolean not null,
primary key(id)
);

select * from tb_categoria;


insert tb_categoria (tipo,ativo,modalidade) values ("Java",true, "EAD");
insert tb_categoria (tipo,ativo,modalidade) values ("PHP",true,"EAD");
insert tb_categoria (tipo,ativo,modalidade) values ("Banco de dados",true,"EAD");
insert tb_categoria (tipo,ativo,modalidade) values ("Sistemas de informação",true,"Presencial");
insert tb_categoria (tipo,ativo,modalidade) values ("Ciência da computação",true, "Presencial");

create table tb_curso(
id bigint auto_increment,
preco double not null,
duracao varchar(255) not null,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

select * from tb_curso;

insert tb_curso (preco,duracao,categoria_id) values (1500.00, "3 meses", 1);
insert tb_curso (preco,duracao,categoria_id) values (750.00, "3 meses", 1);
insert tb_curso (preco,duracao,categoria_id) values (800, "3 meses", 2);
insert tb_curso (preco,duracao,categoria_id) values (900.00, "3 anos", 4);
insert tb_curso (preco,duracao,categoria_id) values (950.00, "3 anos", 5);

select * from tb_curso where preco > 50;
select * from tb_curso where preco between 3 and 60;
select * from tb_categoria where tipo like "%C%";
select  preco, duracao, tb_categoria.tipo, tb_categoria.modalidade from tb_curso inner join tb_categoria on 
tb_categoria.id = tb_curso.categoria_id;
select * from tb_curso where categoria_id = 3;

