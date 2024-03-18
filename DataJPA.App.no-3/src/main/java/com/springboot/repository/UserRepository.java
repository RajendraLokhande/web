package com.springboot.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.springboot.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> 
{
	
//	void saveAll(List<User> asList);
 public List<User>findBycountry(String cname);
 
}
