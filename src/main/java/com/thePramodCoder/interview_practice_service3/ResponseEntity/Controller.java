//package com.thePramodCoder.interview_practice_service3.ResponseEntity;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class Controller {
//
//    @GetMapping("/learn-response-entity")
//    public ResponseEntity<String> learnAboutResponseEntity(){
//      return new ResponseEntity<>("Learning about ResponseEntity", HttpStatus.ACCEPTED);
//    }
//
//    @GetMapping("/learn-response-entity-class")
//    public ResponseEntity<String> learnResponseEntity(){
//        return ResponseEntity.ok("Learning Response Entity Class");
//    }
//
//    @GetMapping("/return-employee")
//    public ResponseEntity<Employee> EmployeeObject(){
//        Employee e1 = new Employee(1l, "Pramod");
//        return ResponseEntity.ok(e1);
//    }
//
//    @GetMapping("/void-response-entity")
//    public ResponseEntity<Void> VoidResponse(){
//        System.out.println("Testing Void API");
//        return ResponseEntity.noContent().build();
//    }
//
//    @PostMapping("/save-Employee")
//    public ResponseEntity<String> SaveEmployee(@RequestBody Employee e1){
//        if(e1.getName()==null){
//            return ResponseEntity.badRequest().body("Name cannot be bull");
//        }
//        return new ResponseEntity<>("e1 is created Successfully", HttpStatus.CREATED);
//    }
//
//
//    @GetMapping("/learn-responseEntity")
//    public ResponseEntity<String> SaveEmployee(){
//        return  ResponseEntity
//                .accepted()
//                .header("X-custom-Header", "PramodCoder")
//                .body("Learning Response Entity");
//    }
//}
