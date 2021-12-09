package com.mthree.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mthree.blog.dao.BlogDAO;

@Service
public class BlogServiceLayer {
	
	@Autowired
	private BlogDAO dao;
	
	//TODO: Complete Service Layer
}
