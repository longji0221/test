package com.cloud.client.security;

import com.alibaba.fastjson.JSON;
import com.cloud.common.SingleResult;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
//        httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
//        httpServletResponse.getWriter().print("{\"code\":401,\"未登陆时无法访问该资源\":\""+e.getMessage()+"\"}");
//        httpServletResponse.getWriter().flush();
//
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");
        SingleResult responseBean=SingleResult.buildFailure("403","无法访问该资源");
        httpServletResponse.getWriter().write(JSON.toJSONString(responseBean));
        httpServletResponse.getWriter().flush();
    }
}
