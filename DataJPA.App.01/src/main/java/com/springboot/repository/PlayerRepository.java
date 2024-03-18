package com.springboot.repository;

import org.springframework.data.repository.CrudRepository;

import com.springboot.entity.Player;


//@Repository
public interface PlayerRepository extends CrudRepository <Player, Integer>{

}
