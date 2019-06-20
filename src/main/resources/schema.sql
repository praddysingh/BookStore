
create table t_book
(
	name 			varchar(255) 	not null,
	author  		varchar(255)    not null,
	published_date	date			not null,
	number_of_books	integer			not null,
	rack_number		integer			not null,
	primary key(name)
);