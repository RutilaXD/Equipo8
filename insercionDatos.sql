use videojuegos;

-- insertamos partida
call insertaPartida('Ah perro!!','2018-06-19');
select * from partida;

-- insertamos tipo de consola
call insertaConsola('xbox', 'microsoft',2.4,2,500,3,'Windows',2,10);
call insertaConsola('nintendo 3DS', 'Nintendo', 3.0,4, 1000, 3, 'UNIX', 2, 5);
call insertaConsola('PS4','Plays Station',4,8,1024,4,'linux ubuntu',1,10);

-- insertamos las consolas xbox diponibles
call insertaXbox(1,0,0,0,0,0,0,0,false); -- equivalente al nulo
call insertaXbox(1,2,8,4,2,0,0,0,false);
call insertaXbox(1,3,6,2,3,1,0,0,false);

-- insertamos las consolas nintendo disponibles
call insertaNintendo(2,'nulo',0,0,'nulo','nulo',0,0,0,0,false); -- equivalente al nulo
call insertaNintendo(2,'inalambrico',2,3,'negro','azul marino',1,1,0,0,false);
call insertaNintendo(2,'alambrico',2,3,'rojo','blanco',1,1,0,0,false);

-- insertamos la consola ps4 disponibles
call insertaPs4(3,0,0,0,0,0,false); -- equivalente al nulo
call insertaPs4(3,1,2,3,0,0,false);

-- insertamos en una consola
insert into relconsolapartida (id_partida,id_xbox,id_nintendo,id_ps4) values (1,1,2,1);

select * from consola;
select * from consolaxbox;
select * from consolanintendos;
select * from consolaps4;

drop view if exists consultaXbox;
create view consultaXbox as
select consolaxbox.id_xbox,consolaxbox.auricularesChat,
consolaxbox.controlXbox,consolaxbox.kitCargaJuega,consolaxbox.lkinect,
consolaxbox.pilas,consola.juegosDisp,consolaxbox.montoRenta,
consola.nombre,consola.ports,
consolaxbox.status,consolaxbox.tiempoUso from consolaxbox 
inner join consola on consola.id_consola = consolaxbox.id_consola;
select * from consultaxbox;

drop view if exists consultaPartidasGuardadas;
create view consultaPartidaGuardadas as
select partida.nombre, partida.fecha, consolaxbox.id_xbox,
	consolaps4.id_ps4, consolanintendos.id_nintendo 
from relconsolapartida 
inner join partida on partida.id_partida = relconsolapartida.id_partida
inner join consolaxbox on consolaxbox.id_xbox = relconsolapartida.id_xbox
inner join consolanintendos on consolanintendos.id_nintendo = relconsolapartida.id_nintendo
inner join consolaps4 on consolaps4.id_ps4 = relconsolapartida.id_ps4;
select * from consultapartidaguardadas;