package com.thePramodCoder.interview_practice_service3.DispatcherServalet;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class ThreadIdFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("FILTER -> ThreadIdFilter -> PreProcessing in filter");

        long threadId = Thread.currentThread().getId();
        request.setAttribute("threadId", threadId);

        chain.doFilter(request, response);

        System.out.println("FILTER -> ThreadIdFilter -> PostProcessing in filter");
    }
}
