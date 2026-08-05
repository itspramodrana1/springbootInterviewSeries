package com.thePramodCoder.interview_practice_service3.validation;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @NotNull(message = "Name cannot be null")
    private String name;
    @NotEmpty(message = "username cannot empty")
    private String username;
    @NotBlank(message = "Password must not be blank")
    @Size(min = 6, max = 20, message = "Password must be greater than equal to 6 and less than equal to 20")
    private String password;
    @Min(value = 18, message = "Age should be > 18")
    @Max(value = 60, message = "Age should < 60")
    private int age;
    @Positive(message = "Salary should be greater than 0")
    private Double salary;
    @Digits(integer = 6, fraction = 2, message = "Account balance must not be greater than 6 figures")
    private Double accountBalance;
    @Email(message = "It should be a proper Email format")
    private String email;
    @Pattern(
            regexp = "^[A-Za-z0-9._%+-]+@thePramodCoder\\.com$",
            message = "Email must be a valid corporate email ending with @thePramodCoder.com"
    )
    private String corporateEmail;
    @Past(message = "Date of Birth must be some past date")
    private LocalDate dob;
    @Future(message = "Expiry must be some future date")
    private LocalDate userExpiry;
    @Size(min = 1, message = "There be 1 must hobby for the user" )
    @NotNull(message = "Hobbies must not be null")
    private List<String> hobbies;
    @PhoneNumber
    private String phoneNumber;
}