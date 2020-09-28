package com.guoyuhang.wx_cms.common;

import lombok.Data;

/**
 * @author yuhang.guo2
 * @date 2020-09-28 11:33
 * @description:
 */
@Data
public class JsonResult {
    private String msg;
    private Integer code;
    private Object data;

    public JsonResult(Integer code ,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public JsonResult(Object data){
        this.data = data;
    }
}
