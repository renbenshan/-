package com.renbenshan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.renbenshan.pojo.SysLog;

@Mapper
public interface SysLogDao{
	

	/**
	 * 基于条件查询当前页的记录
	 * @param username 查询条件
	 * @param startIndex 当前页的其实位置
	 * @param pageSize 每页显示多少条记录
	 * @return 返回当前页的记录
	 */
	List<SysLog> findPageObjects(String username,Integer startIndex,Integer pageSize);
	
	/**
	 * 基于用户名进行查询，查询记录的总数
	 * @param username  查询条件
	 * @return
	 */
	int getRowCount(String username);
}
