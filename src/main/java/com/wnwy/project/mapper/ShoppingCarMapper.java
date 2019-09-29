package com.wnwy.project.mapper;

import com.wnwy.project.entities.ShoppingCar;

public interface ShoppingCarMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(ShoppingCar record);

    int insertSelective(ShoppingCar record);

    ShoppingCar selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(ShoppingCar record);

    int updateByPrimaryKey(ShoppingCar record);
}