create database academia;
use academia;
create table if not exists alumno(
id int primary key auto_increment,
nombre  varchar(10),
apellido varchar(10),
curso varchar(25),
edad varchar(10),
nasignaturas int 
)engine=innodb;
SELECT * FROM academia.alumno;