CREATE DATABASE  IF NOT EXISTS Auto;

USE Auto;

DROP TABLE IF EXISTS Auto;


CREATE TABLE Auto (
  `ID` int(11) NOT NULL ,
  `Make` varchar(45) DEFAULT NULL,
  `Model` varchar(45) DEFAULT NULL,
  `Colour` varchar(45) DEFAULT NULL,
  `Power` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

LOCK TABLES Auto WRITE;


INSERT INTO Auto VALUES 
	(1,'Skoda','Octavia','Zelena','68'),
	(2,'VW','Golf','Cervena','80'),
	(3,'Opel','Astra','Cerna','55'),
	(4,'BMW','X5','Modra','95'),
	(5,'Seat','Leon','Zluta','49'),
	(6,'Ford','Focus','Fialova','62');


