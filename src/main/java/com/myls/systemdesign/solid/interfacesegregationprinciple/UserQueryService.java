package com.myls.systemdesign.solid.interfacesegregationprinciple;

import java.util.Optional;

public interface UserQueryService {

	Optional<User> findById(Long userId);
}