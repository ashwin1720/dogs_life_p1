
CREATE TABLE OWNERS(
owner_id int  AUTO_INCREMENT PRIMARY KEY,
name varchar(50) not null
);

CREATE TABLE DOGS(
ID int  AUTO_INCREMENT PRIMARY KEY,
name varchar(50) not null,
age int not null,
owner_id int not null,
FOREIGN KEY (owner_id) REFERENCES owners(owner_id)
);

