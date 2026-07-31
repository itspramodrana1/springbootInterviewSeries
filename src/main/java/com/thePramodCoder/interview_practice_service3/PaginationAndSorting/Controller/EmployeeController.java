package com.thePramodCoder.interview_practice_service3.PaginationAndSorting.Controller;

import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.model.Employee;
import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public List<Employee> getEmployee(@RequestParam(required = false, defaultValue = "1") int pageNo,
                                      @RequestParam(required = false, defaultValue = "5") int pageSize,
                                      @RequestParam(required = false, defaultValue = "id") String sortBy,
                                      @RequestParam(required = false, defaultValue = "ASC") String sortDir,
                                      @RequestParam(required = false) Long id,
                                      @RequestParam(required = false) String name,
                                      @RequestParam(required = false) String department,
                                      @RequestParam(required = false) Date startDate,
                                      @RequestParam(required = false) Date endDate){
        Sort sort = null;
        if(sortDir.equalsIgnoreCase("ASC")){
            sort = Sort.by(sortBy).ascending();
        }else {

            sort = Sort.by(sortBy).descending();
        }
        return employeeService.fetchAllEmployees(PageRequest.of(pageNo-1,pageSize,sort),id,name,department,startDate,endDate);
    }
}
