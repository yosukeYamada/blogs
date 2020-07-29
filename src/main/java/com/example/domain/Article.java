package com.example.domain;


import java.sql.Timestamp;
import java.time.LocalDate;

import lombok.Data;

@Data
public class Article {
	

	private Integer articleId;
	private String articleTitle;
	private String articleContent;
	private Integer blogId;
	private Integer categoryId;
	private LocalDate date;
	private Integer registerUserId;
	private Timestamp registerDate;
	private Integer updateUserId;
	private Timestamp updateDate;
	private Integer status;
	private Integer version;
	
	
	public Article(){
		super();
		this.version = 1;
	}
	
	
}
