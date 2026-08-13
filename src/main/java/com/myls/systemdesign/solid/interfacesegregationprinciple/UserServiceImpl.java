package com.myls.systemdesign.solid.interfacesegregationprinciple;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserCommandService {

	@Override
	public void create(User user) {
		System.out.println("Creating user " + user.getName());
	}

	@Override
	public void delete(Long userId) {
		System.out.println("User is deleted " + userId);
	}

}
