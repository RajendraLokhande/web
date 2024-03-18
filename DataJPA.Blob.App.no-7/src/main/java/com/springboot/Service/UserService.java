package com.springboot.Service;

import java.io.FileInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.User;
import com.springboot.repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	private UserRepository userRepo;
	
	public void saveUser()throws Exception {
		
		
	String imagePath = "C:\\User\\ashok\\OneDrive\\Documents\\Certificates\\DOCKER.jpeg";
		
		User user = new User(); 
        user.setUserName("Raju");
        user.setUserEmail("raju@gmail.com");
        
        	
        byte[] arr = new byte [2048];

        FileInputStream fis = new FileInputStream (new File(imagePath));
        fis.read(arr); 
        fis.close();
        
        user.setUserImage(arr);
        
        userRepo.save(user);       
        
        
}
}

