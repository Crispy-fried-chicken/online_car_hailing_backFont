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
    @ResponseBody
    public BaseResponse deleteById(@RequestParam("orderId") int orderId){
        System.out.println(orderPreMapper.deleteById(orderId));
        return BaseResponse.success(orderPreMapper.deleteById(orderId));
    }

    @PostMapping("/insert")
    @ResponseBody
    public BaseResponse insertRecord(orderPre orderPre){
        System.out.println(orderPre);
        return BaseResponse.success(orderPreMapper.insertRecord(orderPre));
//        return BaseResponse.success(true);
    }

}
