//package com.thePramodCoder.interview_practice_service3.QualiferVsPrimary;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class Controller {
//
//    @Autowired
//    @Qualifier("twoWheelerBean")
//    public Vechicle vechicle;
//
//    @Autowired
//   // @Qualifier("employee1")
//    public Employee employee;
//
//    @GetMapping("/noOfWheels")
//    public int getNoWheels(){
//        System.out.println(employee.getId());
//        System.out.println(employee.getName());
//        employee.getId();
//        return vechicle.noOfWheels();
//    }
//}
