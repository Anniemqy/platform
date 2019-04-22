package com.hiveview.dao;

import com.hiveview.entity.Attribute;

import java.util.List;

public interface IClassAttributeDao extends IBaseDao<Attribute>{
    int deleteByPrimaryKey(Long id);

    int insert(Attribute record);

    int insertSelective(Attribute record);

    Attribute selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);

    int deleteByClassId(Long classId);

    void batchSaveAttr(List<Attribute> isNoNullData);
}