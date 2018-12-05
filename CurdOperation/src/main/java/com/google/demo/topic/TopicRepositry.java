package com.google.demo.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepositry extends CrudRepository<Topic,String> {

	

	Topic findId(String id);

	

}
