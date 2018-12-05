package com.google.demo.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepositry topicrepositry;
	
	public List<Topic> getallTopics()
	{
		List<Topic> topics=new ArrayList<>();
		
		return (List<Topic>) topicrepositry.findAll();
		
		
	}
	public Topic getSingle(String id)
	{
		return topicrepositry.findId(id);
		
	}
	public void addd(Topic topic)
	{
		topicrepositry.save(topic);
	}
	public void update(Topic topic, String id)
	{
		topicrepositry.save(topic);
	}
	public void delete(String id)
	{
		topicrepositry.deleteById(id);
	}

}
