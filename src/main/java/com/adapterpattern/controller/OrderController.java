package com.adapterpattern.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adapterpattern.model.OrderRequest;
import com.adapterpattern.processor.OrderProcessor;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	OrderProcessor orderProcessor;
	
	@PostMapping("/save")
	public ResponseEntity<String> processOrder(@RequestBody OrderRequest request, @RequestParam String gateway){
		orderProcessor.processOrder(gateway, request);
		return new ResponseEntity<>("Order Saved Successfully", HttpStatus.OK);
		
	}
	
	
}
