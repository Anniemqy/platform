package com.hiveview.service;

import com.hiveview.entity.Member;

import java.util.List;
import java.util.Map;

public interface IMemberService {

	/**
	 * 获得会员信息
	 * @param member
	 * @return
	 */
	public Member getMemberInfo(Member member);

	/**
	 * 更新会员信息
	 * @param member
	 * @return
	 */
	Integer updateMember(Member member);

	Integer saveMember(Member member);

	/**
	 * 获得推荐顾问
	 * @return
	 */
	List<Member> getRecommendCounselorList();


	List<Member> getOpendMemberPage(Member member);

    Member getMemberDetail(long memberId);

    Member getMemberById(Long memberId);

	/**
	 * 查询会员的 需求剩余观看次数和是否观看此需求
	 * @param memberId
	 * @param needId
	 * @return  needViewCount  viewId
	 */
	Map<String, Object> getViewNeedCount(Long memberId, long needId);

    List<Member> getMemberList(Member member);

    void updateMemberByMobile(Member member);

	Member getMemberByMobile(String mobile);

	/**
	 * 获得邀请码
	 * @param memberId
	 * @return
	 */
	String getInviteCodeById(long memberId);

	/**
	 * 添加需求查看数通过 邀请码
	 * @param otherInviteCode
	 * @param i
	 */
	void addNeedViewCountByInviteCode(String otherInviteCode, int count);
}

