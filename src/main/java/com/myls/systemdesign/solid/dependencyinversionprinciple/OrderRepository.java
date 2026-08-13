package com.myls.systemdesign.solid.dependencyinversionprinciple;

import java.util.Optional;

public interface OrderRepository {
	void save(Order order);

	Optional<Order> findById(String id);
}
