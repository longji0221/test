package com.cloud.feign.error;

import com.cloud.feign.error.api.ApiError;
import com.cloud.feign.request.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiRequestError implements ApiService {


    @Override
    public String index() {
        return "服务发生故障！";
    }

    @Override
    public String c() {
        return null;
    }
}
