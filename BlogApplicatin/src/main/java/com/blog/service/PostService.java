package com.blog.service;

import java.util.List;

import com.blog.entity.Post;
import com.blog.payload.ApiResponse;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;

//import com.blog.payloads.PostDto;

public interface PostService {

	//create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	//get post
	PostDto getPost(Integer postId);
	
	//get all post
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);
	
	//update post
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete post
    ApiResponse deletePost(Integer postId);
	
    //get All posts by Category
	List<Post> getPostsByCategory(Integer categoryId);
	
	
	
	//get all posts by User
	List<PostDto> getPostsByUser(Integer UserId);
	
	//search Posts
	List<Post> searchPosts(String keyword);

//	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy, String sortDir);

//	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);


	
	
}
