package com.renbenshan.common.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.renbenshan.common.vo.JsonResult;


/**
 * @ControllerAdvice   描述为全局异常处理类
 * @author renbenshan
 * 假如****Controller类的方法出现异常，此类没有tr{}catch异常，而是继续抛出给controller方法调用者（DispacherServlet）
 * 此对象会检测抛出异常的controller类中，是否有定义的异常处理方法,这个方法能够处理抛出的异常。
 * 
 *假如不可以，那么dispacherServlet对象还会进行检测是否有 全局的异常处理类，假如有则调用全局异常处理类中的相关异常处理方法，处理异常。
 */
@ControllerAdvice
public class GlobalException {
	/**	
	 * @ExceptionHandler 注解描述的方法，即为控制层的异常处理方法
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value = RuntimeException.class)
	@ResponseBody
	public JsonResult doHandleException(RuntimeException e) {
		e.printStackTrace();
		return new JsonResult(e);
		
	}
	

}
