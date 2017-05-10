package com.ssj.www.order.model;

import com.ssj.common.util.BaseModelSupport;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderViewList extends BaseModelSupport {
	Map<Integer, Integer> dealAmountMap = new HashMap<>();
	Map<Integer, Integer> deliveryAmount = new HashMap<>();
	
	ArrayList<OrderView> orderViewList = new ArrayList<>();
	
	int totalAmount;
	
	
	
	
	public Map<Integer, Integer> getDeliveryAmount() {
		return deliveryAmount;
	}

	public void setDeliveryAmount(Map<Integer, Integer> deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	
	public Map<Integer, Integer> getDealAmountMap() {
		return dealAmountMap;
	}
	public void setDealAmountMap(Map<Integer, Integer> dealAmountMap) {
		this.dealAmountMap = dealAmountMap;
	}
	
	
	public ArrayList<OrderView> getOrderViewList() {
		return orderViewList;
	}
	
	public void setOrderViewList(ArrayList<OrderView> resultOrderViewList) {
		System.out.println("======orderViewList : =====" + resultOrderViewList);
		System.out.println("======orderViewList : =====" + resultOrderViewList.size());
		this.orderViewList = resultOrderViewList;
	}
}
