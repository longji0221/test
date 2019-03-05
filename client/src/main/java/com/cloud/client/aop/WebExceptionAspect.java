package com.cloud.client.aop;

import com.alibaba.fastjson.JSON;
import com.cloud.common.SingleResult;
import netscape.javascript.JSObject;
import org.apache.commons.lang.StringUtils;
import org.aspectj.apache.bcel.classfile.Code;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;

@Aspect
@Component
public class WebExceptionAspect {

    private static final Logger logger = LoggerFactory.getLogger(WebExceptionAspect.class);    //凡是注解了RequestMapping的方法都被拦截

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private void webPoint(){

    }

    @AfterThrowing(pointcut = "webPointcut()", throwing = "e")
    public void handleThrowing(Exception e){
        try {
            if(StringUtils.isEmpty(e.getMessage())){
            writeContent(JSON.toJSONString(SingleResult.buildFailure()));
        }else {
            writeContent(JSON.toJSONString(SingleResult.buildFailure(e.getMessage(),"100")));
        }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }


    private void writeContent(String content)throws Exception {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getResponse();
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type", "text/plain;charset=UTF-8");
        response.setHeader("icop-content-type", "exception");
        response.getWriter().print(content);
        response.getWriter().close();
    }
}
