package com.cloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {


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

}
