package com.hiveview.service;

import com.hiveview.entity.Attribute;
import com.hiveview.entity.Need;
import com.hiveview.entity.UserNeed;

import java.util.List;
import java.util.Map;

/**
 * Created by hxq on 2017/3/13.
 */
public interface INeedService {

    int saveNeed(Need need);

    /**
     * 获得需求页
     * @param need
     * @return
     */
    List<Need> getNeedPage(Need need);

    int updateNeed(Need need);

    Need getNeedById(Long needId);

    List<Need> getOpendNeedPage(Need need);

    Need getNeedDetail(long needId);

    /**
     * 删除需求属性
     * @return
     */
    int deleteAttributeByNeedId(Long needId);

    /**
     * 批量存储
     * @param attributes
     * @return
     */
    int batchSaveAttr(List<Attribute> attributes);

    /**
     * List<Attribute> attributes
     * @param needId
     * @return
     */
    List<Attribute> getNeedAttr(Long needId);

    /**
     * 根据需求ID增加此需求的点击量
     * @param needId
     */
    int addHitsByNid(long needId);

    /**
     * 增加会员查看付费需求记录
     * @param memberId
     * @param needId
     * @return
     */
    int addMemberViewNeedRecord(Long memberId, long needId);

    /**
     * 此需求是否被查看过
     * @param memberId
     * @param needId
     * @return
     */
    boolean isViewed(Long memberId, long needId);

    /**用户从前台发布的需求（类似帮我找）start **/
    List<UserNeed> getUserNeed(UserNeed userNeed);
    int updateUserNeedByPrimaryKey(UserNeed userNeed);
    int addUserNeed(UserNeed userNeed);
    public List<Map<String,Object>> getLiuYanList(Map<String, Object> map);
    public int deleteUserNeedByIds(List<Integer> ids);
    /**用户从前台发布的需求（类似帮我找）end **/
    
    /**
     *  @功能:根据id删除用户需求信息
     *  @作者:李文辉 
     *  @代号:ab
     *  @时间:2017年5月22日
     *  @param id
     *  @return  
     */
    int deleteUserNeedByPrimaryKey(Integer id);
}
