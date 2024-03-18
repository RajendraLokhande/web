package com.blog.serviceImpl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.entity.Category;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payload.ApiResponse;
import com.blog.payloads.CategoryDto;
import com.blog.repository.CategoryRepo;
import com.blog.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	//private static final Object CategoryDto = null;

	//private static final Object CategotyDto = null;

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
   
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category save = this.categoryRepo.save(category);
		
		return this.modelMapper.map(save, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
	Category category = this.categoryRepo.findById(categoryId).orElseThrow(()->
	new ResourceNotFoundException("Category", "Category Id", categoryId));
	
	category.setCategoryTitle(categoryDto.getCategoryTitle());
	category.setCategoryDescription(categoryDto.getCategoryDescription());
	
	Category updatedcategory = this.categoryRepo.save(category);
	
		return modelMapper.map(updatedcategory, CategoryDto.class);
	}
	
//	@Override
//	public CategoryDto deleteCategory(Integer categoryId) {
//		
//		Category category = categoryRepo.findById(categoryId).orElseThrow();
//		categoryRepo.delete(category);
//		
//		return this.modelMapper.map(category, CategoryDto.class);
//		
//		boolean category = categoryRepo.findById(categoryId).orElseThrow(()->
//		new ResourceNotFoundException("Category", "CategoryId", categoryId));
//		
//		categoryRepo.delete(category);
//	
//	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()->
		new ResourceNotFoundException("Category", "CategoruId", categoryId ));
		
		
		return this.modelMapper.map(category, CategoryDto.class);
	
	}

	@Override
	public List<CategoryDto> getAllCategory() {
	 List<Category> list = this.categoryRepo.findAll();
     List<CategoryDto>list2 = list.stream().map((list1)->this.modelMapper.map(list1, CategoryDto.class)).collect(Collectors.toList());		

	 return list2;
	}

	@Override
	public String deleteCategory(Integer cagegoryId) {
		
		Category category = categoryRepo.findById(cagegoryId).orElseThrow();
		categoryRepo.deleteById(cagegoryId);
		if(category!=null) {
			return "Catagory Deleted";
		}else {
			return "Id Not found";
		}
		
	}

	

}
	