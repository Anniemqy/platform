package com.hiveview.service.impl;

import com.hiveview.dao.IMemberRecommendDao;
import com.hiveview.entity.MemberRecommend;
import com.hiveview.service.IMemberRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class MemberRecommentServiceImpl implements IMemberRecommendService {

    @Autowired
    private IMemberRecommendDao memberRecommendDao;


    @Override
    public List<MemberRecommend> getMemberRecommendPage(MemberRecommend memberRecommend) {
        return memberRecommendDao.getList(memberRecommend);
    }

    @Override
    public void updateRecommend(MemberRecommend memberRecommend) {
        memberRecommendDao.updateByPrimaryKeySelective(memberRecommend);
    }

    @Override
    public void saveRecommend(MemberRecommend memberRecommend) {
        memberRecommendDao.insertSelective(memberRecommend);
    }

    @Override
    public MemberRecommend getMemberRecommendByMId(long memberId) {
        MemberRecommend memberRecommend = new MemberRecommend();
        memberRecommend.setMemberId(memberId);
        List<MemberRecommend> memberRecommends = memberRecommendDao.getList(memberRecommend);
        return Optional.ofNullable(memberRecommends).filter(p -> p.size() >0).map(p1 -> p1.get(0)).orElse(null);
    }

    @Override
    public void deleteById(long recommendId) {
        memberRecommendDao.deleteByPrimaryKey(recommendId);
    }

    @Override
    public List<MemberRecommend> getMemberRecommendList(MemberRecommend memberRecommend) {
        return memberRecommendDao.getRecommendList(memberRecommend);
    }
}
