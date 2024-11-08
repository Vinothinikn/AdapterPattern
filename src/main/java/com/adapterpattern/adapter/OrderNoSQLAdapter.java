package com.adapterpattern.adapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.adapterpattern.entity.MongoOrder;
import com.adapterpattern.model.OrderRequest;
import com.adapterpattern.repository.MongoOrderRepository;
import com.adapterpattern.service.OrderService;

@Component
public class OrderNoSQLAdapter implements OrderService{
	
	@Autowired
	MongoOrderRepository mongoRepo;

	@Override
	public void saveOrder(OrderRequest req) {
		MongoOrder order = new MongoOrder();
		order.setPrice(req.getPrice());
		order.setProductName(req.getProductName());
		order.setQuantity(req.getQuantity());
		mongoRepo.save(order);
	}

}
