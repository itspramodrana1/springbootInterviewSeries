package com.thePramodCoder.interview_practice_service3.Interceptors;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class RoleCheckInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception{
        String role = request.getHeader("Role");
        if(role == null || !role.equals("ADMIN")){
            response.setStatus(HttpServletResponse.SC_FORBIDDEN);
            response.getWriter().write("Access Denied : Admins only. ");
            return false;
        }
        System.out.println("INTERCEPTOR -> User role is valid : "+ role);
        return true;
    }


    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) {
        System.out.println("INTERCEPTOR -> PostHandle : Controller execute successfully. ");
    }

}
