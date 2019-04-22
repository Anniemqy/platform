package com.hiveview.dao;

import com.hiveview.entity.Area;

import java.util.List;

public interface IAreaDao extends IBaseDao<Area>{
    int deleteByPrimaryKey(Long id);

    int insert(Area record);

    int insertSelective(Area record);

    Area selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    Area getAreaByCode(String areaCode);
    
    /**
     *  @功能:查询全部的地区
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月23日
     *  @return  
     */
    List<Area> queryAllArea();
}