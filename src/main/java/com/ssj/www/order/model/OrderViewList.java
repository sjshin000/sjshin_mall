package com.ssj.www.order.model;

import java.util.ArrayList;

public class OrderViewList {
	ArrayList<OrderView> orderViewList;

	public ArrayList<OrderView> getOrderViewList() {
		return orderViewList;
	}

	public void setOrderViewList(ArrayList<OrderView> orderViewList) {
		System.out.println("======orderViewList : =====" + orderViewList);
		System.out.println("======orderViewList : =====" + orderViewList.size());
		this.orderViewList = orderViewList;
	}
}
