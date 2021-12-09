package com.mthree.blog.controller;

import com.mthree.blog.entities.Category;
import com.mthree.blog.entities.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.blog.service.BlogServiceLayer;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/blog")
public class BlogController {
	
	@Autowired
	private BlogServiceLayer svc;
	
	//TODO: Implement REST endpoints
        
        
    @PostMapping("/post")
    public int createPost(@RequestBody Post newPost){
        
        svc.createPost(newPost);
        return newPost.getId();
    }
    
    @GetMapping("/post/{postID}")
    public Post getPost(@PathVariable int postID){
        return svc.getPostById(postID);
    }
    
    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return svc.getAllPosts();
    }
    
    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        return svc.getAllCategories();
    }
    
    

}
