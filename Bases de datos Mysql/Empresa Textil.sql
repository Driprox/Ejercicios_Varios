create database Empresa_Textil;
use  Empresa_Textil;
create table if not exists Cliente(
Dni char(15) primary key,
Nombre_cliente  varchar(10),
Apellidos varchar(20),
Fecha_nacimiento date,
Telefono int
)engine=innodb;
create table if not exists Producto(
Codigo char(15) primary key,
Nombre_producto varchar(10),
Precio real
)engine=innodb;
create table if not exists Proveedor(
Nif char(15) primary key,
Nombre_proveedor  varchar(10),
Direccion varchar(20)
)engine=innodb;
create table if not exists Compra(
id int primary key,
id_cliente char(15),
id_producto char(15),
constraint compra1 foreign key (id_cliente) references Cliente(Dni),
constraint compra2 foreign key (id_producto) references Producto(Codigo)
)engine=innodb;
create table if not exists Provision(
id int primary key,
id_proveedor char(15),
id_producto char(15),
constraint provision foreign key (id_proveedor) references Proveedor(Nif),
constraint provision1 foreign key (id_producto) references Producto(Codigo)
)engine=innodb;
use Empresa_Textil;
insert into Cliente(Dni,Nombre_cliente,Apellidos,Telefono,Fecha_nacimiento)
value('233424f','Marta','Carrasco_Lopez','2412313','1974-01-01'),
('345346h','Pedro','Garcia_Perez','24576913','1967-01-07'),
('12563465F','Lola','Juan_Juez','2666473','1986-01-09'),
('242456f','Maria','Carrasco_Gomez','2478685','1965-01-26'),
('345345o','Juan','Carrasco_Lopez','2447913','1989-01-14');
insert into Producto(Codigo,Nombre_producto,Precio)
value('C145','A','123'),
('C124','Ac','3'),
('C125','B','28'),
('C09','C','45'),
('C83','F','200'),
('C76','W','92'),
('C103','R','98'),
('C81','Y','48'),
('C50','Z','12'),
('C200','H','154');
insert into Proveedor(Nombre_proveedor,Nif,Direccion)
value('CA','27275621X','LISBOA'),
('Bc','75268547G','EEUU'),
('PO','2345645J','ROMA'),
('COP','7526858O','Sevilla'),
('SAS','7526859L','Malaga');
insert into Compra(id,id_cliente,id_producto)
value('1','233424f','C124'),
('2','345346h','C83'),
('3','12563465F','C200'),
('4','242456f','C124'),
('5','345345o','C125'),
('6','12563465F','C125');
insert into Provision(id,id_proveedor,id_producto)
value('1','27275621X','C124'),
('2','7526858O','C83'),
('3','2345645J','C200'),
('4','27275621X','C50'),
('5','75268547G','C125'),
('6','7526859L','C103'),
('7','75268547G','C76');
select Telefono,Nombre_cliente from Cliente inner join Compra on Cliente.Dni = Compra.id_cliente
where id_producto like'C124';
select Nombre_producto,Codigo from Producto inner join Provision on Producto.Codigo = Provision.id_producto
where id_proveedor like'27275621X';
select distinct Nombre_proveedor from Proveedor 
inner join Provision on Proveedor.Nif = Provision.id_proveedor 
inner join Producto on Provision.id_producto = Producto.Codigo
inner join Compra on Producto.Codigo = Compra.id_producto 
where id_cliente like'12563465F';
select count(*) as Contador from Cliente inner Join Compra on Cliente.Dni = Compra.id_cliente
where id_producto like 'C125';
select Codigo,max(Precio)from Producto;
select avg(Precio) as media from Producto inner join Provision on Producto.Codigo = Provision.id_producto
where id_proveedor like'75268547G';