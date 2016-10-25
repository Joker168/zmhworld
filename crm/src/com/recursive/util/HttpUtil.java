package com.recursive.util;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;
public class HttpUtil {

	public static String sendHttpRequest(
			String urlstr,String method,String outputstr,String charset) throws Throwable{
		URL url=new URL(urlstr);
		HttpURLConnection conn=(HttpURLConnection)
				url.openConnection();
		conn.setDoInput(true);
		if(outputstr!=null){
			conn.setDoOutput(true);
		}
		conn.setUseCaches(false);
		conn.setConnectTimeout(1000*60);
		conn.setReadTimeout(1000*60);
		conn.setRequestMethod(method);
	
		if(outputstr!=null){
			OutputStream output=conn.getOutputStream();
		
			PrintWriter writer=new PrintWriter(new
					OutputStreamWriter(output,charset));
			writer.write(outputstr);
			writer.flush();
			writer.close();
			
		}
		
		InputStream input=conn.getInputStream();
		BufferedReader reader=new BufferedReader(
				new InputStreamReader(input,charset)
				);
		StringBuilder strbuf=new StringBuilder();
		String line=null;
		while((line=reader.readLine())!=null){
			strbuf.append(line);
		}
		input.close();
		conn.disconnect();
		return strbuf.toString();
	}
	


}