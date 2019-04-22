package com.hiveview.service;

import com.hiveview.entity.ApprovalRecord;
import com.hiveview.entity.Product;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
public interface IApprovalRecordService {


    List<ApprovalRecord> getApprovalList(ApprovalRecord approvalRecord);

    /**
     * 保存审批记录
     * @param approvalRecord
     */
    int saveApproval(ApprovalRecord approvalRecord);
}
