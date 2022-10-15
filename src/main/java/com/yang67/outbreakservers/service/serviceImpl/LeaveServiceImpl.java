package com.yang67.outbreakservers.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yang67.outbreakservers.common.Result;
import com.yang67.outbreakservers.entity.Leave;
import com.yang67.outbreakservers.mapper.LeaveMapper;
import com.yang67.outbreakservers.service.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LeaveServiceImpl extends ServiceImpl<LeaveMapper, Leave> implements LeaveService{
    @Autowired
    private LeaveMapper leaveMapper;

    @Override
    public Result UpdLeaveInfo(String leaveId, String leaveState, String leaveNo) {
        Map<String,String> map = new HashMap<>();
        map.put("leaveId",leaveId);
        map.put("leaveState",leaveState);
        map.put("leaveNo",leaveNo);
        if (leaveMapper.UpdLeaveInfo(map) > 0)
            return Result.success();
        return Result.error();
    }
}
