package com.thePramodCoder.interview_practice_service3.ServiceVsControllerVsRepositoryy;

//import com.thePramodCoder.interview_practice_service3.DataBaseConnection.Employees;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository  {

    public EmployeeRepository(){
        System.out.println("EmployeeRepository Bean is created ");
    }


    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    public Employee getEmployeeFromDb(Long id){
        return entityManager.createQuery("select e from Employee e where e.id =:id",
                        Employee.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
