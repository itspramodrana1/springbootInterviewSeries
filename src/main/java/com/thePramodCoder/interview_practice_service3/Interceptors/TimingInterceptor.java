package com.thePramodCoder.interview_practice_service3.Interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class TimingInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler){

        long startTime = System.currentTimeMillis();
        System.out.println("INTERCEPTOR -> [" + request.getMethod() + " " + request.getRequestURI() + "] start time");
        request.setAttribute("startTime ", startTime);
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws  Exception{

        Long startTime = (Long) request.getAttribute("startTime");
        if(startTime != null){
         long duration = System.currentTimeMillis() - startTime;
            System.out.println("INTERCEPTOR -> [" + request.getMethod() +" " + request.getRequestURI() + "] took" + duration + "ms");
        }
    }
}
