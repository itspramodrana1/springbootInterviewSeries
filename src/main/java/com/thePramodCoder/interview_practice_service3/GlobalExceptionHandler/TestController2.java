//package com.thePramodCoder.interview_practice_service3.GlobalExceptionHandler;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//public class TestController2 {
//
//    @GetMapping("/api1")
//    public void method1(){
//        int a = 1/0;
//    }
//
//    @GetMapping("/api2")
//    public  void method2() throws TestException {
//        String s = null;
//        if(s.length()==3){
//            System.out.println("This is Built in Exception");
//        }
//
//        //   throw new TestException("This is a test Exception");
//    }
//
//    @GetMapping("/api3")
//    public Void method3() throws TestException{
//        throw new TestException("This is a test Exception");
//    }
//
//    @GetMapping("/api4")
//    public Void method4() throws Exception{
//        throw new Exception("This is a test Exception");
//    }
//}
