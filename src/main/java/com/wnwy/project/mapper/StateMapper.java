package com.wnwy.project.mapper;

import com.wnwy.project.entities.State;

public interface StateMapper {
    int deleteByPrimaryKey(Integer
                                   stateId);

    int insert(State record);

    int insertSelective(State record);

    State selectByPrimaryKey(Integer
                                     stateId);

    int updateByPrimaryKeySelective(State record);

    int updateByPrimaryKey(State record);
}