package com.cumtb.rdmsspring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cumtb.rdmsspring.entity.Report;
import com.cumtb.rdmsspring.mapper.ReportMapper;
import com.cumtb.rdmsspring.service.IReportService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cumtb.rdmsspring.util.GlobalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class ReportServiceImpl extends ServiceImpl<ReportMapper, Report> implements IReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<Report> getReports(Integer projectId) {
        return reportMapper.selectList(new QueryWrapper<Report>().eq("projectId",projectId));
    }

    @Override
    public boolean isContained(Report report) {
        return reportMapper.selectById(report.getReportId()) != null;
    }
}
