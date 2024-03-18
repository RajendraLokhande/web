package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.payload.ApiResponse;
import com.blog.payloads.CategoryDto;
import com.blog.service.CategoryService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	// create
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto>addCategory(@RequestBody CategoryDto categoryDto){
		
	CategoryDto category = this.categoryService.createCategory(categoryDto);
		
	return new ResponseEntity<CategoryDto>(category, HttpStatus.CREATED);
			
	}
	
	//update
	
	@PutMapping("/{updateId}")
	public ResponseEntity<CategoryDto>updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Integer categoryId){
		CategoryDto updatedCategory = this.categoryService.updateCategory(categoryDto, categoryId);	
		
		return new ResponseEntity<CategoryDto>(updatedCategory, HttpStatus.OK);
		
		
	}
	
	//delete
	
	@DeleteMapping("/delete/{categoryId}")
	public ResponseEntity<ApiResponse>deleteCategory(@PathVariable Integer categoryId){
	
		categoryService.deleteCategory(categoryId);
		
		return new ResponseEntity<>(new ApiResponse("catagort deleted..",true), HttpStatus.OK);
		
//			this.categoryService.deleteCategory(categoryId);
//		return new ResponseEntity<ApiResponse>(new ApiResponse("category is deleted successfully  !!", true), HttpStatus.OK);
//		
	}
	  
	//get
	
	@GetMapping("/{getId}")
    public ResponseEntity<CategoryDto>getCategory(@PathVariable Integer categoryId){
		
		CategoryDto categoryDto = this.categoryService.getCategory(categoryId);
		
	    return new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
	
}

	// get ALL
	@GetMapping("/{getAllId}")
	public ResponseEntity<List<CategoryDto>>getAllCategory(){
		List<CategoryDto> list = this.categoryService.getAllCategory();
		
		
		return new ResponseEntity<List<CategoryDto>>(list, HttpStatus.OK);// return ResponseEntity.ok(categories);
		
	}
	
	
}











