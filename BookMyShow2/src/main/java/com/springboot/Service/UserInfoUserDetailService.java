package com.springboot.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springboot.Config.UserInfoUserDeatails;
import com.springboot.Entity.User;
import com.springboot.Repository.UserRepository;

public class UserInfoUserDetailService implements UserDetailsService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> name = userRepo.findByFname(username);
		return name.map(UserInfoUserDeatails::new).orElseThrow(()-> new UsernameNotFoundException("User Not Found In DB"+username));
	}

}
	

