package com.hiveview.service;

import com.hiveview.entity.NeedRecommend;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
public interface INeedRecommendService {


    List<NeedRecommend> getNeedRecommendPage(NeedRecommend needRecommend);

    void updateRecommend(NeedRecommend needRecommend);

    void saveRecommend(NeedRecommend needRecommend);

    NeedRecommend getNeedRecommendByNId(long needId);


    void deleteById(long needRecommendId);
}
