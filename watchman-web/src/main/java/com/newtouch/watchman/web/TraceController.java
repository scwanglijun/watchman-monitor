/*
* Copyright (c)  2015, Newtouch
* All rights reserved. 
*
* $id: TraceController.java 9552 2015年4月9日 下午1:48:29 WangLijun$
*/
package com.newtouch.watchman.web; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.newtouch.lion.web.controller.AbstractController;

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
@Controller
@RequestMapping("/trace")
public class TraceController  extends AbstractController{
	
	/**首页*/
	private static final String INDEX_RETURN="/trace/index";
	/**首页*/
	@RequestMapping(value="index",method=RequestMethod.GET)
	public String index(){
		return  INDEX_RETURN;
	}
}

	