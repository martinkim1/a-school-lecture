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
values ('gonji', 'young', '������', 2009, '2065787', '��ǻ�Ͱ��а�', '016', '2975-9854', '��õ��', 'gong@hotmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('javajsp', 'java8394', '������', 2010, '1077818', '��ǻ�Ͱ��а�', '011', '7649-9875', '�����', 'java2@gmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('jdbcmania', 'javajsptest', '�����', 2009, '2044187', '��ǻ�Ͱ��а�', '011', '87654-4983', '��õ��', 'java@hanmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('korea', '9943inner', '������', 2010, '1987372', '��ǻ�Ͱ��а�', '017', '2670-4593', 'õ�Ƚ�', 'wing@gmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('novel', 'elephant', '�����', 2011, '2056485', '����濵��', '016', '3487-9919', '�λ��', 'novel@hanmail.com');
insert into student (id, passwd, name, year, snum, depart, mobile1, mobile2, address, email)
values ('tiger', 'lion', '������', 2010, '1011873', '���ͳݺ���Ͻ���', '011', null, null, null);

show table student;
