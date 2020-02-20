package com.sxf.cms.service;

import java.util.List;

import com.sxf.cms.domain.Category;

public interface CategoryService {
	//根据栏目查询分类
	List<Category> selectsByChannelId(Integer channelId);

}
