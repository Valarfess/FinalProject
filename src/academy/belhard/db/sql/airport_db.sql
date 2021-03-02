CREATE DATABASE airport_db;

CREATE TABLE pilots (
id INT,
firstname VARCHAR (100) NOT NULL,
lastname VARCHAR (100) NOT NULL,
rang VARCHAR (100) NOT NULL,
code VARCHAR (100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE planes (
id INT,
brand VARCHAR (100),
model VARCHAR (100),
passengercapacity INT UNSIGNED NOT NULL,
tailnumber VARCHAR (100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);

CREATE TABLE flights (
id INT,
plane_id INT,
FOREIGN KEY (plane_id) REFERENCES planes(id),
pilot_id INT,
FOREIGN KEY (pilot_id) REFERENCES pilots(id),
date DATE NOT NULL,
time TIME NOT NULL,
number VARCHAR (100) UNIQUE NOT NULL,
PRIMARY KEY (id)
);