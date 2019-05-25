package com.orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer>{

}
