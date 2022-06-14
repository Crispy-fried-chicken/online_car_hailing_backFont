package com.example.online_car_hailing.controller;

import com.example.online_car_hailing.Dao.orderDescriptionMapper;
import com.example.online_car_hailing.bean.orderDescription;
import com.example.online_car_hailing.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
public class orderDescriptionController {
    @Autowired
    private orderDescriptionMapper orderDescriptionMapper;

    @RequestMapping("/query")
    public BaseResponse queryAll() {
        return BaseResponse.success(orderDescriptionMapper.queryAll());
    }


    @RequestMapping("/search")
    public BaseResponse searchById(@RequestParam("orderid") String id) {
        return BaseResponse.success(orderDescriptionMapper.searchById(id));
    }

    @RequestMapping("/search")
    public BaseResponse searchByDate(@RequestParam("date") String date) {
        return BaseResponse.success(orderDescriptionMapper.searchById(date));
    }
}
