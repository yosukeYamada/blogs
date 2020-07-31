package com.example.service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.common.StatusConfigration;
import com.example.domain.Article;
import com.example.form.RegisterArticleForm;
import com.example.form.UpdateArticleForm;
import com.example.mapper.ArticleMapper;

/**
 * ブログ記事を制御するservice.
 * 
 * @author yosuke.yamada
 *
 */
@Service
@Transactional
public class ArticleService {

	@Autowired
	private ArticleMapper articleMapper;

	@Autowired
	private StatusConfigration statusConfigration;

	/**
	 * 記事1件を登録するメソッド.
	 * 
	 * @param form リクエストパラメータ
	 * @return 登録した記事
	 */
	public Article registerArticle(RegisterArticleForm form) {
		Article article = new Article();
		BeanUtils.copyProperties(form, article);
		Timestamp registerDate = new Timestamp(System.currentTimeMillis());
		LocalDate date = LocalDate.now();
		article.setDate(date);
		article.setRegisterDate(registerDate);
		article.setStatus(statusConfigration.getAVAILABLE());
		Integer articleId = articleMapper.insert(article);
		Article newArticle = articleMapper.findByArticleId(articleId);
		return newArticle;
	}

	public Article updateArticle(UpdateArticleForm form) throws Exception {
		Integer articleId = form.getArticleId();
		Article article = articleMapper.findByArticleId(articleId);

		if (article.getVersion() == form.getVersion()) {
			BeanUtils.copyProperties(form, article);
			Integer updateUserId = form.getUpdateUserId();
			article.setUpdateUserId(updateUserId);
			Timestamp updateDate = new Timestamp(System.currentTimeMillis());
			article.setUpdateDate(updateDate);
			articleMapper.updateArticle(article);
		}else {
			throw new Exception();
		}
		Article newArticle = articleMapper.findByArticleId(articleId);

		return newArticle;
	}

	public List<Article> getAllArticleList() {
		List<Article> articleList = articleMapper.findAll();
		return articleList;
	}

}
