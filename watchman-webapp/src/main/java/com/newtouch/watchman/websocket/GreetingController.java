/*
 * Copyright (c)  2015, Newtouch
 * All rights reserved. 
 *
 * $id: GreetingController.java 9552 2015年4月3日 上午12:55:14 WangLijun$
 */
package com.newtouch.watchman.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.newtouch.watchman.websocket.model.Greeting;
import com.newtouch.watchman.websocket.model.HelloMessage;

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
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(3000); // simulated delay
		return new Greeting("Hello, " + message.getName() + "!");
	}
	
}
