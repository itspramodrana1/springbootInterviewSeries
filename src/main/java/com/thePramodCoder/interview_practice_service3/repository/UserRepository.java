package com.thePramodCoder.interview_practice_service3.repository;

import com.thePramodCoder.interview_practice_service3.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {


}
