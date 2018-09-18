package com.stackroute.tldm.repository;


import com.stackroute.tldm.exception.ChannelNotFoundException;
import com.stackroute.tldm.model.Channel;
import com.stackroute.tldm.model.User;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChannelRepository extends MongoRepository<Channel,String>{
	
	 Channel getChannelByChannelName(String channelName) throws ChannelNotFoundException;
	
	 List<User> findAllChannelUsersByChannelName(String channelName);
}
