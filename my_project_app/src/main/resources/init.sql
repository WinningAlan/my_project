
drop table  if exists user;
create table user(
    id int not null primary key auto_increment ,
    username varchar(20) not null,
    password varchar(30) not null,
    updateTime datetime default null,
    createTime datetime default now()
);
insert into user values(null,'shubings','123456',null,now());
insert into user values(null,'admin','1234567',null,now())