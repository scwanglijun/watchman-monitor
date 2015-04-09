/*
* Copyright (c)  2015, Newtouch
* All rights reserved. 
*
* $id: HiveTemplateTest.java 9552 2015年4月9日 上午10:06:13 WangLijun$
*/
package com.newtouch.watchman.hive; 

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.hadoop.hive.HiveTemplate;

import com.newtouch.watchman.dao.HiveAllTest;

/**
 * <p>
 * Title: 
 * </p>
 * <p>
 * Description: 
 * </p>
 * <p>
 * Copyright: Copyright (c) 2015
 * </p>
 * <p>
 * Company: Newtouch
 * </p>
 * 
 * @author WangLijun
 * @version 1.0
 */
public class HiveTemplateTest  extends HiveAllTest{
	
	@Autowired
	private HiveTemplate  hiveTemplate;
	
	@Test
	public void queryTables(){
		List<String> list = hiveTemplate.query("show tables;");
		logger.info("list.size():",list.size());
	}
}

	