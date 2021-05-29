create table #TablaMemoria(
ID int identity(1,1),
Nombre varchar(800),
Monto_deducir money,
FechaCambio datetime,
constraint pk_id primary key(ID)
);

insert into #TablaMemoria (Nombre,Monto_deducir,FechaCambio) values 
('Jhon DOE1',276.89,GETDATE()),
('Jhon DOE2',7976.19,GETDATE()),
('Jhon DOE3',9076.93,GETDATE());

select * from #TablaMemoria;