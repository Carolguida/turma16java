create database db_escola;

use db_escola;
create table tb_alunos(
id bigint auto_increment,
nome varchar (50) not null,
matricula int not null,
nota double not null,
curso varchar(50) not null,
primary key(id)
);

select * from tb_alunos;

insert into tb_alunos(nome,matricula,nota,curso) values ("Aline", 21001, 8.5, "Matemática");
insert into tb_alunos(nome,matricula,nota,curso) values ("Ana Clara", 21002, 5, "Ciências");
insert into tb_alunos(nome,matricula,nota,curso) values ("Antonio", 21003, 5.2, "Português");
insert into tb_alunos(nome,matricula,nota,curso) values ("Maria", 21004, 9.5, "Matemática");
insert into tb_alunos(nome,matricula,nota,curso) values ("Fernando", 21005, 7.8, "Matemática");
insert into tb_alunos(nome,matricula,nota,curso) values ("Carolina", 21006, 10, "Matemática");
insert into tb_alunos(nome,matricula,nota,curso) values ("Lucas", 21007, 2.0, "Matemática");
insert into tb_alunos(nome,matricula,nota,curso) values ("Mateus", 21008, 6.0, "Português");

select nome,nota from  tb_alunos where nota > 7;
select nome,nota from  tb_alunos where nota < 7;

update tb_alunos set nota = 10 where id = 8;
