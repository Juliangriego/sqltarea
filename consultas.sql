CREATE TABLE personas(nombre varchar(10), apellido varchar (10), dni int (10));

INSERT INTO personas (nombre,apellido, dni) 
    VALUES  
        ('Ricardo','Fort',654),
        ('Mirtha','Legrand',0),
        ('Susana','jimene',2),
        ('Juan','Perez',3),
        ('Jose','Rodriguez',6654)
;
CREATE TABLE facturas 
    (cod int, producto varchar(20), cantidad int, precio int)
;
INSERT INTO facturas VALUES
    (1,'CHORIZO', 897, 2000),
    (2,'MARUCHA', 1 , 2500)
;

ALTER TABLE personas ADD provincia varchar (20), email varchar (20), telefono int (15);

ALTER TABLE personas DROP provincia, ADD pais varchar (20);

update personas set 
    email = 'pepe@gmail.com',
    direccion= 'calle falsa 123',
    telefono = 555555,
    provincia = 'bs as' 
where dni= 654;

update personas set 
    email = 'pipi@gmail.com',
    direccion= 'calle posta 321',
    telefono = 444444,
    provincia = 'formosa' 
where dni= 0;
update personas set
    email = '<EMAIL>',
    direccion='calle america 123',
    telefono=666666,
    provincia = 'santiago'
where dni=2;

update personas set
    email = 'popo@gmail.com'
where dni = 2;

update personas set
    email = 'pupu@gmail.com',
    direccion='calle asia 123',
    telefono=77777,
    provincia = 'Jujuy'
where dni=3;
update personas set
    email = 'papa@gmail.com',
    direccion='europa 123',
    telefono=111111,
    provincia = 'Catamarca'
where dni=6654;