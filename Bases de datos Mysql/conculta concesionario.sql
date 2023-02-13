 use concesionario;
delimiter $
CREATE PROCEDURE consultacliente 
(in matricula1 varchar(10))
begin
select nombre_cliente from Clientes 
inner join Coches on Clientes.id_compra = Coches.id_venta 
where matricula like matricula1;
end $
call consultacliente ('713525');
 use concesionario;
delimiter $
CREATE PROCEDURE consultaempleado
(in nombre1 varchar(10))
begin
select * from Empleado
inner join Clientes on Empleado.id_vendido = Clientes.id_vendedor 
where Nombre_cliente like nombre1;
end $
call consultaempleado ('Lola');