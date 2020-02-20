package com.sxf.cms.service;


import com.github.pagehelper.PageInfo;
import com.sxf.cms.domain.Links;

public interface LinksService {
	//增加
	boolean insert(Links links);
	//列表
    PageInfo<Links> selects(Integer page,Integer pageSize);
}
