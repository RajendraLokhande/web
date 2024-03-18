package com.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.blog.entity.Post;
import com.blog.payload.ApiResponse;
import com.blog.payloads.PostDto;
import com.blog.payloads.PostResponse;
import com.blog.service.PostService;

@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@PostMapping("/user/{userId}/category/{categoryId}/posts")
	public ResponseEntity<PostDto>createPost(@RequestBody PostDto postDto, @PathVariable Integer userId,
			@PathVariable Integer categoryId ){
		
    PostDto careteDto = this.postService.createPost(postDto, userId, categoryId);
	return new ResponseEntity<PostDto>(careteDto, HttpStatus.CREATED);
		
	}
	
	//get by user
	
	@GetMapping("/user/{userId}/posts")
	public ResponseEntity<List<PostDto>> getPostByUser(@PathVariable Integer userId){
		List<PostDto> list = this.postService.getPostsByUser(userId);
		
		return new ResponseEntity<List<PostDto>>(list, HttpStatus.OK);
	
	}
	//get by category
	
	
	@GetMapping("/user/{categoryId}/posts")
	public ResponseEntity<List<Post>> getPostByCategory(@PathVariable Integer categoryId){
		List<Post> list = this.postService.getPostsByCategory(categoryId);
		
		return new ResponseEntity<List<Post>>(list, HttpStatus.OK);
	}
	
	//get all post
	@GetMapping("/posts")
	public ResponseEntity<PostResponse> getAllPost(
			@RequestParam(value ="pageNumbe", defaultValue = "0", required = false)Integer pageNumber,
			@RequestParam(value ="pageSize", defaultValue = "10", required = false)Integer pageSize,
			@RequestParam(value ="sortBy", defaultValue = "postId", required = false)String sortBy,
			@RequestParam(value ="sortDir",defaultValue = "asc", required=false) String sortDir){
		
		PostResponse list = this.postService.getAllPost(pageNumber, pageSize, sortBy, sortDir);
				
		return new ResponseEntity<PostResponse> (list, HttpStatus.OK);  
		
}

    //get postdetails by id
	
	@GetMapping("/posts{postId}")
	public ResponseEntity<PostDto> getPost(@PathVariable Integer postId){
		PostDto post = this.postService.getPost(postId);
		
		return new ResponseEntity<PostDto>(post, HttpStatus.OK);
	}
	
	// delete post 
	
	@DeleteMapping("/deletePosts/{postId}/")
	public ResponseEntity<ApiResponse> deletePost(@PathVariable Integer postId) {
		postService.deletePost(postId);
		return new ResponseEntity<ApiResponse>(new ApiResponse("Post Deleted..",true), HttpStatus.OK);
		
//		postService.deletePost(postId);
//		return new ApiResponse ("Post is successfully deleted..!!", true);
		
	}
	//update post
	
	@PutMapping("/updatePosts/{postId}/")
	public ResponseEntity<PostDto> updatePost(@RequestBody PostDto postDto , @PathVariable Integer postId){
		
		
		PostDto updatePost = this.postService.updatePost(postDto, postId);		
		
		return new ResponseEntity<PostDto> (updatePost, HttpStatus.OK);
		
		
	}  
	
}