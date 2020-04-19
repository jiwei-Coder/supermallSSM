package com.exception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        //默认的异常视图名称
        modelAndView.setViewName("error");
        modelAndView.addObject("ex","我是一个默认的异常信息");
        if(ex instanceof TestException){
            TestException testException = (TestException) ex;
            //指定的异常视图名称
            modelAndView.setViewName("error1");
            modelAndView.addObject("ex",testException.getMsg());
        }
        return modelAndView;
    }
}
