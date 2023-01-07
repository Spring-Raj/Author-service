package com.springboot.Author.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Author.service.entity.Author;
import com.springboot.Author.service.service.AuthorService;

@RestController
@RequestMapping("/authors")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@PostMapping("/")
	public Author saveAuthor(@RequestBody Author author) {
		return authorService.saveAuthor(author);
	}
	
}
