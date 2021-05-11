package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Instrument;
import com.cumtb.rdmsspring.mapper.InstrumentMapper;
import com.cumtb.rdmsspring.service.IInstrumentService;
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
public class InstrumentServiceImpl extends ServiceImpl<InstrumentMapper, Instrument> implements IInstrumentService {

    @Autowired
    private InstrumentMapper instrumentMapper;

    @Override
    public Instrument getInstrument(Integer detectionId) {
        return instrumentMapper.selectOne(new QueryWrapper<Instrument>().eq("detectionId",detectionId));
    }

    @Override
    public boolean isContained(Instrument instrument) {
        return instrumentMapper.selectById(instrument.getInstrumentId()) != null;
    }

    @Override
    public boolean getInstrumentRemove(Integer detectionId) {
        Instrument instrument = instrumentMapper.selectOne(new QueryWrapper<Instrument>().eq("detectionId",detectionId));
        if(instrument != null){
            return removeById(instrument.getInstrumentId());
        }
        return true;
    }
}
