//package com.thePramodCoder.interview_practice_service3.GlobalExceptionHandler;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TestController {
//
//    @GetMapping("/api1")
//    public String method1(){
//            int a = 1/0;
//      return "Hii";
//    }
//
//    @GetMapping("/api2")
//    public String method2() throws TestException{
//            String s = null;
//            if(s.length()==3){
//                System.out.println("This is Built in Exception");
//            }
//            return "Hi";
//
//      //   throw new TestException("This is a test Exception");
//    }
//
//    @GetMapping("/api3")
//    public String method3() throws TestException{
//            throw new TestException("This is a test Exception");
//        }
//}
