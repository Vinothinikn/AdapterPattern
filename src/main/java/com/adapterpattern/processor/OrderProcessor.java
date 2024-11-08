package com.adapterpattern.processor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.adapterpattern.model.OrderRequest;
import com.adapterpattern.service.OrderService;

@Service
public class OrderProcessor {

	public Map<String, OrderService> orderMap = new HashMap<>();
	
	public OrderProcessor(List<OrderService> serviceList) {
		orderMap = serviceList.stream().collect(Collectors.toMap(x->x.getClass().getSimpleName(), Function.identity()));
	}
	
	public void processOrder(String gateway, OrderRequest request) {
		OrderService service = orderMap.get(gateway+"Adapter");
		service.saveOrder(request);
	}
}
