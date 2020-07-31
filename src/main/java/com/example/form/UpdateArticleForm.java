package com.example.form;

import lombok.Data;

@Data
public class UpdateArticleForm {
	
	private Integer articleId;
	private String articleTitle;
	private String articleContent; 
	private Integer blogId;
	private Integer categoryId;
	private Integer updateUserId;
	private Integer version;
	
	

}
