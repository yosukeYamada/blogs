package com.example.rest_controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Article;
import com.example.form.RegisterArticleFrom;
import com.example.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	
	@PostMapping("")
	public Article register(@RequestBody RegisterArticleFrom form) {
		Article article = articleService.registerArticle(form);
		return article;
	}
	
	@GetMapping("/{articleId}")
	public Article articleDetail(@PathVariable("articleId") String articleId,HttpServletRequest req) {
		System.out.println(articleId);
		return null;
	}
	
	@GetMapping("")
	public List<Article> allArticleList(){
		List<Article> articleList = articleService.getAllArticleList();
		return articleList;
		
	}
}
