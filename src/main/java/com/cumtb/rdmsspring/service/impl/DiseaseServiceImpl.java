package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Disease;
import com.cumtb.rdmsspring.mapper.DiseaseMapper;
import com.cumtb.rdmsspring.service.IDiseaseService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cumtb.rdmsspring.util.GlobalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-30
 */
@Service
public class DiseaseServiceImpl extends ServiceImpl<DiseaseMapper, Disease> implements IDiseaseService {

    @Autowired
    private DiseaseMapper diseaseMapper;

    @Override
    public List<Disease> getDiseases(Integer detectionId) {
        return diseaseMapper.selectList(new QueryWrapper<Disease>().eq("detectionId",detectionId));
    }

    @Override
    public boolean isContained(Integer diseaseId) {
        return diseaseMapper.selectById(diseaseId) != null;
    }

    @Override
    public boolean getDiseasesRemove(Integer detectionId) {
        List<Disease> diseases = diseaseMapper.selectList(new QueryWrapper<Disease>().eq("detectionId",detectionId));
        for(Disease disease : diseases){
            if(!removeById(disease.getDiseaseId())){
                return false;
            }
        }
        return true;
    }
}
