package com.renbenshan.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.renbenshan.common.Exception.ServiceException;
import com.renbenshan.common.bo.PageObject;
import com.renbenshan.dao.SysLogDao;
import com.renbenshan.pojo.SysLog;
import com.renbenshan.service.SysLogService;

@Service

public class SysLogServiceImpl implements SysLogService{
	
	@Autowired
	private SysLogDao sysLogDao;
	@Override
	
	//PageObject<SysLog>  需要返回的不仅仅是 列表数据，还需要返回一个分页的数据等，所以返回的不是list集合，而是一个封装的一个对象
	public PageObject<SysLog> findPageObjects(String username, Integer pageCurrent) {
		System.out.println(pageCurrent);
		
		//1、参数校验
		if(pageCurrent ==null || pageCurrent<1) 
			throw new IllegalArgumentException("当前页码值不合法");
		
		//2、查询总记录数，并进行校验
		int rowCount=sysLogDao.getRowCount(username);
		if(rowCount==0)
			throw new ServiceException("没有对应的记录");
		//3、查询当前页记录数
		int pageSize=10;
		  //3.2)计算startIndex
		  int startIndex=(pageCurrent-1)*pageSize;
		  //3.3)执行当前数据的查询操作
		  List<SysLog> records= sysLogDao.findPageObjects(username, startIndex, pageSize);

		  //4.对分页信息以及当前页记录进行封装
		  //4.1)构建PageObject对象
		  PageObject<SysLog> pageObject=new PageObject<>();
		  //4.2)封装数据
		  pageObject.setPageCurrent(pageCurrent);
		  pageObject.setPageSize(pageSize);
		  pageObject.setRowCount(pageCurrent);
		  pageObject.setRecords(records);
         pageObject.setPageCount((rowCount-1)/pageSize+1);
		  //5.返回封装结果。
		  return pageObject;
	}
}
