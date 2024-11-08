package com.adapterpattern.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adapterpattern.entity.Order;
import com.adapterpattern.model.OrderRequest;
import com.adapterpattern.repository.SQLOrderRepository;
import com.adapterpattern.service.OrderService;

@Component
public class OrderSQLAdapter implements OrderService{
	
	@Autowired
	SQLOrderRepository sqlRepo;

	@Override
	public void saveOrder(OrderRequest req) {
		Order order = new Order();
		order.setPrice(req.getPrice());
		order.setProductName(req.getProductName());
		order.setQuantity(req.getQuantity());
		sqlRepo.save(order);
	}

}
