package com.stackroute.tldm.model;

import java.util.List;

import javax.persistence.OneToMany;

public class User {
	
	private String userId;
	private String userName;
	private String userMail;
	private String phoneNum;
	//@OneToMany
	//List<Channel> channels;

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
//	public List<Channel> getChannels() {
//		return channels;
//	}
//	public void setChannels(List<Channel> channels) {
//		this.channels = channels;
//	}
	public User(String userId, String userName, String userMail, String phoneNum ) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userMail = userMail;
		this.phoneNum = phoneNum;
		//this.channels = channels;
	}
	public User() {
		super();
		
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMail=" + userMail + ", phoneNum=" + phoneNum
				+"]";
	}
	
	
 
	}
