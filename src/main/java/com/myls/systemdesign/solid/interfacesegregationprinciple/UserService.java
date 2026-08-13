package com.myls.systemdesign.solid.interfacesegregationprinciple;

import java.util.Optional;

public interface UserService {
	void create(User user);

	void update(User user);

	void delete(Long userId);

	Optional<User> findById(Long userId);

	void notifyUser(Long userId, String message);
}
