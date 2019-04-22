package com.hiveview.service.impl;

import com.google.common.collect.Lists;
import com.hiveview.entity.NeedRecommend;

import java.util.List;
import java.util.Optional;

/**
 * Created by huxunqiang on 17/4/3.
 */
public class Test {

    public static void main(String[] args) {
        List<NeedRecommend> needRecommends = Lists.newArrayList();
//        System.out.println(needRecommends.size());
        NeedRecommend a = Optional.ofNullable(needRecommends).filter(recommends -> recommends.size()>0).map(needRecommendList ->  needRecommendList.get(0) ).orElse(null);
//        NeedRecommend a = Optional.ofNullable(needRecommends).filter(recommends -> recommends.size()>0).map(needRecommendList -> needRecommendList.size() > 0 ? needRecommendList.get(0) : null).get();
        System.out.println(a);
    }
}
