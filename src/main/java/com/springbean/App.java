package com.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		User user = (User) ctx.getBean("user");
		((AbstractApplicationContext) ctx).close();
		int a = 0;
	}
}
