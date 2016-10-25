package com.recursive.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringCtxUtils {
	private static ApplicationContext ctx;
	
	public static void init(String path){
		ctx=new ClassPathXmlApplicationContext(path);
	}
	public static Object getBean(String name){
		return ctx.getBean(name);
	}
	public static  <T> T getBean(Class<T> type){
		return ctx.getBean(type);
	}
}
