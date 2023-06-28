--CREATE table person(
--id integer not null,
--name varchar (255) not null,
--location varchar (255) not null,
--birth_date timestamp,
--primary key (id)
--);

INSERT INTO person( id,name,location,birth_date)
values (1001, 'ramu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1002, 'shamu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1003, 'jamu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1004, 'tamu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1005, 'pamu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1006, 'indu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1007, 'bindu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1008, 'shindu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1009, 'dindu', 'varanasi', CURRENT_TIMESTAMP());
INSERT INTO person( id,name,location,birth_date)
values (1010, 'lindu', 'varanasi', CURRENT_TIMESTAMP());

INSERT INTO course (id , name)
VALUES (2001, 'maths');

INSERT INTO passport(id, number)
VALUES (5001,'ABC154');

INSERT INTO student (id , name, passport_id)
VALUES (3001, 'rahul',5001);

INSERT INTO review (id , rating, description)
VALUES (4001, '3','good' );

