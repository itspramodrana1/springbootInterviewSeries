package com.thePramodCoder.interview_practice_service3.Config;

import com.thePramodCoder.interview_practice_service3.Interceptors.RoleCheckInterceptor;
import com.thePramodCoder.interview_practice_service3.Interceptors.TimingInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Autowired
    private RoleCheckInterceptor roleCheckInterceptor;

    @Autowired
   private TimingInterceptor timingInterceptor;


    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(roleCheckInterceptor)
                        .addPathPatterns("/admin/*");
        registry.addInterceptor(timingInterceptor);
    }
}
