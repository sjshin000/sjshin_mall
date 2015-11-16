package com.ssj.www.order.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OrderViewList {
	Map<Integer, Integer> dealAmountMap = new HashMap<Integer, Integer>();
	int totalAmount;
	ArrayList<OrderView> orderViewList;



	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public ArrayList<OrderView> getOrderViewList() {
		return orderViewList;
	}

	public Map<Integer, Integer> getDealAmountMap() {
		return dealAmountMap;
	}
	public void setDealAmountMap(Map<Integer, Integer> dealAmountMap) {
		this.dealAmountMap = dealAmountMap;
	}
	
	public void setOrderViewList(ArrayList<OrderView> resultOrderViewList) {
		System.out.println("======orderViewList : =====" + resultOrderViewList);
		System.out.println("======orderViewList : =====" + resultOrderViewList.size());
		this.orderViewList = resultOrderViewList;
	}
}
