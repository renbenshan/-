package com.renbenshan.SysLogDao;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.renbenshan.dao.SysLogDao;
import com.renbenshan.pojo.SysLog;

@SpringBootTest

public class SysDaoTest {
	
	
	@Autowired
	private SysLogDao sysLogDao;
	
	
	@Test
	public void testfindPageObjects() {
		List<SysLog> list =sysLogDao.findPageObjects("admin", 0, 5);
		for (SysLog sysLog : list) {
			System.out.println(sysLog);
		}
	}
	
	@Test
	public void testgetRowCount() {
		int rows =sysLogDao.getRowCount("admin");
		System.out.println(rows);
	}

}
