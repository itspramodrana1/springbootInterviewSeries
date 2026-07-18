//package com.thePramodCoder.interview_practice_service3.Controller;
//
//import com.thePramodCoder.interview_practice_service3.Lookup.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@Scope("prototype")
//public class StudentContr {
//
//    @Autowired
//    private Student student;
//
//    public StudentContr(){
//        System.out.println("Student controller bean " + this.hashCode());
//    }
//
//    @GetMapping("/student")
//    public Integer getStudentAddress(){
//        return student.hashCode();
//    }
//}
