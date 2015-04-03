
/*
* Copyright (c)  2015, NewTouch
* All rights reserved. 
*
* $id: PieService.java 9552 Apr 1, 2015 3:51:23 PM MaoJiaWei$
*/
package com.newtouch.watchman.echarts.service.impl; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newtouch.watchman.echarts.dao.PieDao;
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
@Service
public class PieServiceImpl implements PieService{
	@Autowired
	private PieDao pieDao;
	
	/**
	 * @return the pieDao
	 */
	public PieDao getPieDao() {
		return pieDao;
	}

	/**
	 * @param pieDao the pieDao to set
	 */
	public void setPieDao(PieDao pieDao) {
		this.pieDao = pieDao;
	}

	@Override
	public List<Pie> findAll() {
		// TODO Auto-generated method stub
		return pieDao.findAll();
	}
	
}

	