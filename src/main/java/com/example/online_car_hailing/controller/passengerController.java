package com.example.online_car_hailing.controller;

import com.example.online_car_hailing.Dao.driverMapper;
import com.example.online_car_hailing.Dao.passengerMapper;
import com.example.online_car_hailing.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passengerInfo")
public class passengerController {
    @Autowired
    private passengerMapper passengerMapper;

    @RequestMapping("/query")
    public BaseResponse queryAll() {
        return BaseResponse.success(passengerMapper.queryAll());
    }

    @RequestMapping("/search")
    @ResponseBody
    public BaseResponse searchById(String id) {
        System.out.println(passengerMapper.searchById(id));
        return BaseResponse.success(passengerMapper.searchById(id));
    }
}
