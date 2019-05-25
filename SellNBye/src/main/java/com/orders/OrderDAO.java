package com.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrderDAO {

	@Autowired
	OrdersRepository orderrepo;
	
	@Transactional(readOnly = false, isolation = Isolation.READ_COMMITTED)
	public Orders save(Orders order) {
		return orderrepo.save(order);
	}
}
