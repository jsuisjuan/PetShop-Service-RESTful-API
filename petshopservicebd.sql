create database petshopservicebd;
use petshopservicebd;

create table cliente (
	id_cliente integer primary key auto_increment,
	nome_cliente varchar(50) not null,
    telefone_cliente char(10) not null
);

create table animal (
	id_animal integer primary key auto_increment,
    nome_animal varchar(50) not null,
    idade_animal integer not null,
    peso_animal double not null,
    id_cliente integer not null,
    foreign key(id_cliente) references cliente(id_cliente) ON DELETE CASCADE ON UPDATE CASCADE
);

create table ordem_servico (
	id_ordem_servico int primary key auto_increment,
	id_cliente int not null,
    valor_servico double not null,
    hora_entrada int not null,
    hora_saida int not null,
    foreign key(id_cliente) references cliente(id_cliente) ON DELETE CASCADE ON UPDATE CASCADE
);

-- ----------------------------------------------------------------------------------------- INSERÇAO


select * from cliente;
insert into cliente (nome_cliente, telefone_cliente) values 
("Juan Carvalho", "98944-7795"), ("Flavio Silva", "98745-5466"),
("Ana Claudio", "98929-9994"), ("Julio Cesar", "98921-4906");

select * from animal;
insert into animal (nome_animal, idade_animal, peso_animal, id_cliente) values
("Jade", 1, 4.5, 1), ("Jujuba", 2, 6, 2), ("Fred", 8, 12, 3), ("Nina", 1, 2.5, 4),
("Mel", 3, 6, 2), ("Spike", 10, 7.7, 3), ("Lina", 1, 1.5, 3), ("Lola", 5, 9, 4),
("Nila", 5, 20, 4);

select * from ordem_servico; 
insert into ordem_servico (id_cliente, valor_servico, hora_entrada, hora_saida) values
(1, 45.90, 9, 11), (2, 100, 11, 15), (3, 130.90, 12, 17), (4, 165.35, 9, 18);