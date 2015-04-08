
/*
* Copyright (c)  2015, NewTouch
* All rights reserved. 
*
* $id: PieController.java 9552 Apr 1, 2015 4:16:37 PM MaoJiaWei$
*/
package com.newtouch.watchman.echarts.controller; 

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.newtouch.lion.json.JSONParser;
import com.newtouch.lion.web.controller.AbstractController;
import com.newtouch.watchman.echarts.utils.Option;
import com.newtouch.watchman.echarts.utils.code.Orient;
import com.newtouch.watchman.echarts.utils.code.SeriesType;
import com.newtouch.watchman.echarts.utils.series.Pie;

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
//	@Autowired
//	private PieService pieService;

	
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

	@RequestMapping(value = "Options")
	@ResponseBody
	public Option Options(){
		List<Stu> list = new ArrayList<Stu>();
		Stu e1 = new Stu("直接访问",355);
		Stu e2 = new Stu("邮件营销",310);
		Stu e3 = new Stu("联盟广告",234);
		Stu e4 = new Stu("视频广告",135);
		Stu e5 = new Stu("搜索引擎",1548);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		List<String> namelist = new ArrayList<String>();
		for(Stu pie:list){
			namelist.add(pie.getName());
		}
	    Option option = new Option();
	    option.title().text("xxx站点用户访问来源");
	    option.title().x("center");
	    option.legend().orient(Orient.vertical);
	    option.legend().x("left");
	    option.legend().data(namelist);
	    option.calculable(true);
	    Pie pie = new Pie();
	    pie.name("访问来源");
	    pie.type(SeriesType.pie);
	    pie.radius("55%");
	    pie.center("50%", "60%");
	    pie.data(list);
	    option.series(pie);
		return option;
	}
}

	
