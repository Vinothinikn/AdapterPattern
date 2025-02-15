package com.adapterpattern.model;

public class OrderRequest {

	private String productName;
    private int quantity;
    private double price;
    
    public OrderRequest() {}
    
	public OrderRequest(String productName, int quantity, double price) {
		super();
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
    
    
}
