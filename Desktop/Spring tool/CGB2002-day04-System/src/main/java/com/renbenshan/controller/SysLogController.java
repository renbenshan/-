package com.renbenshan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renbenshan.common.bo.PageObject;
import com.renbenshan.common.vo.JsonResult;
import com.renbenshan.pojo.SysLog;
import com.renbenshan.service.SysLogService;

@Controller

@RequestMapping("log")
public class SysLogController {
	
	@Autowired
	private SysLogService sysLogService;
	
	
	@RequestMapping("doFindPageObjects")
	@ResponseBody
	public JsonResult doFindPage(String username, Integer pageCurrent) {
		PageObject<SysLog> list=sysLogService.findPageObjects(username, pageCurrent);
		
		return new JsonResult(list);
	}
	
	
	
}
