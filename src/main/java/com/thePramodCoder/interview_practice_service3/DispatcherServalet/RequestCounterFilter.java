package com.thePramodCoder.interview_practice_service3.DispatcherServalet;

import jakarta.servlet.*;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class RequestCounterFilter implements Filter {

    private int counter = 0;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("FILTER -> RequestCounterFilter -> PreProcessing in filter");

        counter++;
        request.setAttribute("requestNumber", counter);

        chain.doFilter(request, response);

        response.getWriter().write("Request #" + counter + " processed");

        System.out.println("FILTER -> RequestCounterFilter -> PostProcessing in filter");
    }
}
