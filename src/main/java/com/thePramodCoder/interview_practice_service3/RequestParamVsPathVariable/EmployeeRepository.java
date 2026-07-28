package com.thePramodCoder.interview_practice_service3.RequestParamVsPathVariable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByDepartment(String department);
    Employee findByNameAndDepartment(String name, String department);
}
