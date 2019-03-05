package com.cloud.client.filter;

import com.alibaba.fastjson.JSON;
import com.cloud.client.annotation.NotNeedLogin;
import com.cloud.common.Sessions;
import com.cloud.common.SingleResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ApiInterceptor implements HandlerInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(ApiInterceptor.class);
    private String salt="ed4ffcd453efab32";
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("进入拦截器");
        if (handler instanceof HandlerMethod) {
            HandlerMethod hm = (HandlerMethod) handler;
            if (hm.getMethod().getAnnotation(NotNeedLogin.class) != null
                    || hm.getBeanType().getAnnotation(NotNeedLogin.class) != null) {
            }else {
                if(!Sessions.isLogin(request)) {
                    response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                    SingleResult resp = SingleResult.buildFailure( "登陆过期", "000");
                    render(JSON.toJSONString(resp), response);
                    return false;
                }
            }
        }
        return true;
    }
    public void render(String text, HttpServletResponse res) throws IOException {
        try {
            res.getWriter().write(text);
            res.getWriter().flush();
        }finally {
            try {
                res.getWriter().close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}