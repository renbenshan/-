package com.renbenshan.service;

import com.renbenshan.common.bo.PageObject;

import com.renbenshan.pojo.SysLog;

public interface SysLogService{
	
	/**
	 * 定义日志的分页查询业务
	 * @param username 用户名 （数据来源于客户端用户输入）
	 * @param pageCurrent 当前页 （数据来源于客户端用户输入）
	 * @return 封装当前页记录和分页信息的对象（PageObject）
	 */
	
	PageObject<SysLog> findPageObjects(String username ,Integer pageCurrent);
	
	
}