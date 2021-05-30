create table tablamemoria(
ID int identity(1,1),
Nombre varchar(800),
Monto_deducir money,
Fecha_cambio datetime,
constraint pk_id primary key(ID)
);

insert into tablamemoria (Nombre,Monto_deducir,Fecha_cambio) values 
('Jhon DOE1',276.89,GETDATE()),
('Jhon DOE2',7976.19,GETDATE()),
('Jhon DOE3',9076.93,GETDATE());

select * from tablamemoria;

drop table tablamemoria;
