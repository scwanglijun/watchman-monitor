
/*
* Copyright (c)  2015, NewTouch
* All rights reserved. 
*
* $id: PieController.java 9552 Apr 1, 2015 4:16:37 PM MaoJiaWei$
*/
package com.newtouch.watchman.echarts.controller; 

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.newtouch.lion.json.JSONParser;
import com.newtouch.lion.web.controller.AbstractController;
import com.newtouch.watchman.echarts.model.Pie;
import com.newtouch.watchman.echarts.service.PieService;

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
 * Company: NewTouch
 * </p>
 * 
 * @author MaoJiaWei
 * @version 1.0
 */
@Controller(value = "sysPieContorller")
@RequestMapping("/echarts/")
public class PieController extends AbstractController{
	//@Autowired
	//private PieService pieService;
	
	private static final String INDEX_RETURN = "/echarts/pie";
	
	/** 首页显示 */
	@RequestMapping(value = "pie")
	public String index() {
		return INDEX_RETURN;
	}
	
	@RequestMapping(value = "getData")
	@ResponseBody
	public ModelAndView getData() {
		//List<Pie> list = pieService.findAll();
		List<Pie>  list=new ArrayList<Pie>();
		String str=JSONParser.toJSONString(list);
		ModelAndView modelAndView=new ModelAndView();
		return this.getStrJsonView(str, modelAndView);
	}
	
	@RequestMapping(value = "getName")
	@ResponseBody
	public ModelAndView getName() {
		//List<Pie> list = pieService.findAll();
		List<Pie>  list=new ArrayList<Pie>();
		List<String> namelist = new ArrayList<String>();
		for(Pie pie:list){
			namelist.add(pie.getName());
		}
		String str=JSONParser.toJSONString(namelist);
		ModelAndView modelAndView=new ModelAndView();
		return this.getStrJsonView(str, modelAndView);
	}
	
}

	