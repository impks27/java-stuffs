create table users (
user_name varchar(15) not null primary key,
user_pass varchar(15) not null
);
create table user_roles (
user_name varchar(15) not null,
role_name varchar(15) not null,
primary key (user_name, role_name)
);

insert into users(user_name,user_pass) values ("pavan","welcome1");
insert into users(user_name,user_pass) values ("scott","tiger");
insert into users(user_name,user_pass) values ("arun","welcome1");

insert into user_roles(user_name,role_name) values("pavan","user");
insert into user_roles(user_name,role_name) values("arun","manager");
insert into user_roles(user_name,role_name) values("scott","manager");
