package com.springboot.Dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
	
	private Integer id;
	
	private String fname;

	private String email;
	
	private String dob;
	
	private String password;

	private String lName;

	private String roles;
}
