package com.example.online_car_hailing.Dao;

import com.example.online_car_hailing.bean.driver;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface driverMapper {
    List<driver> queryAll();

    driver searchById(String id);
}
