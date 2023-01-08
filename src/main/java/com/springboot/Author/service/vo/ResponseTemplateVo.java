package com.springboot.Author.service.vo;

import com.springboot.Author.service.entity.Author;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVo {

	private Author author;
	private Document document;
	
}
