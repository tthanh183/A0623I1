use demo;

create table products (
	id int,
    productCode varchar(20),
    productName varchar(50),
    productPrice double,
    productAmount int,
    productDescription text,
    productStatus varchar(20),
    primary key(id)
);

insert into products values (1,'pro-01','product1',200,5,'description1','available'),(2,'pro-02','product2',500,3,'description2','available'),
(3,'pro-03','product3',600,8,'description3','available'),(4,'pro-04','product4',100,8,'description4','available') ;

explain select * from products where productCode = 'pro-01';

create unique index idx_productCode on products(productCode);	

create index idx_name_price on products(productName, productPrice);

explain select * from products where productCode = 'pro-01';

create view product_views as
select productCode, productName, productPrice, productStatus from products;

create or replace view product_views as 
select productCode, productName, productPrice, productStatus from products
where productCode = 'pro-01';

drop view product_views;

delimiter //
create procedure getAll()
begin
	select * from products;
end //
delimiter ;

delimiter //
create procedure insertIntoProducts(
	in productCode int, 
    in productName varchar(50),
    in productPrice double,
    in productAmount int,
    in productDescription text,
    in productStatus varchar(20))
begin
	insert into products values (id,productCode,productName,productPrice,productAmount,productDescription,productStatus);
end //
delimiter ;


delimiter //
create procedure updateProductsById(
	in ID int
)
begin
	update products set id = ID;
end //
delimiter ;

delimiter //
create procedure deleteProductsById(
	in ID int
)
begin
	delete from products where id = ID;
end //
delimiter ;

