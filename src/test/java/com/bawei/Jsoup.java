package com.bawei;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.sxf.cms.domain.Article;
import com.sxf.cms.domain.ArticleWithBLOBs;
import com.sxf.cms.service.ArticleService;
import com.sxf.common.utils.FileUtilIO;
import com.sxf.common.utils.RandomUtil;
import com.sxf.common.utils.StreamUtil;
import com.sxf.common.utils.UserUtils;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class Jsoup {

	//注入kafkatemplete
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	@Autowired
	ArticleService articleService;
	
	@Test
	public void test() throws IOException {
		//读取文章
				File file = new File("d:/1708D22");
				File[] files = file.listFiles();
				for (File file2 : files) {
//					System.out.println(file2.getName());
					String title = file2.getName().replace(".txt", "");
					String readFile = FileUtilIO.readFile(file2, "utf8");
				
					//System.out.println(readFile);
					ArticleWithBLOBs bs = new ArticleWithBLOBs();
					bs.setTitle(title);
					bs.setContent(readFile);
					
					//channelid
					bs.setChannelId(RandomUtil.random(1, 9));
					//categeoryid
					bs.setCategoryId(RandomUtil.random(1, 32));
					//用户id
					bs.setUserId(RandomUtil.random(137, 178));
				
					//status
					bs.setStatus(RandomUtil.random(0, 1));
					//delete
					bs.setDeleted(RandomUtil.random(0, 1));
					//热门文章
					bs.setHot(RandomUtil.random(0, 1));
					//状态
					bs.setUpdated(new Date());
					
//					bs.setSummary(string2);
					String string = JSON.toJSONString(bs);
					kafkaTemplate.send("articles", string);
				}
		
	}
}
