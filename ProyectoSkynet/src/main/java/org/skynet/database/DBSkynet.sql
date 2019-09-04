create  database if not exists DBSkynetIN5AM;
use DBSkynetIN5AM;

create table Estudiantes(
	codigoEstudiante int not null auto_increment,
    carnet int not null,
    nombres varchar(255),
    apellidos varchar(255),
    grado varchar(255),
    seccion varchar(255),
    primary key pk_codigoEstudiante(codigoEstudiante)
);

select * from Estudiantes;