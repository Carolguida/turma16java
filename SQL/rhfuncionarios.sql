select * from tb_funcionarios;
alter table  tb_funcionarios change formacao formacao varchar(255);
alter table  tb_funcionarios change setor setor varchar(255);
update tb_funcionarios set formacao =  "Administração" where id = 4;

insert into tb_funcionarios(nome,matricula,setor,formacao,salario) values ("Carolina Guida", 2101, "Produção", "Engenheiro Químico", 5000);
insert into tb_funcionarios(nome,matricula,setor,formacao,salario) values ("Fernanda Almeida",2102, "P&D", "Eng. de Alimentos", 4000);
insert into tb_funcionarios(nome,matricula,setor,formacao,salario) values ("Luiza Mel",2103, "Controle de Qualidade", "Eng. de Alimentos", 3000);
insert into tb_funcionarios(nome,matricula,setor,formacao,salario) values ("Alessandra Ambrosio",2104, "Administração", "Admistradora", 4500);
insert into tb_funcionarios(nome,matricula,setor,formacao,salario) values ("Fernando Pessoa",2105, "Vendas", "Administração", 2000);

select nome, salario from  tb_funcionarios where salario > 2000;
select nome, salario from  tb_funcionarios where salario < 2000;