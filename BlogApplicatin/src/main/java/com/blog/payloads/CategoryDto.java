package com.blog.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
	
	private Integer id;
	
	@NotBlank
	@Size(min = 4)
	private String categoryTitle;
	
	@NotBlank
	@Size(min = 10)
	private String categoryDescription;
	
}