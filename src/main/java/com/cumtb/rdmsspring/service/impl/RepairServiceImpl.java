package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Repair;
import com.cumtb.rdmsspring.mapper.RepairMapper;
import com.cumtb.rdmsspring.service.IRepairService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@Service
public class RepairServiceImpl extends ServiceImpl<RepairMapper, Repair> implements IRepairService {

    @Autowired
    private RepairMapper repairMapper;

    @Override
    public Repair getRepair(Integer detectionId) {
        return repairMapper.selectOne(new QueryWrapper<Repair>().eq("detectionId",detectionId));
    }

    @Override
    public boolean isContained(Repair repair) {
        return repairMapper.selectById(repair.getRepairId()) != null;
    }

    @Override
    public boolean getRepairRemove(Integer detectionId) {
        Repair repair = repairMapper.selectOne(new QueryWrapper<Repair>().eq("detectionId",detectionId));
        if(repair != null){
            return removeById(repair.getRepairId());
        }
        return true;
    }

}
