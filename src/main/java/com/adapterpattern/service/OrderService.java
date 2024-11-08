package com.adapterpattern.service;

import com.adapterpattern.model.OrderRequest;


public interface OrderService {

	public void saveOrder(OrderRequest order);
}
