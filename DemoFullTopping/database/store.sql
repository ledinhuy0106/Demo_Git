create database storeC04;
use storeC04;
create table product(
                        id int not null primary key auto_increment,
                        name varchar(60) not null ,
                        price double not null ,
                        quantity int not null default 0,
                        idCategory int,
                        foreign key (idCategory) references category(id)
);
-- insert into

create table category(
                         id int not null primary key auto_increment,
                         name varchar(60) not null
);

select * from category;