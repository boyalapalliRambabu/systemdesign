package com.myls.systemdesign.solid.interfacesegregationprinciple;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class UserQueryServiceImpl implements UserQueryService {

	@Override
	public Optional<User> findById(Long userId) {

		System.out.println("Searching user: " + userId);

		User user = new User(userId, "Rambabu", "rambabu@example.com");

		return Optional.of(user);
	}
}