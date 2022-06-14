package com.example.online_car_hailing.controller;

import com.example.online_car_hailing.Dao.commentMapper;
import com.example.online_car_hailing.response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
public class commentController {
    @Autowired
    private commentMapper commentMapper;

    @RequestMapping("/query")
    public BaseResponse queryAll() {
        return BaseResponse.success(commentMapper.queryAll());
    }

    @RequestMapping("/search")
    public BaseResponse searchById(@RequestParam("id") String id) {
        return BaseResponse.success(commentMapper.searchById(id));
    }
}
