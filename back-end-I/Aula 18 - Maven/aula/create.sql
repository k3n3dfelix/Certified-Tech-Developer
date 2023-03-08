create table if not exists endereco (
   id int auto_increment primary key,
   rua varchar (36),
   numero varchar (12),
   cidade varchar (36),
   bairro varchar (36)
);

create table if not exists paciente (
   id int auto_increment primary key,
   nome varchar (36),
   sobrenome varchar (12),
   rg varchar (36),
   data_nascimento date,
   endereco_id int
);

CREATE TABLE IF NOT EXISTS dentista (
id int auto_increment primary key,
nome varchar(32),
sobrenome varchar(32),
matricula varchar(32));
