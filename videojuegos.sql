/*
	@author: Rulo GM (c) 2018
		-> E-mail: raul.guadarrama5102@gmail.com
	
	Base de datos para una tienda de préstamo de
	videojuegos en el estado de México
	
	===============================================
	|C R E A C I O N  D E  B A S E  D E  D A T O S |
	================================================
*/

drop database if exists videojuegos;
create database videojuegos;
select 'Base de datos "videojuegos" creada';

use videojuegos;

-- tabla que guarda las partidas
drop table if exists partida;
create table partida(
	id_partida int(8) not null auto_increment,
    nombre varchar(30) not null,
	fecha timestamp not null,
    primary key(id_partida)
);
select 'Tabla "partida" creada';

-- tabla que guarda todo tipo de consola
drop table if exists consola;
create table consola(
	id_consola int(8) not null auto_increment,
    nombre varchar(30) not null,
    compania varchar(30) not null,
    cpu float not null,
    ram float not null,
    harddisk float not null,
    ports int not null,
    so varchar(30) not null,
    consolaDisp int not null,
    juegosDisp int not null,
    tiempoUso float not null,
    montoRenta float not null,
    status boolean not null,
    primary key(id_consola)
);
select 'Tabla "consola" creada';

-- tabla que guarda el arraylist de las partidas guardadas
drop table if exists relConsolaPartida;
create table relConsolaPartida(
	id_relcp int(8) not null auto_increment,
    id_consola int(8) not null,
    id_partida int(8) not null,
    primary key(id_relcp),
    foreign key(id_consola) references consola(id_consola),
    foreign key(id_partida) references partida(id_partida)
);
select 'tabla relConsolaPartida creada';

-- tabla que guarda datos unicos de los ps4
drop table if exists consolaPs4;
create table consolaPs4(
	id_ps4 int(8) not null auto_increment,
    id_consola int(8) not null,
    dualShock int(8) not null,
    auriculares int(8) not null,
    arcadeStick int(8) not null,
    primary key(id_ps4),
    foreign key(id_consola) references consola(id_consola)
);
select 'tabla consolaPs4 creada';

-- tabla que guarda unicamente datos de xbox
drop table if exists consolaXbox;
create table consolaXbox(
	id_xbox int(8) not null auto_increment,
    id_consola int(8) not null,
    controlXbox int(8) not null,
    pilas int(8) not null,
    auricularesChat int(8) not null,
    kitCargaJuega int(8) not null,
    lkinect int(8) not null,
    primary key(id_Xbox),
    foreign key(id_consola) references consola(id_consola)
);
select 'tabla xbox creada';

-- tabla que guarda unicamente datos de nintendo
drop table if exists consolaNintendoS;
create table consolaNintendoS(
	id_nintendo int(8) not null auto_increment,
    id_consola int(8) not null,
    tipoControl varchar(30) not null,
    controlesJoyC int(8) not null,
    controlesPro int(8) not null,
    colorCorreaC varchar(30) not null,
    colorFundaC varchar(30) not null,
    volanteJoyCon int(8) not null,
    protectorPantalla int(8) not null,
    primary key(id_nintendo),
    foreign key(id_consola) references consola(id_consola)
);
select 'tabla nintendo creada';

select 'Base de datos creada exitosamente';

-- Fin de creación de base de datos

/*
	===========================================
	||	    P R O C E D I M I E N T O S		 ||
	===========================================
*/

-- procedimiento que inserta datos en la tabla partida
drop procedure if exists insertaPartida;
delimiter ||
	create procedure insertaPartida(name varchar(39),fesha timestamp)
	begin
		insert into partida(nombre,fecha) values (name,fesha);
	end
||
delimiter ;


-- procedimiento que inserta datos en la tabla consola
drop procedure if exists insertaConsola;
delimiter ||
	create procedure insertaConsola(
		nombree varchar(30),
		companiaa varchar(30),
		cpuu float,
		ramm float,
		harddiskk float,
		portss int,
		soo varchar(30),
		consolaDispp int,
		juegosDispp int,
		tiempoUsoo float,
		montoRentaa float,
		statuss boolean
	)
	begin
		insert into consola(
			nombre,
			compania,
			cpu,
			ram,
			harddisk,
			ports,
			so,
			consolaDisp,
			juegosDisp,
			tiempoUso,
			montoRenta,
			status
		) values (
			nombree,
			companiaa,
			cpuu,
			ramm,
			harddiskk,
			portss,
			soo,
			consolaDispp,
			juegosDispp,
			tiempoUsoo,
			montoRentaa,
			statuss			
		);
	end
||
delimiter ;

-- procedimeinto que inserta datos en la tabla relConsolaPartida
drop procedure if exists insertaRelConsP;
delimiter ||
	create procedure insertaRelConsP(consola int(8), partida int(8))
	begin
		insert into partida(id_consola,id_partida) values (consola,partida);
	end
||
delimiter ;

-- procedimeinto que inserta datos en la tabla nintendo
drop procedure if exists insertaNintendo;
delimiter ||
	create procedure insertaNintendo(
		id_consolaa int(8),
		tipoControll varchar(30),
		controlesJoyCc int(8),
		controlesProo int(8),
		colorCorreaCc varchar(30),
		colorFundaCc varchar(30),
		volanteJoyConn int(8),
		protectorPantallaa int(8)
	)
	begin
		insert into consolanintendos(
			id_consola,
			tipoControl,
			controlesJoyC,
			controlesPro,
			colorCorreaC,
			colorFundaC,
			volanteJoyCon,
			protectorPantalla
		) values (
			id_consolaa,
			tipoControll,
			controlesJoyC,
			controlesPro,
			colorCorreaC,
			colorFundaC,
			volanteJoyConn,
			protectorPantallaa
		);
	end
||
delimiter ;

-- procedimeinto que inserta datos en la tabla insertaPs4
drop procedure if exists insertaPs4;
delimiter ||
	create procedure insertaPs4(
		id_consolaa int(8),
		dualShockk int(8),
		auricularess int(8),
		arcadeStickk int(8)
	)
	begin
		insert into consolaps4(
			id_consola,
			dualShock,
			auriculares,
			arcadeStick		
		) values (
			id_consolaa,
			dualShockk,
			auricularess,
			arcadeStickk		
		);
	end
||
delimiter ;

-- procedimeinto que inserta datos en la tabla relConsolaPartida
drop procedure if exists insertaXbox;
delimiter ||
	create procedure insertaXbox(
		id_consolaa int(8),
		controlXboxx int(8),
		pilass int(8),
		auricularesChatt int(8),
		kitCargaJuegaa int(8),
		lkinectt int(8)
	)
	begin
		insert into consolaxbox(
			id_consola,
			controlXbox,
			pilas,
			auricularesChat,
			kitCargaJuega,
			lkinect	
		) values (
			id_consolaa,
			controlXboxx,
			pilass,
			auricularesChatt,
			kitCargaJuegaa,
			lkinectt			
		);
	end
||
delimiter ;