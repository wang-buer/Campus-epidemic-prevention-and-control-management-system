package com.yang67.outbreakservers.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang67.outbreakservers.entity.Leave;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;
@Mapper
public interface LeaveMapper extends BaseMapper<Leave> {
    int UpdLeaveInfo(Map<String,String> map);
}
