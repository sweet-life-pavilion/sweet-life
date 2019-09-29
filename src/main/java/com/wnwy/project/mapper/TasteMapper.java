package com.wnwy.project.mapper;

import com.wnwy.project.entities.Taste;

public interface TasteMapper {
    int deleteByPrimaryKey(Integer tasteId);

    int insert(Taste record);

    int insertSelective(Taste record);

    Taste selectByPrimaryKey(Integer tasteId);

    int updateByPrimaryKeySelective(Taste record);

    int updateByPrimaryKey(Taste record);
}