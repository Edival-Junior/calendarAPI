CREATE TABLE IF NOT EXISTS  person (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(255) NOT NULL,
  CreatedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

insert into person(name) values ( 'João' );
insert into person(name) values ( 'Maria' );
insert into person(name) values ( 'Zeca' );
insert into person(name) values ( 'Mario' );
insert into person(name) values ( 'Gustavo' );
insert into person(name) values ( 'Camila' );
insert into person(name) values ( 'Pedro' );
insert into person(name) values ( 'Juliana' );
insert into person(name) values ( 'Gisele' );