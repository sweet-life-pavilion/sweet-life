package com.wnwy.project.mapper;

import com.wnwy.project.entities.AddressInfo;

public interface AddressInfoMapper {
    int deleteByPrimaryKey(Integer addressId);

    int insert(AddressInfo record);

    int insertSelective(AddressInfo record);

    AddressInfo selectByPrimaryKey(Integer addressId);

    int updateByPrimaryKeySelective(AddressInfo record);

    int updateByPrimaryKey(AddressInfo record);
}