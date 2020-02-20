package com.sxf.cms.service;

import com.github.pagehelper.PageInfo;
import com.sxf.cms.domain.User;
import com.sxf.cms.vo.UserVO;

public interface UserService {
	//用户列表
	PageInfo<User> selects(User user,Integer page,Integer pageSize);
	
	boolean update(User user);
	//注册
	boolean  insertSelective(UserVO userVO);
	//登录
	User login(User user);

}
