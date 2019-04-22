package com.hiveview.service.impl;

import com.hiveview.dao.INeedRecommendDao;
import com.hiveview.entity.NeedRecommend;
import com.hiveview.service.INeedRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class NeedRecommentServiceImpl implements INeedRecommendService {

    @Autowired
    private INeedRecommendDao needRecommendDao;


    @Override
    public List<NeedRecommend> getNeedRecommendPage(NeedRecommend needRecommend) {
        return needRecommendDao.getList(needRecommend);
    }

    @Override
    public void updateRecommend(NeedRecommend needRecommend) {
        needRecommendDao.updateByPrimaryKeySelective(needRecommend);
    }

    @Override
    public void saveRecommend(NeedRecommend needRecommend) {
        needRecommendDao.insertSelective(needRecommend);
    }

    @Override
    public NeedRecommend getNeedRecommendByNId(long needId) {
        NeedRecommend needRecommend = new NeedRecommend();
        needRecommend.setNeedId(needId);
        List<NeedRecommend> needRecommends = needRecommendDao.getList(needRecommend);
        return Optional.ofNullable(needRecommends).filter(n -> n.size()>0).map(n1 ->  n1.get(0) ).orElse(null);
    }

    @Override
    public void deleteById(long needRecommendId) {
        needRecommendDao.deleteByPrimaryKey(needRecommendId);
    }
}
