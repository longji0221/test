package com.cloud.client.controller;

import com.alibaba.fastjson.JSON;
import com.cloud.client.dao.FinUserDao;
import com.cloud.client.entity.FinUserDo;
import org.elasticsearch.client.transport.TransportClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


@RestController
public class HelloController {

    @Autowired
    private FinUserDao finUserDao;

    @Autowired
    private TransportClient client;

    @Value("${server.port}")
    private int port;

    @Value("${hello}")
    private String hello;

    @RequestMapping("/config")
    public String hello(){
        Map<String,Object> map=new HashMap<>();
        map.put("id","2");
        map.put("title","testjava");
        client.prepareIndex("momo","test03").setSource(map).get();
        return "Hello World!,端口："+port+"config:"+hello;
    }


    @RequestMapping("/signup")
    public String insert(FinUserDo finUserDo){
        finUserDo.setIdNumber("341222test111");
        finUserDo.setMobile("13136192222");
        finUserDo.setGender("M");
        finUserDo.setUserName("jilong");
        finUserDo.setBirthday("19940229");
        finUserDao.saveRecord(finUserDo);
        return "";
    }

    @RequestMapping("/find")
    public String find(){
        return JSON.toJSONString(finUserDao.find());
    }

}
