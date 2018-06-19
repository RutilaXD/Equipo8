use videojuegos;

-- insertamos partida
call insertaPartida('Ah perro!!','2018-06-19');
select * from partida;

-- insertamos en una consola
insert into relconsolapartida (id_partida,id_consola) values (1,1);

-- insertamos tipo de consola
call insertaConsola('xbox', 'microsoft',2.4,2,500,3,'Windows',2,10,0,0,false);
call insertaConsola('nintendo 3DS', 'Nintendo', 3.0,4, 1000, 3, 'UNIX', 2, 5, 0, 0, false);
call insertaConsola('PS4','Plays Station',4,8,1024,4,'linux ubuntu',1,10,0,0,false);

-- insertamos las consolas xbox diponibles
call insertaXbox(1,2,8,4,2,0);
call insertaXbox(1,3,6,2,3,1);

-- insertamos las consolas nintendo disponibles
call insertaNintendo(2,'inalambrico',2,3,'negro','azul marino',1,1);
call insertaNintendo(2,'alambrico',2,3,'rojo','blanco',1,1);

-- insertamos la consola ps4 disponibles
call insertaPs4(3,1,2,3);

select * from consola;
select * from consolaxbox;
select * from consolanintendos;
select * from consolaps4;

drop view if exists consultaXbox;
create view consultaXbox as
select consolaxbox.id_xbox,consolaxbox.auricularesChat,
consolaxbox.controlXbox,consolaxbox.kitCargaJuega,consolaxbox.lkinect,
consolaxbox.pilas,
consola.compania,consola.cpu,
consola.harddisk,consola.juegosDisp,consola.montoRenta,
consola.nombre,consola.ports,consola.ram,consola.so,
consola.status,consola.tiempoUso from consolaxbox 
inner join consola on consola.id_consola = consolaxbox.id_consola;
select * from consultaxbox;

drop view if exists consultaPartidasGuardadas;
create view consultaPartidaGuardadas as
select partida.nombre, partida.fecha, consola.id_consola from
relconsolapartida inner join partida on partida.id_partida = relconsolapartida.id_partida
inner join consola on consola.id_consola = relconsolapartida.id_consola;
select * from consultapartidaguardadas;