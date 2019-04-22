package com.hiveview.service;

import com.hiveview.entity.Area;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
public interface IAreaService {

    List<Area> getSonAreas(long parentId);

    List<Area> getAllOneLevel();

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
