package com.example.online_car_hailing;

import com.example.online_car_hailing.Dao.orderPreMapper;
import com.example.online_car_hailing.bean.orderPre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/driver")
public class controller {
    @Autowired
    private orderPreMapper orderPreMapper;

    @RequestMapping("/query")
    public List<orderPre> queryAll() {
        return orderPreMapper.queryAll();
    }
}
