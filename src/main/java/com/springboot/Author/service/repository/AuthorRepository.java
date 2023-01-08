package com.springboot.Author.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.Author.service.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long>{

	Author findByAuthorId(Long authorId);
	
	
}
