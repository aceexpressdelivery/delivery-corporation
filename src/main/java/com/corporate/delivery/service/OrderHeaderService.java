package com.corporate.delivery.service;

import java.util.Date;
import java.util.List;

import com.corporate.delivery.model.order.OrderHeader;


public interface OrderHeaderService {

	public List<OrderHeader> getOrderHeader(Integer userId);
	
	public List<OrderHeader> getMerchantOrRestaurantOrders(Integer zipBustypeMerchantId);
	
	public List<OrderHeader> getOrderHeaderDetail(Integer zipBustypeMerchantId, String fromdate, String todate);
	
	public void insert(OrderHeader orderHeader) ;
	
	public void updateOrderHeader(OrderHeader orderHeader);
	
	public void deleteOrderHeader(OrderHeader orderHeader);
	
	Integer processOrder(Integer userId);
}
