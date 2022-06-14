package com.example.online_car_hailing.Dao;

import com.example.online_car_hailing.bean.orderDescription;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface orderDescriptionMapper {
    List<orderDescription> queryAll();

    boolean insertRecord(orderDescription orderDescription);

    List<orderDescription> searchById(String id);

    List<orderDescription> searchByDate(String date);
}
