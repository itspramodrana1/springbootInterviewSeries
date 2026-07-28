//package com.thePramodCoder.interview_practice_service3.RequestParamVsPathVariable;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository repository;
//
//    public Optional<Employee> getEmployeeById(Long id){
//        return repository.findById(id);
//    }
//
//
//    public List<Employee> getEmployees(  String department){
//        if(department != null && !department.isEmpty()){
//            return repository.findByDepartment(department);
//        }
//        return repository.findAll();
//    }
//
//    public Employee getEmployeeByNameAndDepartment(String name, String department) {
//        return repository.findByNameAndDepartment(name,department);
//    }
//}
