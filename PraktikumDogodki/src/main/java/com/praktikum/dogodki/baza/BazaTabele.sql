
--https://dimitrisli.wordpress.com/2011/05/07/spring-mysql-jdbctemplate-demonstration/
/*
create database student265;
use student265;
CREATE USER student265 IDENTIFIED BY '1002349150';
grant usage on *.* to student265@localhost identified by '1002349150';
grant all privileges on student265.* to student265@localhost; --neven kej bi nej to blo...

CREATE TABLE PERSON_RECORD (
    ID INT NOT NULL AUTO_INCREMENT,
    NAME VARCHAR(15) NOT NULL,
    SURNAME VARCHAR(15) NOT NULL,
    PRIMARY KEY (ID)
);*/

SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS DOGODEK;
DROP TABLE IF EXISTS ORGANIZATOR;
DROP TABLE IF EXISTS PRIJAVA;

CREATE TABLE ORGANIZATOR(
ID_organizator INTEGER NOT NULL PRIMARY KEY, 
ime VARCHAR(20),
priimek VARCHAR(25),
email VARCHAR(75)

);

CREATE TABLE DOGODEK(
ID_dogodek INTEGER NOT NULL PRIMARY KEY,
naziv VARCHAR(100),
opis VARCHAR(3500),
lokacija VARCHAR(100),
zacetek DATE,
trajanje TIME,
konecPrijav DATE,
konecOdjav DATE,
minOseb INTEGER,
maxOseb INTEGER,
status VARCHAR(25),
potrebnoPovabilo BOOLEAN,
TK_ID_organizator INT NOT NULL,
FOREIGN KEY tk_organizator(TK_ID_organizator) REFERENCES organizator(ID_organizator)

);

CREATE TABLE PRIJAVA(
ID_prijava INTEGER NOT NULL PRIMARY KEY,
ime VARCHAR(20),
priimek VARCHAR(25),
datumPrijave DATE,
email VARCHAR(75),
ocena INTEGER,
komentar VARCHAR(500),
TK_ID_organizator INT NOT NULL,
TK_ID_dogodek INT NOT NULL,
FOREIGN KEY tk_organizator2(TK_ID_organizator) REFERENCES organizator(ID_organizator),
FOREIGN KEY tk_dogodek(TK_ID_dogodek) REFERENCES dogodek(ID_dogodek)

);




/*CREATE TABLE ORGANIZATOR(ID_organizator INTEGER NOT NULL, ime VARCHAR(20),priimek VARCHAR(25),email VARCHAR(75));ALTER TABLE ORGANIZATOR ADD(CONSTRAINT PK_ORGANIZATOR PRIMARY KEY (ID_organizator));CREATE TABLE DOGODEK(ID_dogodek INTEGER NOT NULL,naziv VARCHAR(100),opis VARCHAR(3500),lokacija VARCHAR(100),zacetek DATE,trajanje TIME,konecPrijav DATE,konecOdjav DATE,minOseb INTEGER,maxOseb INTEGER,status VARCHAR(25),potrebnoPovabilo BOOLEAN);ALTER TABLE DOGODEK ADD(CONSTRAINT PK_DOGODEK PRIMARY KEY (ID_dogodek));ALTER TABLE DOGODEK ADD(CONSTRAINT TK_DOGODEK_ID_organizator FOREIGN KEY (TK_ID_organizator) REFERENCES (ID_organizator));CREATE TABLE PRIJAVA(ID_prijava INTEGER NOT NULL,ime VARCHAR(20),priimek VARCHAR(25),datumPrijave DATE,email VARCHAR(75),ocena INTEGER,komentar VARCHAR(500));ALTER TABLE PRIJAVA ADD(CONSTRAINT PK_PRIJAVA PRIMARY KEY (ID_prijava));ALTER TABLE PRIJAVA ADD(CONSTRAINT TK_PRIJAVA_ID_organizator FOREIGN KEY (TK_ID_organizator) REFERENCES (ID_organizator));ALTER TABLE PRIJAVA ADD(CONSTRAINT TK_PRIJAVA_ID_dogodek FOREIGN KEY (TK_ID_dogodek) REFERENCES (ID_dogodek));


CREATE TABLE POVABILO(
ID_povabilo INTEGER NOT NULL,
naziv varchar(50)
);
ALTER TABLE POVABILO ADD(CONSTRAINT PK_POVABILO PRIMARY KEY (ID_povabilo));
*/

