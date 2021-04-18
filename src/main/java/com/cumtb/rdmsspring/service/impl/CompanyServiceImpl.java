package com.cumtb.rdmsspring.service.impl;

import com.cumtb.rdmsspring.entity.Company;
import com.cumtb.rdmsspring.mapper.CompanyMapper;
import com.cumtb.rdmsspring.service.ICompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-17
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company> implements ICompanyService {

}
