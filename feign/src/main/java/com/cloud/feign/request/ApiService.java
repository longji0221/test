package com.cloud.feign.request;

import com.cloud.feign.error.ApiRequestError;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient",fallback = ApiRequestError.class)
public interface ApiService {

     @RequestMapping(value = "/index",method = RequestMethod.GET)
     String index();


}
