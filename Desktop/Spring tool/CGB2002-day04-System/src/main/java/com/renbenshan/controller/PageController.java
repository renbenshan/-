package com.renbenshan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping("/")
public class PageController {
	
	
	@RequestMapping("doIndex")
	public String doIndexUI() {
		return "starter";
	}

	//列表数据
	@RequestMapping("log/log_list")
	public String doLogUI() {
		return "sys/log_list";
	}
	
	
	//分页组件
	@RequestMapping("doPageUI")
	public String doPageUI() {
		return "common/page";
	}

}
