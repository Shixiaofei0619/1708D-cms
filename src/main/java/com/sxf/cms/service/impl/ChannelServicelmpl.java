package com.sxf.cms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxf.cms.dao.ChannelMapper;
import com.sxf.cms.domain.Channel;
import com.sxf.cms.service.ChannelService;
@Service
public class ChannelServicelmpl implements ChannelService {

	@Autowired
	private ChannelMapper ChannelMapper;
	@Override
	public List<Channel> selects() {
		// TODO Auto-generated method stub
		return ChannelMapper.selects();
	}

}
