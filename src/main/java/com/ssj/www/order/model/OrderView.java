package com.ssj.www.order.model;

public class OrderView {
	private int mainDealSrl;
	private int dealOptionSrl;
	private int orderCount;  //구매수량
	private int orderDealAmountTot;  //딜의 주문금액 sum
	private int orderDealOptionAmount; //옵션 금액
	private int orderDealOptionAmountTot; //옵션 금액의 SUM
	private int orderAmountTot;  //총 주문금액 (결제예상금액)
	

	
	public int getOrderDealOptionAmount() {
		return orderDealOptionAmount;
	}
	public void setOrderDealOptionAmount(int orderDealOptionAmount) {
		this.orderDealOptionAmount = orderDealOptionAmount;
	}
	public int getMainDealSrl() {
		return mainDealSrl;
	}
	public void setMainDealSrl(int mainDealSrl) {
		this.mainDealSrl = mainDealSrl;
	}
	public int getDealOptionSrl() {
		return dealOptionSrl;
	}
	public void setDealOptionSrl(int dealOptionSrl) {
		this.dealOptionSrl = dealOptionSrl;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	
	
}
