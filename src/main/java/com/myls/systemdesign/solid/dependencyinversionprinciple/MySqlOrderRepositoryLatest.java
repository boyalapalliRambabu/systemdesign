package com.myls.systemdesign.solid.dependencyinversionprinciple;

import java.util.Optional;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MySqlOrderRepositoryLatest implements OrderRepository {

	@Override
	public void save(Order order) {

		System.out.println("Saving order to MongoDB: " + order.getId());
	}

	@Override
	public Optional<Order> findById(String id) {

		System.out.println("Finding order from MongoDB: " + id);

		return Optional.empty();
	}

}
