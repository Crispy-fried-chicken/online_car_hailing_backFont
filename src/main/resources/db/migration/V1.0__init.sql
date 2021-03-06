-- auto-generated definition
create table cridehailing_drivers
(
    DWID    char(18)    not null
        primary key,
    Dtel    char(11)    null,
    account varchar(20)    null,
    passwd  varchar(255)    null,
    DName   varchar(22) not null,
    DStar   int         not null,
    DCar    varchar(20) not null,
    DCarNum    varchar(20) not null,
    constraint DCar
        unique (DCar)
);

-- auto-generated definition
create table cridehailing_passengers
(
    UID     char(18)    not null
        primary key,
    account varchar(20)    not null,
    passwd  varchar(255)    not null,
    tel     char(11)    not null,
    UName   varchar(20) not null,
    UCredit int         not null
);

-- auto-generated definition
create table cridehailing_orders
(
    OID    char(10)     not null
        primary key,
    Odep   varchar(100) not null,
    Odes   varchar(100) not null,
    OTime  int          not null,
    OMoney int          not null,
    Ofines int          null,
    OTypes varchar(10)  not null
);

-- auto-generated definition
create table cridehailing_orderpre
(
    orderId   int auto_increment
        primary key,
    orderType varchar(8)   not null,
    orderDes  varchar(255) not null,
    orderDep  varchar(255) not null
);

-- auto-generated definition
create table cridehailing_generates
(
    OID       char(10) not null,
    UID       char(18) not null,
    DWID      char(18) not null,
    OCredit   int      not null,
    OPaytime  datetime not null,
    OrderTime datetime not null,
    primary key (OID, UID, DWID),
    constraint fk_ord_dept1
        foreign key (UID) references cridehailing_passengers (UID),
    constraint fk_ord_dept2
        foreign key (DWID) references cridehailing_drivers (DWID),
    constraint fk_ord_dept3
        foreign key (OID) references cridehailing_orders (OID)
);

-- auto-generated definition
create table cridehailing_comments
(
    OID         char(10)     not null,
    UID         char(18)     not null,
    DWID        char(18)     not null,
    CommentInfo varchar(100) not null,
    CommentTime datetime     not null,
    UCredit     int          not null,
    primary key (OID, UID, DWID),
    constraint fk_com_dept1
        foreign key (UID) references cridehailing_passengers (UID),
    constraint fk_com_dept2
        foreign key (DWID) references cridehailing_drivers (DWID),
    constraint fk_com_dept3
        foreign key (OID) references cridehailing_orders (OID)
);

-- auto-generated definition
create table cridehailing_appointments
(
    UID             char(18)     not null,
    AppointmentInfo varchar(100) not null,
    AppointmentTime datetime     not null,
    Ades            varchar(100) not null,
    Adep            varchar(100) not null,
    primary key (UID, AppointmentTime),
    constraint fk_app_dept1
        foreign key (UID) references cridehailing_passengers (UID)
);

-- auto-generated definition
create table cridehailing_accept
(
    UID             char(18)     not null,
    DWID            char(18)     null,
    AppointmentTime datetime     not null,
    AcceptTime      varchar(100) not null,
    primary key (UID, AppointmentTime),
    constraint fk_acc_dept2
        foreign key (DWID) references cridehailing_drivers (DWID),
    constraint fk_acc_dept3
        foreign key (UID, AppointmentTime) references cridehailing_appointments (UID, AppointmentTime)
);
insert into cridehailing_orderpre values(1,'????????????','???????????????D???','??????????????????????????????');
insert into cridehailing_orderpre values(2,'????????????','??????????????????????????????','?????????-?????????');
insert into cridehailing_orderpre values(3,'????????????','??????????????????????????????','????????????');
insert into cridehailing_orderpre values(4,'????????????','??????????????????????????????','??????-?????????');

