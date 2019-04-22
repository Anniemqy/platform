package com.hiveview.service;

import com.hiveview.entity.MemberRecommend;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
public interface IMemberRecommendService {


    List<MemberRecommend> getMemberRecommendPage(MemberRecommend productRecommend);

    void updateRecommend(MemberRecommend productRecommend);

    void saveRecommend(MemberRecommend productRecommend);

    MemberRecommend getMemberRecommendByMId(long memberId);

    void deleteById(long recommendId);

    List<MemberRecommend> getMemberRecommendList(MemberRecommend memberRecommend);
}
