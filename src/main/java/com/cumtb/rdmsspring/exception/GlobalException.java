package com.cumtb.rdmsspring.exception;

import com.cumtb.rdmsspring.bean.ResponseBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 * @author zhangdehao
 * 2021/4/22
 */
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLException.class)
    public ResponseBean myException(SQLException e){
        if(e instanceof SQLIntegrityConstraintViolationException){
            return ResponseBean.error("该数据有关联数据，操作失败");
        }
        return ResponseBean.error("数据库异常，操作失败");
    }
}
