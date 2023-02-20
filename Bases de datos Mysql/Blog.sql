create database blog;
use blog;
create table if not exists entrada(
 id_entr int primary key auto_increment ,
titulo varchar(20),
contenido varchar(20),
enlace varchar(25),
fecha date
)engine=innodb;
create table if not exists comentario(
id_comen int primary key auto_increment ,
email varchar(20),
comentario varchar(60),
aprobado boolean,
id_entr int,
foreign key(id_entr) references entrada(id_entr)
)engine=innodb;