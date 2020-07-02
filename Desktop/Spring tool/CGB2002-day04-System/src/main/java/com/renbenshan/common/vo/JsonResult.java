package com.renbenshan.common.vo;

import lombok.NoArgsConstructor;

/**
 * VO view Object 借助vo封装视图层要呈现的数据
 * @author renbenshan
 *
 */

/**
 * 无参构造函数的注解  @NoArgsConstructor
 * @author renbenshan
 *
 */
@NoArgsConstructor
public class JsonResult {
	/**消息表示状态码*/
	private Integer state;
	/**状态码对应的具体信息*/
	private String message;
	/**业务层返回的数据*/
	private Object data;
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
	
	public JsonResult(String message) {
		this.message=message;
		this.state=1;
	}
	public JsonResult(Object data) {
		this.data=data;
		this.state=1;
	}
	
	/**
	 * state状态码没有构造函数：可以用无参的构造函数给出默认值
	 */
	public JsonResult(Integer state) {
		this.state=1;
	}
	
	/**
	 * 构造方法进行错误信息的初始化
	 * @param e
	 */
	public JsonResult( Throwable e) {//Throwable：所以异常信息的父类
		this.state=0; //error
		this.message=e.getMessage();
		this.data="";
	}
	
}
