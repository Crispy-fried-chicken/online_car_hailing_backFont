package com.example.online_car_hailing.controller;

import com.example.online_car_hailing.Dao.orderPreMapper;
import com.example.online_car_hailing.bean.orderPre;
import com.example.online_car_hailing.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class orderPreController {
    @Autowired
    private orderPreMapper orderPreMapper;

    @RequestMapping("/query")
    public BaseResponse queryAll() {
        return BaseResponse.success(orderPreMapper.queryAll());
    }

    @DeleteMapping("/Delete")
    public boolean deleteById(@RequestBody int id){
        return orderPreMapper.deleteById(id);
    }

}
