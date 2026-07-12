//package com.thePramodCoder.interview_practice_service3.RequestVsSessionScope;
//
//import com.thePramodCoder.interview_practice_service3.BeanScope.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//// @Scope("prototype")
////Scope("request")
////@Scope("session")
//public class StudentController {
//
//    @Autowired
//    private Student student1;
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping("/student1")
//    public void getStudent1Address(){
//        System.out.println( "H1 : "+ student1.hashCode());
//        System.out.println("h2 : " +studentService.getStudent().hashCode());
//    }
//
//}
