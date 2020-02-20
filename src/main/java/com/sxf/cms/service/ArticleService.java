package com.sxf.cms.service;

import com.github.pagehelper.PageInfo;
import com.sxf.cms.domain.Article;
import com.sxf.cms.domain.ArticleWithBLOBs;

public interface ArticleService {

	/**
	 * 
	 * @Title: selects 
	 * @Description: 文章列表
	 * @param article
	 * @return
	 * @return: List<Article>
	 */
	PageInfo<Article> selects(Article article,Integer page,Integer pageSize);
	
	/**
	 * 最新文章
	 * @param article
	 * @param page
	 * @param pageSize
	 * @return
	 */
	PageInfo<Article> selectLast(Article article,Integer page,Integer pageSize);
	/**
	 * 热门文章
	 * @param article
	 * @param page
	 * @param pageSize
	 * @return
	 */
	PageInfo<Article> selectHot(Article article,Integer page,Integer pageSize);

	boolean  update(ArticleWithBLOBs article);
	
	ArticleWithBLOBs selectByPrimaryKey(Integer id);
	
	/**
	 * 
	 * @Title: insertSelective 
	 * @Description: 发布文章
	 * @param record
	 * @return
	 * @return: boolean
	 */
	 boolean insertSelective(ArticleWithBLOBs record);

	 /**
	  * 高亮查询
	  * @param page
	  * @param pageSize
	  * @param key
	  * @return
	  */
	PageInfo<Article> selectES(Integer page, Integer pageSize, String key);
}
