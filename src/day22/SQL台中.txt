use mydb;
create table if not exists taichung_attractions(
	id int auto_increment primary key,
    name varchar(100) unique not null,
    location varchar(100),
    ticket_price varchar(50),
    category enum('約會','闔家','親子','朋友','其他'),
    description varchar(255)
)
