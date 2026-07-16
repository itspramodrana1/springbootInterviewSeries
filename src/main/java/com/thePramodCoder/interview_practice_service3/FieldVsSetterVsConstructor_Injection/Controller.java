package com.thePramodCoder.interview_practice_service3.FieldVsSetterVsConstructor_Injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    private final Employee employee;

//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    @Autowired
    public Controller(Employee employee) {
        this.employee = employee;
    }

    @GetMapping("/employee")
    public Employee getEmployee(){
      employee.setId(1);
      employee.setName("Pramod");
        return employee;
    }


}
