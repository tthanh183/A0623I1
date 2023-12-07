create database `materials_management`;
use `materials_management`;

create table export_doc (
	code_export_doc int primary key,
    export_date date
);

alter table export_doc modify code_export_doc int auto_increment;

create table material (
	code_material int primary key auto_increment,
    material_name varchar(100)
);

create table export_doc_material (
	code_export_doc int,
    code_material int,
    export_price double,
    export_amount double,
    primary key(code_export_doc,code_material),
    foreign key (code_export_doc) references export_doc(code_export_doc),
    foreign key (code_material) references material(code_material)
);

create table import_doc (
	code_import_doc int primary key,
    import_date date
);

create table import_doc_material (
	code_import_doc int,
    code_material int,
    import_price double,
    import_amount double,
    primary key(code_import_doc,code_material),
    foreign key (code_import_doc) references import_doc(code_import_doc),
    foreign key (code_material) references material(code_material)
);
create table supplier(
	code_supplier int primary key auto_increment,
    supplier_name varchar(100),
    address varchar(100)
);

create table phone_number(
	code_supplier int,
    phone_number varchar(100),
    primary key(code_supplier, phone_number),
    foreign key(code_supplier) references supplier(code_supplier)
);

create table purchase_order (
	code_purchase_order int primary key auto_increment,
    purchase_order_date date,
    code_supplier int,
    foreign key(code_supplier) references supplier(code_supplier)
);

create table material_purchase_order(
	code_material int,
    code_purchase_order int,
    primary key(code_material,code_purchase_order),
    foreign key(code_material) references material(code_material),
    foreign key(code_purchase_order) references purchase_order(code_purchase_order)
);