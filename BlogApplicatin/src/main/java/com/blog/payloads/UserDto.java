package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	
	private Integer id;
    
    @NotEmpty
    @Size(min =4, message = "Username must be min of 4 characters !!")
	private String name;
    
    @Email(message= "Email id is not valid !!")
	private String email;
    
    @NotEmpty
	private String about;
	
	@NotEmpty
	@Size(min= 3, max = 10, message = "Password must be min of 3 chars and max of 10 chars !!")
	private String password;
	
	
	

}
