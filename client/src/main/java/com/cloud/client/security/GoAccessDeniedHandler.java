package com.cloud.client.security;

import com.alibaba.fastjson.JSON;
import com.cloud.common.SingleResult;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoAccessDeniedHandler  implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AccessDeniedException e) throws IOException, ServletException {
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");
        SingleResult responseBean=SingleResult.buildFailure("403","您的权限不足，无法访问该资源");
        httpServletResponse.getWriter().write(JSON.toJSONString(responseBean));
        httpServletResponse.getWriter().flush();
    }

}

