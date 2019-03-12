package com.cloud.client.controller;

import com.cloud.client.dao.FinUserDao;
import com.cloud.client.entity.FinUserDo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class HelloController {

    @Resource
    private FinUserDao finUserDao;

    @Value("${server.port}")
    private int port;

    @Value("${hello}")
    private String hello;

    @RequestMapping("/index")
    public String index(){
        return "Hello World!,端口："+port;
    }

    @RequestMapping("/config")
    public String hello(){
        return "Hello World!,端口："+port+"config:"+hello;
    }


    @RequestMapping("/insert")
    public String insert(FinUserDo finUserDo){
        finUserDao.saveRecord(finUserDo);
        return "";
    }


}
