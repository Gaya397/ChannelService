package com.stackroute.tldm.model;

import java.util.Date;
import java.util.List;
import javax.persistence.OneToMany;

public class Community {

	private String communityId;
	private String communityName;
	private List<User> communityUsers;
	private Date communityCreatedDate;
	private User communityCreatedBy;
    private List<Channel> channelList;
    
    
	public String getCommunityId() {
		return communityId;
	}
	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}
	public String getCommunityName() {
		return communityName;
	}
	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}
	public List<User> getCommunityUsers() {
		return communityUsers;
	}
	public void setCommunityUsers(List<User> communityUsers) {
		this.communityUsers = communityUsers;
	}
	public Date getCommunityCreatedDate() {
		return communityCreatedDate;
	}
	public void setCommunityCreatedDate(Date communityCreatedDate) {
		this.communityCreatedDate = communityCreatedDate;
	}
	public User getCommunityCreatedBy() {
		return communityCreatedBy;
	}
	public void setCommunityCreatedBy(User communityCreatedBy) {
		this.communityCreatedBy = communityCreatedBy;
	}
	public List<Channel> getChannelList() {
		return channelList;
	}
	public void setChannelList(List<Channel> channelList) {
		this.channelList = channelList;
	}
	public Community(String communityId, String communityName, List<User> communityUsers, Date communityCreatedDate,
			User communityCreatedBy, List<Channel> channelList) {
		super();
		this.communityId = communityId;
		this.communityName = communityName;
		this.communityUsers = communityUsers;
		this.communityCreatedDate = communityCreatedDate;
		this.communityCreatedBy = communityCreatedBy;
		this.channelList = channelList;
	}
	public Community() {
		super();
		
	}
	@Override
	public String toString() {
		return "Community [communityId=" + communityId + ", communityName=" + communityName + ", communityUsers="
				+ communityUsers + ", communityCreatedDate=" + communityCreatedDate + ", communityCreatedBy="
				+ communityCreatedBy + ", channelList=" + channelList + "]";
	}
	
	
	
	
	
	
	
	
	

}
