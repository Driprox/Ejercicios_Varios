create database Concesionario;
use  Concesionario;
create table if not exists Coches(
Matricula varchar(10),
Marca  varchar(10),
Modelo varchar(10),
Tipo_de_vehiculo varchar(10),
id_venta int primary key
)engine=innodb;
create table if not exists Clientes(
Nif varchar(10),
Nombre_cliente  varchar(10),
Apellido1 varchar(10),
Apellido2 varchar(10),
Telefono int,
Direccion varchar(20),
Email varchar(15),
id_compra int not null,
id_vendedor int primary key,
constraint compra foreign key (id_compra) references Coches(id_venta)
)engine=innodb;
create table if not exists Empleado(
Nif varchar(10)primary key,
Nombre  varchar(10),
Apellido1 varchar(10),
Apellido2 varchar(10),
Telefono int,
Direccion varchar(20),
Email varchar(15),
Sueldo int,
id_vendido int,
constraint venta foreign key (id_vendido) references Clientes(id_vendedor)
)engine=innodb;
use Concesionario;
insert into Clientes(Nif,Nombre_cliente,Apellido1,Apellido2,Telefono,Direccion,Email,id_compra,id_vendedor)
value('233424f','Marta','Carrasco','Lopez','2412313','Almeria','wfwffw@kkk.com','1','3'),
('345346h','Pedro','Garcia','Perez','24576913','Huelva','wferfw@khkk.com','2','4'),
('678855j','Lola','Juan','Juez','2666473','Jaen','wffefw@kkk.com','3','2'),
('242456f','Maria','Carrasco','Gomez','2478685','Cordoba','wfw@khkk.com','4','6'),
('345345o','Juan','Carrasco','Lopez','2447913','Cadiz','wffw@khkk.com','5','8'),
('878424f','Pablo','Jaime','Capa','25689313','Almeria','wf@khkkk.com','6','9');
insert into Empleado(Nif,Nombre,Apellido1,Apellido2,Telefono,Direccion,Email,Sueldo,id_vendido)
value
('24456f','Maria','Carrasco','Gomez','2478685','Madrid','wfw@khkk.com','1981','4'),
('23556556f','Manolo','Garcia','Gomez','757567','Sevilla','sddfg@khkk.com','1976','2'),
('23554686f','Juan','Carrasco','Gamez','24454565','Valencia','t4353w@khkk.com','1956','3');
insert into Coches(Matricula,Marca,Modelo,Tipo_de_Vehiculo,id_venta)
value('778812','Seat','Leon','Berlina','1'),
('67969812','Mazda','A','Berlina','2'),
('713525','Opel','B','Camion','3'),
('72513162','Mercedes','U','Furgoneta','4'),
('67961312','Mazda','R','Berlina','5'),
('723525','Opel','B','Camion','6'),
('7251362','Mercedes','M','Furgoneta','7'),
('6796232','Mazda','C','Berlina','8');
select Nif,Nombre,Apellido1,Direccion From Clientes
where Direccion like'Almeria';
select Nombre,Apellido1,Apellido2 from Empleado
where Sueldo >=1025;
select sum(Sueldo) from Empleado
where Direccion like 'Madrid';
select Nombre from Clientes inner join Coches on Clientes.id_compra = Coches.id_venta
where Marca like 'Seat' 
and Modelo like 'Leon';
select Nif,Nombre,Apellido1,Apellido2,Telefono,Direccion,Email,id_compra from clientes