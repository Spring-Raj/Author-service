package com.springboot.Author.service.vo;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Document {

	private Long documentId;
	private String documentName;
	private String documentAddress;
	private String documentCode;
}
