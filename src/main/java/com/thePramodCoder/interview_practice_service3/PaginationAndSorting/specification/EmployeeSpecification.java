//package com.thePramodCoder.interview_practice_service3.PaginationAndSorting.specification;
//
//import com.thePramodCoder.interview_practice_service3.PaginationAndSorting.model.Employee;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Predicate;
//import jakarta.persistence.criteria.Root;
//import org.jspecify.annotations.Nullable;
//import org.springframework.data.jpa.domain.Specification;
//
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//public class EmployeeSpecification {
//
//    public static Specification<Employee> getSpecification(Long id, String name,
//                                                String department, Date startDate, Date endDate){
//
//        return new Specification<Employee>() {
//            @Override
//            public @Nullable Predicate toPredicate(Root<Employee> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//
//                List<Predicate> list = new ArrayList<>();
//
//                if(name!=null && !name.isEmpty()){
//                    list.add(criteriaBuilder.like(root.get("name"), "%"+ name + "%"));
//                }
//                if(id!=null){
//                    list.add(criteriaBuilder.equal(root.get("id"),id));
//                }
//                if(department!=null && !department.isEmpty()){
//                    list.add(criteriaBuilder.equal(root.get("dept"),department));
//                }
//                if(startDate!=null && endDate!=null){
//                    list.
//                  add(criteriaBuilder.and(criteriaBuilder.lessThanOrEqualTo(root.get("joiningDate"),
//                  endDate),criteriaBuilder.greaterThanOrEqualTo(root.get("joiningDate"),startDate)));
//                }
//                return criteriaBuilder.or(list.toArray(new Predicate[0]));
//            }
//        };
//    }
//}
