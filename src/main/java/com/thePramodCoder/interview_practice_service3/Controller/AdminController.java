package com.thePramodCoder.interview_practice_service3.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("/panel")
    public void adminPanel(HttpServletRequest request) {
        System.out.println("Thread Id -> " + request.getAttribute("threadId") + "Request Number -> " + request.getAttribute("reuqestNumber")
                + "Entered into admin panel");
    }
    }