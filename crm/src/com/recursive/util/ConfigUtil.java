package com.recursive.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class ConfigUtil {
	private static Properties properties;
	static{
		properties=new Properties();
		InputStream is=ConfigUtil.class.getResourceAsStream("/config.properties");
		try {
			properties.load(new InputStreamReader(is,Constant.CHARSET));
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static String getValue(String key){
		return properties.getProperty(key);
	}
	public static void main(String[] args) {
		System.out.println(getValue("account"));
	}
}
