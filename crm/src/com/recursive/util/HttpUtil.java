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
		conn.setDoInput(true);//读取url资源的内�?
		if(outputstr!=null){
			conn.setDoOutput(true);//写入内容到指定的url
		}
		conn.setUseCaches(false);
		conn.setConnectTimeout(1000*60);//1分钟超时
		conn.setReadTimeout(1000*60);//1分钟超时
		conn.setRequestMethod(method);
		//写入数据
		if(outputstr!=null){
			OutputStream output=conn.getOutputStream();
			//BufferedWriter writer=new BufferedWriter(
					//new OutputStreamWriter(output,charset));
			PrintWriter writer=new PrintWriter(new
					OutputStreamWriter(output,charset));
			writer.write(outputstr);
			writer.flush();
			writer.close();
			
		}
		//读取数据
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
	
	/**
	 * 上传文件
	 * @param url
	 * @param localpath
	 * @param charset
	 * @return
	 * @throws Throwable 
	 */
	public static String upload(String urlstr,
			String localpath,String charset) throws Throwable{
		File localfile=new File(localpath);
		URL url=new URL(urlstr);
		HttpsURLConnection conn=(HttpsURLConnection)
				url.openConnection();
		conn.setDoInput(true);//读取url资源的内�?
		conn.setDoOutput(true);//写入内容到指定的url
		conn.setUseCaches(false);
		conn.setConnectTimeout(1000*60);//1分钟超时
		conn.setReadTimeout(1000*60);//1分钟超时
		conn.setRequestMethod("POST");//大写
		String boundary=String.valueOf(System.currentTimeMillis());
		String header="multipart/form-data; boundary="+boundary;
		System.out.println(header);
		conn.setRequestProperty("Content-Type", header);
		StringBuilder fileHead=new StringBuilder("--");
		fileHead.append(boundary);
		fileHead.append("\r\n");
		fileHead.append("Content-Disposition: form-data; name=\"file1\"; filename=");
		fileHead.append("\"")
		.append(localfile.getAbsolutePath())
		.append("\"")
		.append("\r\n")
		.append("Content-Type: application/octet-stream\r\n\r\n");//必须要有2个换�?
		System.out.println(fileHead);
		
		BufferedOutputStream bufout=new BufferedOutputStream(
				conn.getOutputStream());
		//写入文件头部信息
		bufout.write(fileHead.toString().getBytes(charset));
		
		//写入附件
		FileInputStream fileinput=new FileInputStream(localfile);
		byte[] bufbyte=new byte[1024];
		int len =0;
		while((len=fileinput.read(bufbyte))!=-1){
			bufout.write(bufbyte, 0, len);
		}
		
		fileinput.close();
		bufout.write(("\r\n--"+boundary+"--\r\n").getBytes(charset));
		bufout.flush();
		bufout.close();
		
		//读取数据
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
	
	//用httpurlconnection写一个上传文件的程序
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		//String url="http://localhost:8080/weixin/test";
		//System.out.println(System.getProperty("file.encoding"));
		//System.out.println(sendHttpRequest(url,"POST","中文","UTF-8"));
		//application/octet-stream
		System.out.println(upload("http://localhost:8080/weixin/upload","d:/bg.jpg","UTF-8"));
	}

}