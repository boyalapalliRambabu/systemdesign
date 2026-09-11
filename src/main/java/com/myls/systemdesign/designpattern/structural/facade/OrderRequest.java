package com.myls.systemdesign.designpattern.structural.facade;

public class OrderRequest {
	private String productId;
	private int quantity;
	private double amount;
	private String customerId;
	private String address;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OrderRequest [productId=" + productId + ", quantity=" + quantity + ", amount=" + amount
				+ ", customerId=" + customerId + ", address=" + address + "]";
	}

}
