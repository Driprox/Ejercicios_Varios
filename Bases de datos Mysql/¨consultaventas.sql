Use  ventas;

select* from pedido
order by fecha desc;

select* from pedido
where total >3000;

select distinct id_cliente from pedido;

select * from pedido
where total >500 and year(fecha)=2017;

select nombre,apellido1,apellido2 from comercial
where comisión between '0.05' and '0.11';

select max(comisión) from comercial;

select id,nombre,apellido1 from cliente
where apellido2 is not null order by nombre,apellido1 asc ;

select nombre from cliente
where nombre like 'p%' union select nombre from cliente where nombre like 'a%n' order by nombre asc;

select nombre from cliente where nombre not like'a%' order by nombre asc;

2º

select * from cliente left join pedido on cliente.id = pedido.id_cliente
order by apellido1,apellido2,nombre asc;

select * from comercial left join pedido on comercial.id = pedido.id_comercial
order by apellido1,apellido2,nombre asc;

select *from cliente left join pedido on cliente.id = pedido.id_cliente
where id_cliente is null ;

select * from comercial left join pedido on comercial.id = pedido.id_comercial
where id_comercial is null;

select cliente.id,cliente.nombre,cliente.apellido1,cliente.apellido2 from cliente left join pedido on cliente.id = pedido.id_cliente
where id_cliente is null union
select comercial.id,comercial.nombre,comercial.apellido1,comercial.apellido2 from comercial left join pedido on comercial.id = pedido.id_comercial
where id_comercial is null order by nombre asc;


select* from pedido;
3º
select  sum(total) from pedido;
select avg(total) from pedido;
select count(id) from comercial;
select count(id) from cliente;
select max(total) from pedido;
select  min(total) from  pedido;
select ciudad,max(categoría) from cliente 
group by ciudad;