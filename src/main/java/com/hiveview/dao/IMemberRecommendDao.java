package com.hiveview.dao;

import com.hiveview.entity.MemberRecommend;

import java.util.List;

public interface IMemberRecommendDao extends IBaseDao<MemberRecommend>{
    int deleteByPrimaryKey(Long id);

    int insert(MemberRecommend record);

    int insertSelective(MemberRecommend record);

    MemberRecommend selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MemberRecommend record);

    int updateByPrimaryKey(MemberRecommend record);

    List<MemberRecommend> getRecommendList(MemberRecommend memberRecommend);
}