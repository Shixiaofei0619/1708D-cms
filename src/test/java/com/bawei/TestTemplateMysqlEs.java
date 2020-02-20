package com.bawei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.pagehelper.PageInfo;
import com.sxf.cms.dao.ArticleRepository;
import com.sxf.cms.domain.Article;
import com.sxf.cms.service.ArticleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-beans.xml")
public class TestTemplateMysqlEs {

	@Autowired
	ArticleRepository articlerRes;
	@Autowired
	ArticleService  articleService;
	@Test
	public void testImportMysqlToEs() {
		Article article = new Article();
		article.setStatus(1);
		//1.从mysql中查询所有文章属性
		PageInfo<Article> selects = articleService.selects(article, 1, 10000);
		//2.把查询出来的文章批量保存到es索引中
		articlerRes.saveAll(selects.getList());
		
	}
//	@Test
//	public void testSaveArticle() {
//		ArticleWithBLOBs article = new ArticleWithBLOBs();
//		article.setStatus(1);
//		//1.从mysql中查询所有文章属性
//		PageInfo<Article> selects = articleService.selects(article, 1, 10000);
//		//2.把查询出来的文章批量保存到es索引中
//		if(article!=null) {
//			ArticleWithBLOBs save = articlerRes.save(article);
//			System.out.println(save);
//		}
//		articleService.insertSelective(article);
//		
//		
//	}
}
