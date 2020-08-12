package com.renbenshan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.renbenshan.pojo.SysLog;
@Mapper
public interface SysLogDao {
     /**
      * 基于查询条件统计记录总数
      * @param username 查询条件
      * @return 查询到的记录总数
      */
	 int getRowCount(String username);
	 /**
	  * 基于条件查询当前页的记录
	  * @param username 查询条件
	  * @param startIndex 起始位置(当前页的起始位置)
	  * @param pageSize 页面大小(每页最多显示多少条记录)
	  * @return 查询到的当前的日志记录
	  */
	 List<SysLog> findPageObjects(String username,
			 Integer startIndex,Integer pageSize);
}
