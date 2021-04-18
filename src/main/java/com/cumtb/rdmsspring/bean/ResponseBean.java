package com.cumtb.rdmsspring.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangdehao
 * 2021/4/15
 * 公共返回对象
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseBean {
    private long code;
    private String message;
    private Object object;

    /**
     * 成功返回结果
     * @param message
     * @return
     */
    public static ResponseBean success(String message){
        return new ResponseBean(200,message,null);
    }

    /**
     * 成功返回结果
     * @param message
     * @param object
     * @return
     */
    public static ResponseBean success(String message,Object object){
        return new ResponseBean(200,message,object);
    }

    /**
     * 失败返回结果
     * @param message
     * @return
     */
    public static ResponseBean error(String message){
        return new ResponseBean(500,message,null);
    }

    /**
     * 失败返回结果
     * @param message
     * @param object
     * @return
     */
    public static ResponseBean error(String message,Object object){
        return new ResponseBean(500,message,object);
    }
}
