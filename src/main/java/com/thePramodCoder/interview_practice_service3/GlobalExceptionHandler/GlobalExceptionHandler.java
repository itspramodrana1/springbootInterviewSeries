//package com.thePramodCoder.interview_practice_service3.GlobalExceptionHandler;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import com.thePramodCoder.interview_practice_service3.GlobalExceptionHandler.TestController;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
// @RestControllerAdvice
//// @RestControllerAdvice(assignableTypes = TestController.class)
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(ArithmeticException.class)
//    public ResponseEntity<String> handleArithmeticException(ArithmeticException e){
//        return ResponseEntity.badRequest().body(e.getMessage());
//    }
//
//    @ExceptionHandler(NullPointerException.class)
//    public String handleArithmeticException(NullPointerException e){
//        return e.getMessage();
//    }
//
//    @ExceptionHandler(TestException.class)
//    public String handleArithmeticException(TestException e){
//        return e.getMessage();
//    }
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<String> handleException(Exception e){
//        return ResponseEntity.internalServerError().body(e.getMessage());
//    }
//}
