package com.bawei;

import org.junit.Test;

import com.sxf.common.utils.StringUtil;

public class UrlTest {

	@Test
	public void Test() {
		//定义一个url
		String url = "https://www.baidu.com/?tn=78040160_5_pg&ch=8";
		//判断其  不为空 
		if(url!=null && url!="") {
			//对其进行判断
			boolean httpUrl = StringUtil.isHttpUrl(url);
			System.out.println(httpUrl);
			//否则就是假的
		}else {
			System.out.println("链接是假的");
		}
		
	}
}
