package com.sxf.cms.service;

import org.apache.ibatis.annotations.Param;

import com.github.pagehelper.PageInfo;
import com.sxf.cms.domain.Collect;
import com.sxf.cms.domain.User;

public interface CollectService {
	//增加
	boolean insert(Collect Collect);
	//列表
    PageInfo<Collect> selects(Integer page,Integer pageSize,User user);
    //根据登录人和文章标题查询是否收藏
    int selectByText(@Param("text")String text ,@Param("user")User user);
   //删除收藏
    boolean deleteById(Integer id);
}
