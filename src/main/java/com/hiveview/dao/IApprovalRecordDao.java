package com.hiveview.dao;

import com.hiveview.entity.ApprovalRecord;

public interface IApprovalRecordDao extends IBaseDao<ApprovalRecord>{
    int deleteByPrimaryKey(Long id);

    int insert(ApprovalRecord record);

    int insertSelective(ApprovalRecord record);

    ApprovalRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApprovalRecord record);

    int updateByPrimaryKey(ApprovalRecord record);
}