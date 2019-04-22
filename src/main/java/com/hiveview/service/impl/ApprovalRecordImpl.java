package com.hiveview.service.impl;

import com.hiveview.dao.IApprovalRecordDao;
import com.hiveview.entity.ApprovalRecord;
import com.hiveview.service.IApprovalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hxq on 2017/3/13.
 */
@Service
public class ApprovalRecordImpl implements IApprovalRecordService {

    @Autowired
    private IApprovalRecordDao approvalRecordDao;


    @Override
    public List<ApprovalRecord> getApprovalList(ApprovalRecord approvalRecord) {
        return approvalRecordDao.getList(approvalRecord);
    }

    @Override
    public int saveApproval(ApprovalRecord approvalRecord) {
        return approvalRecordDao.insert(approvalRecord);
    }
}
