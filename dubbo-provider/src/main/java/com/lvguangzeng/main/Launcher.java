package com.lvguangzeng.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext applicationContext = null;
		try {
			applicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
			applicationContext.start();
			System.out.println("start......");
			System.in.read(); // 按任意键退出
		} catch (Exception e) {
			throw e;
		} finally {
			applicationContext.close();
		}
	}
}
