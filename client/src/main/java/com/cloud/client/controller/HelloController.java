package com.cloud.client.controller;

import com.cloud.client.dao.FinUserDao;
import com.cloud.client.entity.FinUserDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @Autowired
    private FinUserDao finUserDao;

    @Value("${server.port}")
    private int port;

    @Value("${hello}")
    private String hello;

    @RequestMapping("/config")
    public String hello(){
        return "Hello World!,端口："+port+"config:"+hello;
    }


    @RequestMapping("/signup")
    public String insert(FinUserDo finUserDo){
        finUserDao.saveRecord(finUserDo);
        return "";
    }


}
