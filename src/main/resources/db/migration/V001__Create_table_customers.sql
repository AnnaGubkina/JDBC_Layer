create table CUSTOMERS
(
    id serial not null primary key ,
    name varchar(255)  not null ,
    surname varchar(255)   not null  ,
    age int  not null check (age>0)  ,
    phone_number bigint
);