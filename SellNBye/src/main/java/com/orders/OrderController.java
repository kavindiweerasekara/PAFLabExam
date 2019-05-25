package com.orders;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orderin")
public class OrderController {

	@Autowired
	OrderDAO orderdao;
	
	@PostMapping("/order")
	public Orders addOrder(@Valid @RequestBody Orders order) {
		
		return orderdao.save(order);
	}
}
