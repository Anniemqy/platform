package com.hiveview.dao;

import com.hiveview.entity.NeedRecommend;

public interface INeedRecommendDao extends IBaseDao<NeedRecommend>{
    int deleteByPrimaryKey(Long id);

    int insert(NeedRecommend record);

    int insertSelective(NeedRecommend record);

    NeedRecommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NeedRecommend record);

    int updateByPrimaryKey(NeedRecommend record);



}