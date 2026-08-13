package com.myls.systemdesign.solid.dependencyinversionprinciple;

public class OrderService {

//	problem here 
	private final MySqlOrderRepository repository = new MySqlOrderRepository();

	public void save(Order order) {
		repository.save(order);
	}

}
