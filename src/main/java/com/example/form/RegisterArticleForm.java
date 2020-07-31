package com.example.form;


import lombok.Data;

@Data
public class RegisterArticleForm {

	
	private String articleTitle;
	private String articleContent; 
	private Integer blogId;
	private Integer categoryId;
	private Integer registerUserId;
	
	
	
}
