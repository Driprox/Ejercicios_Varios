 use examen_final;
delimiter $
CREATE PROCEDURE pais 
(inout Addreess varchar(50),inout pais varchar(10))
begin
select country from country
inner join city on city.city_id = country.country_id
inner join address on address.address_id = city.city_id 
where address= Addreess
and country=pais;
end $
SET @Addreess = 'La Serna';
Call pais(@Addreess, @pais);
SELECT  @pais;
