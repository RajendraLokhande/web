package com.student.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDto {

    private Integer id;
	
	private String fname;
	private String lname;
	private String email;
	private String gender;
    private String courseName;
    private String totalNumber;
	
	
	
	
}
