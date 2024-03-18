package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springboot.entity.Player;
import com.springboot.repository.PlayerRepository;

@SpringBootApplication
public class Application {
    
	public static void main(String[] args) {
       context = SpringApplication.run(Application.class, args);
		
	 PlayerRepository playerRepository = context.getBean(PlayerRepository.class);	   
	                                                                
	 
	 Player p1 =new Player ();
	 p1.setPlayerId(101);
	 p1.setPlayerName("Sachin");
	 p1.setPlayerAge(45);
	 p1.setPlayerLocation("Mumbai");
	 
	 
	 playerRepository.save(p1);                                                               
	
	 System.out.println("Record Inserted..............");
	 
	}

}
