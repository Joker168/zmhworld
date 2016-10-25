package com.recursive.entity;

import java.util.List;
//通过微信获取的用户基本信息
public class UserInfo {
	private int subscribe;

	private String openid;

	private String nickname;

	private int sex;

	private String language;

	private String city;

	private String province;

	private String country;
	
	private String headimgurl;
	
	private int subscribe_time;

	private String unionid;

	private String remark;

	private int groupid;

	private List<Long> tagid_list ;

	public String getHeadimgurl() {
		return headimgurl;
	}
	public void setHeadimgurl(String headimgurl) {
		this.headimgurl = headimgurl;
	}
	public void setSubscribe(int subscribe){
	this.subscribe = subscribe;
	}
	public int getSubscribe(){
	return this.subscribe;
	}
	public void setOpenid(String openid){
	this.openid = openid;
	}
	public String getOpenid(){
	return this.openid;
	}
	public void setNickname(String nickname){
	this.nickname = nickname;
	}
	public String getNickname(){
	return this.nickname;
	}
	public void setSex(int sex){
	this.sex = sex;
	}
	public int getSex(){
	return this.sex;
	}
	public void setLanguage(String language){
	this.language = language;
	}
	public String getLanguage(){
	return this.language;
	}
	public void setCity(String city){
	this.city = city;
	}
	public String getCity(){
	return this.city;
	}
	public void setProvince(String province){
	this.province = province;
	}
	public String getProvince(){
	return this.province;
	}
	public void setCountry(String country){
	this.country = country;
	}
	public String getCountry(){
	return this.country;
	}
	public void setSubscribe_time(int subscribe_time){
	this.subscribe_time = subscribe_time;
	}
	public int getSubscribe_time(){
	return this.subscribe_time;
	}
	public void setUnionid(String unionid){
	this.unionid = unionid;
	}
	public String getUnionid(){
	return this.unionid;
	}
	public void setRemark(String remark){
	this.remark = remark;
	}
	public String getRemark(){
	return this.remark;
	}
	public void setGroupid(int groupid){
	this.groupid = groupid;
	}
	public int getGroupid(){
	return this.groupid;
	}
	public void setTagid_list(List<Long> tagid_list){
	this.tagid_list = tagid_list;
	}
	public List<Long> getTagid_list(){
	return this.tagid_list;
	}

	
}
