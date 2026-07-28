//package com.thePramodCoder.interview_practice_service3.RequestParamVsPathVariable;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class EmployeeController {
//
//    @Autowired
//    private EmployeeService employeeService;
//
//    @GetMapping("/employee/{id}")
//    public Employee getEmployeeById(@PathVariable Long id){
//        return employeeService.getEmployeeById(id)
//                .orElseThrow(() -> new RuntimeException("Employee not found"));
//    }
//
//    @GetMapping("/employee")
//    public List<Employee> getEmployees(@RequestParam(required = false) String department){
//        return employeeService.getEmployees(department);
//    }
//
//    @GetMapping("/employee/{name}/{department}")
//    public Employee getEmployeeByNameAndDepartment(@PathVariable String name, @PathVariable String department){
//        return employeeService.getEmployeeByNameAndDepartment(name,department);
//
//    }
//}
