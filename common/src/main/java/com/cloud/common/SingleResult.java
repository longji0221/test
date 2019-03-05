package com.cloud.common;

public class SingleResult {
    public String msg;

    public String code;

    private SingleResult(String msg,String code){
        this.code=code;
        this.msg=msg;
    }
    public static SingleResult buildFailure(){
        return new SingleResult("请求失败","100");
    }

    public static SingleResult buildFailure(String msg,String code ){
        return new SingleResult(msg,code);
    }
}
