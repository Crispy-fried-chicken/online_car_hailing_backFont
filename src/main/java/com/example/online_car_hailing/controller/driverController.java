package com.example.online_car_hailing.controller;

import com.example.online_car_hailing.Dao.driverMapper;
import com.example.online_car_hailing.bean.driver;
import com.example.online_car_hailing.bean.orderDescription;
import com.example.online_car_hailing.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/driverInfo")
public class driverController {
    @Autowired
    private driverMapper driverMapper;

    @RequestMapping("/query")
    public BaseResponse queryAll() {
        return BaseResponse.success(driverMapper.queryAll());
    }

    @RequestMapping("/search")
    @ResponseBody
    public BaseResponse searchById(String id) {
        System.out.println(driverMapper.searchById(id));
        return BaseResponse.success(driverMapper.searchById(id));
    }
}
