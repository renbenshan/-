package com.renbenshan.SysLogService;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.renbenshan.common.bo.PageObject;
import com.renbenshan.pojo.SysLog;
import com.renbenshan.service.SysLogService;

@SpringBootTest
public class SysLogServiceTest {
	
	@Autowired
	private SysLogService sysLogService;
	
	@Test
	public void testfindPageObjects() {
		PageObject<SysLog> pageObject =sysLogService.findPageObjects("admin", 1);
		System.out.println(pageObject);
	}

}
