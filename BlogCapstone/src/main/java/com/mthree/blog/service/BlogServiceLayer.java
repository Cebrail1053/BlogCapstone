package com.mthree.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.blog.dao.BlogDAO;
import com.mthree.blog.entities.Category;
import com.mthree.blog.entities.Post;
import java.util.List;

@Service
public class BlogServiceLayer {
	
	@Autowired
	private BlogDAO dao;
	
	//TODO: Complete Service Layer

    public void createPost(Post newPost) {
        dao.addPost(newPost, 1);
    }

    public Post getPostById(int postID) {
        return dao.getPostById(postID);
    }
    
    public List<Post> getAllPosts(){
        return dao.getAllPosts();
    }

    public List<Category> getAllCategories(){
        return dao.getAllCategories();
    }
}
