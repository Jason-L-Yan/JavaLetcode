drop table if exists t_act;
create table t_act(
    actno char(1) primary key,
    balance double(2, 7) /* 7����Ч���ֵĸ�����2��С��λ�ĸ���*/
);

insert into t_act(actno, balance) values ('A', 20000);
insert into t_act(actno, balance) values ('B', 0);
select * from t_act;