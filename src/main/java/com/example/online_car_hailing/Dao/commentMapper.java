package com.example.online_car_hailing.Dao;

import com.example.online_car_hailing.bean.comment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface commentMapper {
    List<comment> queryAll();

    List<comment> searchById(String id);
}
