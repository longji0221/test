package com.cloud.feign.cotroller;

import com.cloud.feign.request.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private ApiService apiService;

    @RequestMapping("index")
    public String index(){
        return apiService.index();
    }
}
