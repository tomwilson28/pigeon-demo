/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo.loadbalance;

import com.dianping.pigeon.demo.EchoService;
import com.dianping.pigeon.demo.SpringContainer;

public class Client {

	private static SpringContainer CLIENT_CONTAINER = new SpringContainer(
			"classpath*:META-INF/spring/loadbalance/invoker.xml");

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		CLIENT_CONTAINER.start();

		EchoService echoService = (EchoService) CLIENT_CONTAINER.getBean("echoService");
		try {
			System.out.println(echoService.echo("hi"));
		} catch (Throwable t) {
		}
	}

}
