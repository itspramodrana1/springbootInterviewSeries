package com.thePramodCoder.interview_practice_service3.PaginationAndSorting.services;

import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.model.Employee;
import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> fetchAllEmployees(Pageable pageable, String search){

        if(search == null) {
            return employeeRepository.findAll(pageable).getContent();
        }else{
            return employeeRepository.findByName(search, pageable).getContent();
        }
    }
}
