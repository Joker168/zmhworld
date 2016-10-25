package com.recursive.entity;

public class AccessToken {
	/**
	 * 
	 */
	private String access_token;
	/**
	 * 
	 */
	private int expires_in;//
	/**
	 * 
	 * 
	 */
	private long createtime=System.currentTimeMillis();
	/**
	 * 
	 * 
	 */
	public boolean isExpires(){
		return (System.currentTimeMillis()-createtime)/1000>=expires_in-60*15;//
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
