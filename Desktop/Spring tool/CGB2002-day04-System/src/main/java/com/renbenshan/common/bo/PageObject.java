package com.renbenshan.common.bo;

import java.io.Serializable;
import java.util.List;

/**
 * 封装数据的对象 vo 
 * @author renbenshan
 *
 * @param <T>  泛型<T> 主要是做成通用模块
 */
//类上定义的泛型，为了约束属性，方法参数，方法返回值类型。


public class PageObject<T> implements Serializable {

	private static final long serialVersionUID = -3152437572807923858L;
	/**当前页的页码值*/
	private Integer pageCurrent=1;
   /**页面大小*/
   private Integer pageSize=3;
   /**总行数(通过查询获得)*/
   private Integer rowCount=0;
   /**总页数(通过计算获得)*/
   private Integer pageCount=0;
   /**当前页记录*/
   private List<T> records;
   public PageObject(){}
	public PageObject(Integer pageCurrent, Integer pageSize, Integer rowCount, List<T> records) {
		super();
		this.pageCurrent = pageCurrent;
		this.pageSize = pageSize;
		this.rowCount = rowCount;
		this.records = records;
//		this.pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0) {
//			pageCount++;
//		}
		this.pageCount=(rowCount-1)/pageSize+1;
	}
	public Integer getPageCurrent() {
		return pageCurrent;
	}
	public void setPageCurrent(Integer pageCurrent) {
		this.pageCurrent = pageCurrent;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getRowCount() {
		return rowCount;
	}
	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}
	
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
	   this.pageCount = pageCount;
	}
	public List<T> getRecords() {
		return records;
	}
	public void setRecords(List<T> records) {
		this.records = records;
	} 
}
