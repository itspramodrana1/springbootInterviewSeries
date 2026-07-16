//package com.thePramodCoder.interview_practice_service3.service;
//
//import com.thePramodCoder.interview_practice_service3.entity.User;
//import com.thePramodCoder.interview_practice_service3.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Transactional(propagation = Propagation.NOT_SUPPORTED)
//    public void debit(Long userId, Double amount){
//        User user = userRepository.findById(userId).orElseThrow();
//        user.setBalance(user.getBalance() - amount);
//        userRepository.save(user);
//        user.setBalance(user.getBalance() - amount);
//        userRepository.save(user);
//    }
//
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void credit(Long userId, Double amount){
//        User user = userRepository.findById(userId).orElseThrow();
//        user.setBalance(user.getBalance() + amount);
//        userRepository.save(user);
//         int a = 10;
//          a = a/0;
//        user.setBalance(user.getBalance() + amount);
//        userRepository.save(user);
//    }
//}
