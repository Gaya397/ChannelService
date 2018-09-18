package com.stackroute.tldm.service;

import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.tldm.exception.ChannelAlreadyExistsException;
import com.stackroute.tldm.exception.ChannelNotFoundException;
import com.stackroute.tldm.model.Channel;
import com.stackroute.tldm.model.User;
import com.stackroute.tldm.repository.ChannelRepository;

@Service
public class ChannelServiceImpl implements ChannelService {

	private ChannelRepository channelRepository;

	@Autowired
	public ChannelServiceImpl(ChannelRepository channelRepository) {

		this.channelRepository = channelRepository;

	}

	@Override
	public Channel createChannel(Channel channel) throws ChannelAlreadyExistsException {
		Channel createChannel = null;
		if (!channelRepository.existsById(channel.getChannelId())) {

			channel.setChannelCreatedDate(new Date());
			createChannel = channelRepository.insert(channel);
		} else {
			throw new ChannelAlreadyExistsException("Channel Already Exists");
		}

		return createChannel;
	}

	@Override
	public Channel updateChannel(String channelId, Channel channel) throws ChannelNotFoundException {
		Channel fetch = channelRepository.findById(channelId).get();
		if (fetch != null) {
			channelRepository.save(channel);
		} else {
			throw new ChannelNotFoundException("Channel not found");
		}
		return channel;
	}

	@Override
	public boolean deleteChannel(String channelId) throws ChannelNotFoundException {
		if (channelRepository.findById(channelId) != null) {
			channelRepository.deleteById(channelId);
		} else {
			throw new ChannelNotFoundException("channel not found");
		}
		return true;
	}

	@Override
	public List<Channel> getAllChannels() {
		List<Channel> channelList = channelRepository.findAll();
		return channelList;
	}

	@Override
	public Channel getChannelByChannelName(String channelName) throws ChannelNotFoundException {
		Channel fetchChannel;
		try {
			fetchChannel = channelRepository.getChannelByChannelName(channelName);
		} catch (NoSuchElementException exception) {
			throw new ChannelNotFoundException("channel not found");
		}

		return fetchChannel;
	}

	@Override
	public List<User> findAllChannelUsersByChannelName(String channelName) {
		List<User> allUsers = channelRepository.findAllChannelUsersByChannelName(channelName);
		return allUsers;
	}

}
