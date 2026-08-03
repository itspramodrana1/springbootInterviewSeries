package com.thePramodCoder.interview_practice_service3.mapper;

import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ContactRepository contactRepository;

    private UserMapper userMapper = Mappers.getMapper(UserMapper.class);

    public UserResponse getUserById(Long id){
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));

       Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact Not Found"));

//        UserResponse userResponse = new UserResponse();
//        userResponse.setId(user.getId());
//        userResponse.setName(user.getUsername());
//        userResponse.setDob(DateTimeFormatter.ISO_LOCAL_DATE.format(user.getDateOfBirth()));
//        userResponse.setPassword(user.getPassword());
//        userResponse.setStatus(user.getStatus());

      UserResponse userResponse = userMapper.mapUserAndContactToUserResponse(user,contact);
        return userResponse;
    }
}
