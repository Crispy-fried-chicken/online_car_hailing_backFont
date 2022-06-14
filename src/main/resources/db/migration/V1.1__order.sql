create table cridehailing_order_description
(
    OID    char(10)     not null,
    Odep   varchar(100) not null,
    Odes   varchar(100) not null,
    OTime  int          not null,
    OMoney int          not null,
    ODate varchar(10)   not null,
    Dtel  char(11)      not null,
    Ptel  char(11)      not null,
    Ostate char(6)      not null,
    PRIMARY KEY(OID)
);

insert into cridehailing_order_description values(
    1,'天府软件园D区','西南交通大学犀浦校区',30,21,'2022-6-12','15082645374','15106884758','已完成'
);

insert into cridehailing_order_description values(
    2,'西南交通大学犀浦校区','季柳园-西南门',10,7,'2022-6-14','15106884758','13568386555','未支付'
);

insert into cridehailing_order_description values(
    3,'天府软件园D区','成都东站',40,36,'2022-5-14','17185823012','15661342699','已完成'
);