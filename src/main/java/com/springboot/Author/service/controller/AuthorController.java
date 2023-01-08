package com.springboot.Author.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.Author.service.entity.Author;
import com.springboot.Author.service.service.AuthorService;
import com.springboot.Author.service.vo.ResponseTemplateVo;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@PostMapping("/")
	public Author saveAuthor(@RequestBody Author author) {
		return authorService.saveAuthor(author);
	}
	@GetMapping("/{id}")
	public ResponseTemplateVo getDocumentByAuthor(@PathVariable("id") Long authorId) {
		return authorService.getDocumentByAuthor(authorId);
	}
}
