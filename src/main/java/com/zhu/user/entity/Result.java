package com.zhu.user.entity;

import lombok.Data;

@Data
public class Result {
    private int code;
    private String msg;
    private Object data;

    public static Result success(String msg){
        Result result=new Result();
        result.setCode(0);
        result.setMsg(msg);
        return result;
    }

    public static Result success(String msg,Object data){
         Result result=new Result();
         result.setCode(0);
         result.setMsg(msg);
         result.setData(data);
         return result;
    }

    public static Result error(int code,String msg){
       Result  result=new Result();
       result.setCode(code);
       result.setMsg(msg);
       return result;
    }
}
