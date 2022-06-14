ALTER TABLE cridehailing_comments ADD TravelSatis int not null;
ALTER TABLE cridehailing_comments ADD CarComfort int not null;
ALTER TABLE cridehailing_comments ADD DriverService int not null;
ALTER TABLE cridehailing_comments DROP UCredit;


insert into cridehailing_orders values(
    '1','天府软件园D区','西南交通大学犀浦校区',30,21,NULL,'打车'
);

insert into cridehailing_orders values(
    '2','西南交通大学犀浦校区','季柳园-西南门',10,7,NULL,'打车'
);

insert into cridehailing_comments values(
    '1','331081200103211523','331081200003231201','司机态度很好，整体行程较为舒适，没有绕路','2020-09-14 23:18:17',5,4,5);
insert into cridehailing_comments values(
    '2','331081200306031377','332623196501231110','车辆卫生堪忧，司机速度太快，让人感到眩晕，不考虑乘客感受，差评！！！','2020-09-14 23:18:17',3,1,2);
