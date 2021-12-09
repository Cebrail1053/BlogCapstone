package com.mthree.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mthree.blog.service.BlogServiceLayer;

@RestController
@RequestMapping("/api")
public class BlogController {
	
	@Autowired
	private BlogServiceLayer svc;
	
	//TODO: Implement REST endpoints

}
