/*
 * Copyright (c)  2015, Newtouch
 * All rights reserved. 
 *
 * $id: Greeting.java 9552 2015年4月3日 上午12:54:18 WangLijun$
 */
package com.newtouch.watchman.websocket.model;

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
public class Greeting {
	private String content;

	public Greeting(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}
}
