package com.orders;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="orders")
public class Orders {

	@Id
	private int orderid;
	private Date orderdate;
	private String orderitems;
	private int itemqty;
	private int userid;
	public int getOrderId() {
		return orderid;
	}
	public void setOrderId(int orderId) {
		this.orderid = orderId;
	}
	public Date getOrderDate() {
		return orderdate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderdate = orderDate;
	}
	public String getOrderItems() {
		return orderitems;
	}
	public void setOrderItems(String orderItems) {
		this.orderitems = orderItems;
	}
	public int getItemQty() {
		return itemqty;
	}
	public void setItemQty(int itemQty) {
		itemqty = itemQty;
	}
	public int getUserId() {
		return userid;
	}
	public void setUserId(int userId) {
		this.userid = userId;
	}
	@Override
	public String toString() {
		return "Orders [orderId=" + orderid + ", orderDate=" + orderdate + ", orderItems=" + orderitems + ", ItemQty="
				+ itemqty + ", userId=" + userid + "]";
	}
	
	
}
