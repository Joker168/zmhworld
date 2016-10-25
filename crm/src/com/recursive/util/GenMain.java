package com.recursive.util;

public class GenMain {
	public static void main(String[] args) {
		String configFile = "/generatorConfig.xml";
		try {

			 String[] tableNames = new String[] { "admin","salon_info","task","user"};
			GenMybatisFiles.gen(configFile, tableNames);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
