-- Tabla de Tipos de Bicicletas
CREATE TABLE TiposDeBicicletas (
    Codigo INT PRIMARY KEY,
    Descripcion VARCHAR(255)
);

-- Tabla de Bicicletas
CREATE TABLE Bicicletas (
    Codigo INT PRIMARY KEY,
    Marca VARCHAR(255),
    Modelo VARCHAR(255),
    Color VARCHAR(255),
    TipoDeBicicleta INT,
    AnioFabricacion INT,
    FOREIGN KEY (TipoDeBicicleta) REFERENCES TiposDeBicicletas(Codigo)
);

-- Tabla de Clientes
CREATE TABLE Clientes (
    Codigo INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(255),
    Apellido VARCHAR(255),
    Telefono VARCHAR(15),
    DNI VARCHAR(15),
    Domicilio VARCHAR(255),
    CodigoDeBicicleta INT,
    FOREIGN KEY (CodigoDeBicicleta) REFERENCES Bicicletas(Codigo)
);

-- Consultas SQL
SELECT 
    C.Nombre,
    C.Apellido,
    B.Marca,
    B.Modelo,
    T.Descripcion AS TipoDeBicicleta
FROM 
    Clientes C
LEFT JOIN 
    Bicicletas B ON C.CodigoDeBicicleta = B.Codigo
LEFT JOIN 
    TiposDeBicicletas T ON B.TipoDeBicicleta = T.Codigo;
