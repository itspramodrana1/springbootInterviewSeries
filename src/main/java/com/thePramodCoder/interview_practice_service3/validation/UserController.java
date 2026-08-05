package com.thePramodCoder.interview_practice_service3.validation;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @PostMapping("/user")
    public String createUser(@RequestBody  @Valid User user){


        return "Created a valid user";
    }
}
