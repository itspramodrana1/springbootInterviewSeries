package com.thePramodCoder.interview_practice_service3.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

@Mapper(componentModel = "spring")
public interface UserMapper {

   // @BeanMapping(ignoreByDefault = true)
  //  @Mapping(source = "username", target = "name")
   //  @Mapping(source = "dateOfBirth", target = "dob")
    // @Mapping(target = "password", ignore = true)
   // @Mapping(source = "status", target = "status", defaultValue = "INACTIVE")

          @Mapping(source = "user.id", target = "id")
          @Mapping(source = "user.username", target = "name")
          @Mapping(source = "user.dateOfBirth", target = "dob")
          @Mapping(target = "password", ignore = true)
          @Mapping(source = "user.status", target = "status", defaultValue = "INACTIVE")
          @Mapping(source = "contact.mobileNumber", target = "mob", qualifiedByName = "maskPhone")
          @Mapping(source = "contact.email", target = "emailId")
          UserResponse mapUserAndContactToUserResponse(User user, Contact contact);


          @Named("maskPhone")
          public static String getPhoneNumber(String phone){
              return "****" + phone.substring(2);
          }
}
