package com.springboot.binding;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {
	
	
	@NotEmpty(message="uname is required")
	@Size(min = 3, max = 8, message = "Uname should be 3 to 8 characters")
	private String uname;
	
	@NotEmpty(message="pwd is required")
	private String pwd;
	
	@NotEmpty(message="email is required")
	@Email(message="Enter valid Email id")
	private String email;
	
	@NotEmpty(message="phno is required")
	@Size(min = 10 , message = "phno should have atleast 10 digits")
	private String phno;
	
	@NotNull(message="age is required")
	@Min(value = 21, message= "Age should be minimum 21 years")
	@Max(value = 60, message= "Age should be minimum 21 years")
	private Integer age;	
	
	
}
