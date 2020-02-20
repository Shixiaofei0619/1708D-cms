package com.sxf.cms.dao;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.sxf.cms.domain.Article;


public interface ArticleRepository extends ElasticsearchRepository<Article, Integer>{

	List<Article> findByTitle(String title);
}
