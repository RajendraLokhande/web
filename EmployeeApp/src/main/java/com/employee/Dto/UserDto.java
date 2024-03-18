package com.employee.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	private Integer id;
	private String fname;
	private String lname;
	private String email;
	private String dob;
	private String comName;
	private Double salary;
	private String joiningDate;
	private String designation;
	
	
	
}
