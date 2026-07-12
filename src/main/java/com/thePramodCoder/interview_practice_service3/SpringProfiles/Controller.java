package com.thePramodCoder.interview_practice_service3.SpringProfiles;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/message")
    public String getMessage(){
        return "Hello World";
    }
}
