use quanlybanhang;
create table customer(
	cID int auto_increment,
    cName varchar(100),
    cAge smallint,
    primary key(cID)
);

create table orders(
	oID int auto_increment,
    cID int NOT NULL,
    oDate date,
    oTotalPrice double,
    primary key(oID),
    foreign key(cID) references customer(cID)
);

create table product(
	pID int auto_increment,
    pName varchar(255),
    pPrice double,
    primary key(pID)
);

create table order_detail(
	oID int,
    pID int,
    odQTY int,
    primary key(oID, pID),
    foreign key(oID) references orders(oID),
    foreign key(pID) references product(pID)
);