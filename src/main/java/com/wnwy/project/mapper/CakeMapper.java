package com.wnwy.project.mapper;

import com.wnwy.project.entities.Cake;

public interface CakeMapper {
    int deleteByPrimaryKey(Integer cakeId);

    int insert(Cake record);

    int insertSelective(Cake record);

    Cake selectByPrimaryKey(Integer cakeId);

    int updateByPrimaryKeySelective(Cake record);

    int updateByPrimaryKey(Cake record);
}