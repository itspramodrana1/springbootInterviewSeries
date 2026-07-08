package com.thePramodCoder.interview_practice_service3.ServiceVsControllerVsRepositoryy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

        public EmployeeService(){
        System.out.println("Employee Service Bean is Created ");
    }

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee getEmployee(Long id){

        try{
            return employeeRepository.getEmployeeFromDb(id);
        }catch (Exception e){
            System.out.println("Exception class : "+ e.getClass());
        }
        return null;
    }

}
