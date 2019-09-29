package com.wnwy.project.mapper;

import com.wnwy.project.entities.CakeInfo;

public interface CakeInfoMapper {
    int deleteByPrimaryKey(Integer cakeInfoId);

    int insert(CakeInfo record);

    int insertSelective(CakeInfo record);

    CakeInfo selectByPrimaryKey(Integer cakeInfoId);

    int updateByPrimaryKeySelective(CakeInfo record);

    int updateByPrimaryKey(CakeInfo record);
}