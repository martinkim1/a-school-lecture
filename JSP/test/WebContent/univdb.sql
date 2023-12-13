create table student (
   id         varchar(20)         NOT NULL,
   passwd      varchar(20)         NOT NULL,
   name      varchar(20)         NOT NULL,
   year      int               NULL,
   snum      varchar(10)         NULL,
   depart      varchar(20)         NULL,
   mobile1      char(3)            NULL,
   mobile2      varchar(10)         NULL,
   address      varchar(65)         NULL,
   email      varchar(30)         NULL,
   PRIMARY KEY (id)
);

select * from student

insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('gonji', 'young', '공지영', 2009, '2065787', '컴퓨터공학과', '016', '2975-9854', '인천시', 'gong@hotmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('javajsp', 'java8394', '김정수', 2010, '1077818', '컴퓨터공학과', '011', '7649-9875', '서울시', 'java2@gmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('jdbcmania', 'javajsptest', '김수현', 2009, '2044187', '컴퓨터공학과', '011', '87654-4983', '인천시', 'java@hanmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('korea', '9943inner', '안익태', 2010, '1987372', '컴퓨터공학과', '017', '2670-4593', '천안시', 'wing@gmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('novel', 'elephant', '조경란', 2011, '2056485', '기술경영과', '016', '3487-9919', '부산시', 'novel@hanmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('tiger', 'lion', '강경태', 2010, '1011873', '인터넷비즈니스과', '011', null, null, null);

show table student;
