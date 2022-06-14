package com.example.online_car_hailing.bean;

import lombok.Data;

@Data
public class comment {
    private  String OID;
    private String UID;
    private String DWID;
    private String CommentInfo;
    private String datetime;
    private int TravelSatis;
    private int CarComfort;
    private int DriverService;
}
