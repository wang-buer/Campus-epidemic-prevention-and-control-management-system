package com.yang67.outbreakservers.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yang67.outbreakservers.common.Result;
import com.yang67.outbreakservers.entity.Leave;

public interface LeaveService extends IService<Leave> {
    //老师审核该假条
    Result UpdLeaveInfo(String leaveId, String leaveState, String leaveNo);
}
