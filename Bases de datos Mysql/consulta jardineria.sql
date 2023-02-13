use  jardineria;

select Codigo_oficina,Ciudad from oficina;

select Ciudad,Telefono from oficina
where pais like"España";

select email,apellido1,apellido2,nombre from empleado
where codigo_jefe =7;

select nombre,puesto,apellido1,apellido2,email from empleado
where codigo_jefe is null;

select nombre,apellido1,apellido2,puesto from empleado
where puesto not like "Representante Ventas";

select nombre_cliente from cliente
where pais like"Spain";

select distinct estado from pedido;

select distinct codigo_cliente from pago
where year(fecha_pago)=2008;

select distinct codigo_cliente from pago
where fecha_pago between '2008-01-01'and '2008-12-31';

select codigo_pedido,codigo_cliente,fecha_entrega,fecha_esperada from pedido
where fecha_entrega>fecha_esperada;


select codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega from pedido
where adddate(fecha_entrega, interval 2 day)=fecha_esperada;

select codigo_pedido,codigo_cliente,fecha_esperada,fecha_entrega from pedido
where datediff(fecha_esperada,fecha_entrega)=2;

select * from pedido
where estado like 'rechazado'  and
year(fecha_pedido)=2009;

select* from pedido
where estado like 'entregado' and month(fecha_pedido)=01;

select *  from pago
where forma_pago like 'paypal' and
year(fecha_pago)=2008 
order by total  desc;

select distinct forma_pago from pago;

select* from producto
where gama like 'ornamentales'
and cantidad_en_stock >100
order by precio_venta desc; 

select* from cliente where codigo_empleado_rep_ventas in ("11","30");



--2columna
select cliente.nombre_cliente,empleado.nombre from cliente 
inner join empleado on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado;

select distinct cliente.nombre_cliente,empleado.nombre from cliente 
inner join empleado on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado
inner join pago on cliente.codigo_cliente =pago.codigo_cliente;

select cliente.nombre_cliente,empleado.nombre from cliente 
inner join empleado on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado 
left join pago on cliente.codigo_cliente=pago.codigo_cliente
where pago.total is null group by cliente.codigo_cliente;


select distinct cliente.nombre_cliente,empleado.nombre,oficina.ciudad from cliente 
inner join empleado on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado
inner join pago on cliente.codigo_cliente =pago.codigo_cliente
inner join oficina on empleado.codigo_oficina=oficina.codigo_oficina;

select cliente.nombre_cliente,empleado.nombre,oficina.ciudad from cliente 
inner join empleado on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado 
inner join oficina on empleado.codigo_oficina=oficina.codigo_oficina 
left join pago on cliente.codigo_cliente=pago.codigo_cliente
where pago.total is null group by cliente.codigo_cliente;

select distinct oficina.linea_direccion1,oficina.linea_direccion2 from oficina 
inner join empleado  on empleado.codigo_oficina=oficina.codigo_oficina
inner join cliente on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado 
where cliente.ciudad like'Fuenlabrada';

select distinct cliente.nombre_cliente,empleado.nombre,oficina.ciudad from empleado
inner join cliente on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado
inner join oficina on empleado.codigo_oficina=oficina.codigo_oficina;

select distinct cliente.nombre_cliente from cliente 
inner join pedido on cliente.codigo_cliente=pedido.codigo_cliente
where fecha_entrega<fecha_esperada;

select distinct gama_producto.gama from gama_producto inner join producto on gama_producto.gama=producto.gama
inner join detalle_pedido on detalle_pedido.codigo_producto=producto.codigo_producto
inner join pedido on pedido.codigo_pedido=detalle_pedido.codigo_pedido
inner join cliente on cliente.codigo_cliente=pedido.codigo_cliente;




///ejercicio 3
select cliente.nombre_cliente,count(pedido.codigo_cliente) from pedido 
right join cliente on cliente.codigo_cliente=pedido.codigo_cliente
group by cliente.codigo_cliente ;

select cliente.nombre_cliente,sum(pago.total)as pago_total from pago 
right join cliente on cliente.codigo_cliente=pago.codigo_cliente
group by cliente.codigo_cliente ;

select distinct cliente.nombre_cliente from cliente 
inner join pedido on cliente.codigo_cliente=pedido.codigo_cliente
where year(fecha_pedido)=2008 order by cliente.nombre_cliente asc;

select cliente.nombre_cliente,pago.total,empleado.nombre,empleado.apellido1,oficina.telefono from cliente 
inner join empleado on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado 
inner join oficina on empleado.codigo_oficina=oficina.codigo_oficina 
left join pago on cliente.codigo_cliente=pago.codigo_cliente
where pago.total is null group by cliente.codigo_cliente;

select distinct cliente.nombre_cliente,empleado.nombre,empleado.apellido1,oficina.ciudad from empleado
inner join cliente on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado
inner join oficina on empleado.codigo_oficina=oficina.codigo_oficina;

select empleado.nombre,empleado.apellido1,empleado.apellido2,empleado.puesto,oficina.telefono from empleado 
inner join oficina on empleado.codigo_oficina=oficina.codigo_oficina 
left join cliente on cliente.codigo_empleado_rep_ventas=empleado.codigo_empleado 
where cliente.codigo_cliente is null group by empleado.nombre;


select oficina.ciudad,count(empleado.codigo_oficina) from oficina right join empleado on  empleado.codigo_oficina=oficina.codigo_oficina
group by oficina.ciudad ;

select * from cliente;
select* from empleado;