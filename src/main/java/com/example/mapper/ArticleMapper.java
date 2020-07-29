package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Article;

@Mapper
public interface ArticleMapper {

	public Integer insert(Article article);
	
	public Article findByArticleId(Integer articleId);
	
	public List<Article> findAll();
	
	public Article update(Article article);
	
	
}
