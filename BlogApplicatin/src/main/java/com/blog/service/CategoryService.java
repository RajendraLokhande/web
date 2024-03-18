package com.blog.service;

import java.util.List;

import com.blog.payloads.CategoryDto;

public interface CategoryService {
	
	
	
	//create
    public CategoryDto createCategory (CategoryDto categoryDto);	
    
    //update
    public CategoryDto updateCategory(CategoryDto categoryDto, Integer Id);
	
	//delete
     public String deleteCategory(Integer cagegoryId);
	
	//get
    public CategoryDto getCategory(Integer categoryId);
	
	//get All
    public List<CategoryDto>getAllCategory();
	
	
}
