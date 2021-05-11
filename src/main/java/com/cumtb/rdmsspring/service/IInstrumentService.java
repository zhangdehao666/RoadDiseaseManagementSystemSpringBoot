package com.cumtb.rdmsspring.service;

import com.cumtb.rdmsspring.entity.Instrument;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cumtb.rdmsspring.entity.Repair;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
public interface IInstrumentService extends IService<Instrument> {

    Instrument getInstrument(Integer detectionId);

    boolean isContained(Instrument instrument);

    boolean getInstrumentRemove(Integer detectionId);

}
