package com.example.online_car_hailing.controller;

import com.example.online_car_hailing.Dao.orderDescriptionMapper;
import com.example.online_car_hailing.bean.orderDescription;
import com.example.online_car_hailing.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class orderDescriptionController {
    @Autowired
    private orderDescriptionMapper orderDescriptionMapper;

    @RequestMapping("/query")
    public BaseResponse queryAll() {
        return BaseResponse.success(orderDescriptionMapper.queryAll());
    }

    @DeleteMapping("/search")
    public orderDescription searchById(@RequestBody int id) {
        return orderDescriptionMapper.searchById(id);
    }
}
