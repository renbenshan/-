package com.renbenshan.common.bo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 封装数据的对象 vo 
 * @author renbenshan
 *
 * @param <T>  泛型<T> 主要是做成通用模块
 */
//类上定义的泛型，为了约束属性，方法参数，方法返回值类型。


@Data
@NoArgsConstructor
public class PageObject<T> implements Serializable{
	  private static final long serialVersionUID = 5727659641634783999L;
	  /**当前页记录*/
      private List<T> records;
      /**总行数(通过查询获得)*/
      private Integer rowCount;
      /**总页数*/
      private Integer pageCount;
      /**每页要显示多少条记录*/
      private Integer pageSize;
      /**当前页的页码值*/
      private Integer pageCurrent;
	  public PageObject(List<T> records, Integer rowCount,Integer pageSize, Integer pageCurrent) {
		super();
		this.records = records;
		this.rowCount = rowCount;
		this.pageSize = pageSize;
		this.pageCurrent = pageCurrent;
		//计算分页：方案一
//		this.pageCount=rowCount/pageSize;
//		if(rowCount%pageSize!=0) {
//			this.pageCount++;
//		}
		//计算分析：方案二
		this.pageCount=(rowCount-1)/pageSize+1;
	 }
}
