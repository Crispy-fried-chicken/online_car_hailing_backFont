package com.example.online_car_hailing.Dao;

import com.example.online_car_hailing.bean.driver;
import com.example.online_car_hailing.bean.passenger;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface passengerMapper {
    List<passenger> queryAll();

    passenger searchById(String id);

}
