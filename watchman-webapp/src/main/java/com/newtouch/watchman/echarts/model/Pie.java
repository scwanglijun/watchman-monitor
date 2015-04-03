
/*
* Copyright (c)  2015, NewTouch
* All rights reserved. 
*
* $id: Pie.java 9552 Apr 1, 2015 3:26:59 PM MaoJiaWei$
*/
package com.newtouch.watchman.echarts.model; 

import com.newtouch.lion.model.VersionEntity;

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
public class Pie extends VersionEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 831337503675080031L;
	private Long id;
	private String name;
	private Integer value;
	/* (non-Javadoc)
	 * @see com.newtouch.lion.model.BaseEntity#getId()
	 */
	@Override
	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	
}

	