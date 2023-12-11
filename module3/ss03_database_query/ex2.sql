use quanlybanhang;
insert into customer values (1,"Minh Quan",10),(2,"Ngoc Oanh",20),(3,"Hong Ha",50);	
insert into orders values (1,1,'2006-3-21',null), (2,2,'2006-3-23',null), (3,1,'2006-3-16',null);
insert into product values (1,"May Giat",3), (2,"Tu Lanh",5),(3,"Dieu Hoa",7),(4,"Quat",1),(5,"Bep Dien",2);
insert into order_detail values (1,1,3), (1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);

select oID, oDate, oTotalPrice from orders;
select c.cName, p.pName from ( ( (customer c inner join orders on c.cID = orders.cID) inner join order_detail on orders.oID = order_detail.oID
) inner join product p on order_detail.pID = p.pID);

select c.cName, p.pName from ( ( (customer c left join orders on c.cID = orders.cID) left join order_detail on orders.oID = order_detail.oID
) left join product p on order_detail.pID = p.pID) where p.pName is Null;

select o.oID, o.oDate, sum((order_detail.odQTY * p.pPrice)) as total_price from orders o inner join order_detail on o.oID = order_detail.oID inner join product p on order_detail.pID = p.pID
group by(o.oID);
