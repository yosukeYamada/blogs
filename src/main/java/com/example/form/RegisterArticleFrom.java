package com.example.form;


import lombok.Data;

@Data
public class RegisterArticleFrom {

	private String articleTitle;
	private String articleContent; 
	private Integer blogId;
	private Integer categoryId;
	private Integer registerUserId;
	
	
	
}
