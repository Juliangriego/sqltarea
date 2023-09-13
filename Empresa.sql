/* Se crea una base de datos <<empresa>> y las tablas <<personas>> y <<facturas>> */
CREATE database empresa;
USE empresa;
CREATE TABLE personas(
    DNI int (9),
    ApyN varchar (50),
    Email varchar (25),
    Teléfono varchar (20)
);
CREATE TABLE facturas (
    NFactura int (8),
    Total int (10),
    DNI int (9)
);
/* Parte teórica:
** Una entidad es una cosa u objeto del mundo real que es distingible de los demás objetos.
Una entidad tiene un conjunto de propiedades, y los valores para un conjunto de propiedades, 
pueden identificar una entidad de forma única. En este caso, en el caso de la tabla <<personas>>
 utilizamos el campo DNI para identificar
los elementos de manera particular, y en <<facturas>> el NFactura.

** Un grupo o conjunto es una agregación de entidades del mismo tipo que comparten las 
mismas propiedades o atributos. Las entidades particulares que constituyen un conjunto se 
llaman <<extensión del conjunto Entidad>>.
Los conjuntos de Entidades no son necesariamente dis-juntos. 

** Atributos: Describen propiedades que posee cada miembro de un conjunto o entidad. La 
designación de un conjunto de entidades expresa que la base de datos almacena información similar
almacena información similar concerniente a cada entidad del conjunto de entidades. 

(Cada uno de estos atributos cva a guardar información similar a la entidad que contiene. 
Por ejemplo nombre dni y teléfon son propiedadesde una sola entidad.) 

** Diagrama Entidad - Relación **

En el caso de la tabla <<personas>> la llave principal (Primary Key, PK) es el DNI,
ya que es el valor único que identifica a una entidad y no se puede repetir.
Si hacemos una tabla <<empleado>> cuyo identificador es un id, DNI, y tiene una categoría y sueldo,
la PK es la id, y también necesitamos una llave secundaria (Foreign Key, FK) que sería el DNI. Más
adelante vamos a ver mejor por qué cada tabla necesita una llave distinta de las otras.
Las relaciones se grafican con un rombo. <<Empleados>> es parte de <<Personas>>.
Tenemos tres tipos de relaciones:
 - n:n, cuando tenemos muchos registros de una tabla relacionados con muchos registros en otra tabla,
 - 1:1, cuando un registro de una tabla está relacionado a un solo registro en otra tabla,
 - 1:n, cuando un registro de una tabla está relacionado a varios registros de otra tabla,
 
En el caso de la tabla <<personas>> respecto a <<empleados>> o <<clientes>>, la relación es 1:1.

En el caso de los <<clientes>> y <<facturas>> la relación es 1:n. se hace una línea que conecta a las
 dos tablas, con una línea atravesada en la relación de 1 y un triángulo en la de n.
En el caso de la tabla <<cliente>>, este tiene como PK el IdCliente, y como secundaria DNI. En la de
<<facturas>> tenemos como PK NFactura y como FK IdCliente.

En el caso de <<facturas>> y <<productos>> la relación es n:n.
 */

 CREATE TABLE clientes (
    IdCliente INT (5),
    DNI int (8),
    NTareta int (16),
    Credito int (10)
 );

 CREATE TABLE empleado (
    IdEmpleado INT (4),
    DNI int (8),
    Categoria varchar (20),
    Sueldo int (7)
 );

 CREATE TABLE productos (
    NProducto int (5),
    NombreProducto varchar (20),
    Precio int (8),
    Stock int (5)
 );

ALTER TABLE personas ADD CONSTRAINT DNI Primary Key (DNI);
ALTER TABLE facturas ADD CONSTRAINT NFactura Primary Key (NFactura);
ALTER TABLE empleado ADD CONSTRAINT IdEmpleado Primary Key (IdEmpleado);
ALTER TABLE clientes ADD CONSTRAINT IdCliente Primary Key (IdCliente);
ALTER TABLE productos ADD CONSTRAINT NProducto Primary Key (NProducto);
