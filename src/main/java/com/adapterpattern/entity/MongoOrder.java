package com.adapterpattern.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;

@Document(collection  = "orders")
public class MongoOrder {
	
		@Id
	    private String id;
	    private String productName;
	    private int quantity;
	    private double price;

	    public MongoOrder() {}

	    public MongoOrder(String productName, int quantity, double price) {
	        this.productName = productName;
	        this.quantity = quantity;
	        this.price = price;
	    }

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
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
