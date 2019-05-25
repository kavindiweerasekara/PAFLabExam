package com.orders;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orders.Orders;

@RestController
public class OrderResource {

	@Autowired
	OrdersRepository orderRepo;
	
	//Cancelling an order
	
	@DeleteMapping("/order/{orderid}")
	public String deleteOrder(@PathVariable int orderid) {
		
		Orders o = orderRepo.getOne(orderid);
		
		orderRepo.delete(o);
		
		return "Deleted";
		
	}
	
	//Updating an order
	
	@PutMapping(path="/order")
	public String updateOrder(@RequestBody Orders order) {
		
		orderRepo.save(order);
	
		return "Updated";
	}
	
	//Select Orders
	
	@GetMapping("orders")
	public List<Orders> getOrders(){
		
		List<Orders> orders = (List<Orders>) orderRepo.findAll();
		
		return orders;
	}
}
