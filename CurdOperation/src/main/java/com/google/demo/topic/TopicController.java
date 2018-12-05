package com.google.demo.topic;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	TopicService topicservice;
	
	@RequestMapping("/topic")
	public List<Topic> getAll()
	{
		return topicservice.getallTopics();
		
	}
	@ RequestMapping("/topic/{id}")
	public Topic getSingleData(@PathVariable String id)
	{
		return topicservice.getSingle(id);
		
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addData(Topic topic)
	{
		topicservice.addd(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topic/{id}")
	public void updateData(@RequestBody Topic topic,@PathVariable String id)
	{
		topicservice.update(topic, id);
	}
	@RequestMapping(method=RequestMethod.DELETE, value="/topic/{id}")
	public void delete(@PathVariable String id)
	{
		topicservice.delete(id);
	}

}
