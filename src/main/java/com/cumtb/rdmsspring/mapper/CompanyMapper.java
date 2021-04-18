package com.cumtb.rdmsspring.mapper;

import com.cumtb.rdmsspring.entity.Company;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhangdehao
 * @since 2021-04-17
 */
@Mapper
public interface CompanyMapper extends BaseMapper<Company> {

}
