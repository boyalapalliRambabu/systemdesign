package com.myls.systemdesign.solid.interfacesegregationprinciple;

public interface UserCommandService {

	void create(User user);

	void delete(Long userId);
}