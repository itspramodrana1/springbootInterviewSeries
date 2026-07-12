//package com.thePramodCoder.interview_practice_service3.Controller;
//
//import com.thePramodCoder.interview_practice_service3.BeanScope.Student;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

                         // Lectutre SingleTon vs Prototype

//@RestController
//public class StudentController {
//
//    @Autowired
//    private Student student1;
//
//    @Autowired
//    private Student student2;
//
//    @Autowired
//    private Student student3;
//
//    @GetMapping("/student1")
//    public Integer getStudent1Address(){
//        return student1.hashCode();
//    }
//
//    @GetMapping("/student2")
//    public Integer getStudent2Address(){
//        return student2.hashCode();
//    }
//
//    @GetMapping("/student3")
//    public Integer getStudent3Address(){
//        return student3.hashCode();
//    }
//
//    public StudentController() {
//        System.out.println("Student Controller Bean is Created " + this.hashCode());
//    }
//}
