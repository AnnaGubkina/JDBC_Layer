create table  if not exists ORDERS
(
    id           serial primary key ,
    date         date default current_date,
    customer_id  int references customers(id),
    product_name varchar(255) not null ,
    amount       int not null check (amount>=0)
);