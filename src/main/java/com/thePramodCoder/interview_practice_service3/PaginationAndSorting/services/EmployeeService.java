//package com.thePramodCoder.interview_practice_service3.PaginationAndSorting.services;

//import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.model.Employee;
//import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.repository.EmployeeRepository;
//import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.specification.EmployeeSpecification;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.jpa.domain.Specification;
//import org.springframework.stereotype.Service;

//import java.util.Date;
//import java.util.List;
//
//@Service
//public class EmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//               // Lecture Pagination 1
////    public List<Employee> fetchAllEmployees(Pageable pageable, String search){
////
////        if(search == null) {
////            return employeeRepository.findAll(pageable).getContent();
////        }else{
////            return employeeRepository.findByName(search, pageable).getContent();
////        }
////    }
//
//                          // Lecture Pagination 2
//    public List<Employee> fetchAllEmployees(Pageable pageable, Long id, String name, String department, Date startDate, Date endDate){
//
//        Specification<Employee> spec = EmployeeSpecification.getSpecification(id,name,department,startDate,endDate);
//        return employeeRepository.findAll(spec, pageable).getContent();
//
//    }
//}
