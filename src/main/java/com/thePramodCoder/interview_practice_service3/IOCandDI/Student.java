package com.thePramodCoder.interview_practice_service3.IOCandDI;

import org.springframework.stereotype.Component;

    // @Component
public class Student {
    public Student(){
        System.out.println("Student bean is created at address " + this.hashCode());
    }
}
