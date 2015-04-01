/*
 * Copyright (c)  2015, Newtouch
 * All rights reserved. 
 *
 * $id: Stock.java 9552 2015年4月2日 上午12:18:47 WangLijun$
 */
package com.newtouch.watchman.websocket.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6379103106884669313L;

	private String code = "";

	private double price = 0.0;

	private Date time = new Date();

	public Stock() {
		super();
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
	}

	private DateFormat df = new SimpleDateFormat("yyyy-MM-dd, HH:mm:ss");

	public String getTimeStr() {
		return df.format(time);
	}

}
