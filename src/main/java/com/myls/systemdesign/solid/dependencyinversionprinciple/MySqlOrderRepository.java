package com.myls.systemdesign.solid.dependencyinversionprinciple;

import java.util.Optional;

import org.springframework.stereotype.Repository;

@Repository
public class MySqlOrderRepository {

	public void save(Order order) {

		System.out.println("Saving order to MySQL: " + order.getId());
	}

	public Optional<Order> findById(String id) {

		System.out.println("Finding order from MySQL: " + id);

		return Optional.empty();
	}
}