drop database if exists projetoGC1;
create database projetoGC1;

use projetoGC1;

create table if not exists Cliente(
	id int not null auto_increment,
    nome varchar(100) not null,
    idade int not null,
    altura float not null,
    cpf long not null,
    dataNasc date,
    primary key(id)
);

select * from Cliente;
