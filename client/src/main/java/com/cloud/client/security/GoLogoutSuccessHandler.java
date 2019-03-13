package com.cloud.client.security;

import com.alibaba.fastjson.JSON;
import com.cloud.common.SingleResult;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class GoLogoutSuccessHandler implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        httpServletResponse.setHeader("Content-Type", "application/json;charset=utf-8");
        SingleResult responseBean= SingleResult.buildFailure("200","注销成功");
        httpServletResponse.getWriter().write(JSON.toJSONString(responseBean));
        httpServletResponse.getWriter().flush();

    }

}

