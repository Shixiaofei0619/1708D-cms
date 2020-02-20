package com.sxf.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxf.cms.dao.CategoryMapper;
import com.sxf.cms.domain.Category;
import com.sxf.cms.service.CategoryService;
@Service
public class CategoryServicelmpl implements CategoryService {

	@Autowired
	private CategoryMapper CategoryMapper;
	@Override
	public List<Category> selectsByChannelId(Integer channelId) {
		// TODO Auto-generated method stub
		return CategoryMapper.selectsByChannelId(channelId);
	}

}
