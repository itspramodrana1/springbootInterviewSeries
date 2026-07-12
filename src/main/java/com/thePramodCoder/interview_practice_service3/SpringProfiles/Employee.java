package com.thePramodCoder.interview_practice_service3.SpringProfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class Employee {
    public Employee() {
        System.out.println("This is Employee bean ");
    }
}
