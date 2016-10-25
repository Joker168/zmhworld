package com.recursive.entity;

public class AccessToken {
	/**
	 * 定义token
	 */
	private String access_token;
	/**
	 * token 超时时间
	 */
	private int expires_in;//�?
	/**
	 * token创建时间
	 * 
	 */
	private long createtime=System.currentTimeMillis();
	/**
	 * 判断是否超时
	 * @return 返回true表示超时，false表示没有超时
	 */
	public boolean isExpires(){
		return (System.currentTimeMillis()-createtime)/1000>=expires_in-60*15;//容错时间
	}
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	
}
