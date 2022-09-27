package com.cydeo.model;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

   // @NotNull       ---> Field shouldn't be null
   // @NotEmpty      ---> Field shouldn't be ""
   // @NotBlank      ---> Field shouldn't be "      "

    // @NotNull -> @NotNull                          - we can use with any kind of objects
    // @NotEmpty -> @NotNull + @NotEmpty             - only with strings
    // @NotBlank -> @NotNull + @NotEmpty + @NotBlank - only with strings


    @NotBlank
    @Size(max=12,min=2)
    private String firstName;
    private String lastName;

    //Thymeleaf accepts yyyy-MM-dd, but LocalDate accepts mm-dd-yyyy
    //@NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    //@NotBlank
    //@Email
    private String email;
    //@NotBlank
    //@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,}")
    private String password;
    private String address;
    private String address2;
    private String city;
    private String state;
    private String zipCode;





}
