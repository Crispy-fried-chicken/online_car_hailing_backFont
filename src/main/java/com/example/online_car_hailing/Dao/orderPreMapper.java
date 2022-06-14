package com.example.online_car_hailing.Dao;

import com.example.online_car_hailing.bean.orderPre;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface orderPreMapper {
    List<orderPre> queryAll();

    boolean insertRecord(orderPre orderPre);

    boolean deleteById(int orderId);

}
