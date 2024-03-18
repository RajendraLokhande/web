package com.springboot.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardDto {

	private Integer id;
	private String cardholderName;
	private String cardno;
	private String expiryDate;
	
	
}
