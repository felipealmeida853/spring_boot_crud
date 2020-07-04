CREATE TABLE `spring_boot_mysql`.`cidade` (
  `id_cidade` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(300) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_cidade`));

CREATE TABLE `spring_boot_mysql`.`cliente` (
   `id_cliente` INT NOT NULL AUTO_INCREMENT,
   `nome` VARCHAR(45) NOT NULL,
   `sobrenome` VARCHAR(45) NOT NULL,
   `endereco` VARCHAR(45) NOT NULL,
   `id_cidade` INT NOT NULL,
   `data_nascimento` DATE NOT NULL,
   `limite_credito` DECIMAL NOT NULL,
   PRIMARY KEY (`id_cliente`));


CREATE TABLE `spring_boot_mysql`.`telefone` (
    `idtelefone` INT NOT NULL AUTO_INCREMENT,
    `numero` VARCHAR(300) NOT NULL,
    `id_cliente` INT NOT NULL,
    PRIMARY KEY (`idtelefone`));

insert into `spring_boot_mysql`.`cidade` values
(null, 'Bebedouro' , 'SP'),
(null, 'Ribeirão Preto' , 'SP'),
(null, 'Campinas' , 'SP'),
(null, 'Curitiba' , 'PR'),
(null, 'Porto Alegre' , 'RS')


insert into `spring_boot_mysql`.`cliente` values
(null, 'Felipe' , 'Almeida' , 'Rua Joaquin , 25' , 1, '1990-10-20' , 5000),
(null, 'José' , 'Uzarti' , 'Al.Franciso , 95' , 3, '1984-12-13' , 15000),
(null, 'Maria' , 'Madalena' , 'Al. Figueroa , 90' , 2 , '1965-02-10' , 2000),
(null, 'Marcos' , 'Silva' , 'Av. Alves , 34', 4 , '1977-05-17' , 3760)

insert into `spring_boot_mysql`.`telefone` values
(null, '283481274' , 1 ),
(null, '492389532' , 1 ),
(null, '502340954' , 2 ),
(null, '423874238' , 2 ),
(null, '069430534' , 2 ),
(null, '432095239' , 3 ),
(null, '321874324' , 3 ),
(null, '129458325' , 3 ),
(null, '590438636' , 4 ),
(null, '569438634' , 4 ),
(null, '594385346' , 4 )
