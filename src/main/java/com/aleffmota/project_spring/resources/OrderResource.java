package com.aleffmota.project_spring.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aleffmota.project_spring.entities.Order;
import com.aleffmota.project_spring.repositories.OrderRepository;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderRepository service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		
		List<Order> list = service.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Order>> findById(@PathVariable Long id){
		Optional<Order> obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
