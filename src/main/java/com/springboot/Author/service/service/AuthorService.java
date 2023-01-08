package com.springboot.Author.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.Author.service.entity.Author;
import com.springboot.Author.service.repository.AuthorRepository;
import com.springboot.Author.service.vo.Document;
import com.springboot.Author.service.vo.ResponseTemplateVo;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Author saveAuthor(Author author) {
		return authorRepository.save(author);
	}

	public ResponseTemplateVo getDocumentByAuthor(Long authorId) {
		ResponseTemplateVo vo = new ResponseTemplateVo();
		Author author = authorRepository.findByAuthorId(authorId);
		Document document = restTemplate.getForObject("http://DOCUMENT-SERVICE/documents/"+author.getAuthorId(), Document.class);
		vo.setAuthor(author);
		vo.setDocument(document);
		return vo;
	}

}
