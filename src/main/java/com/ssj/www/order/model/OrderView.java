package com.ssj.www.order.model;

public class OrderView {
	private int mainDealSrl;
	private int dealOptionSrl;
	private String title;
	private String dealStatus;
	private String deliveryPolicy;
	private int deliveryAmount;
	private int deliveryIfAmount;
	private int category1;
	private int category2;
	private int category3;
	private int category4;
	private String status;
	private int amount;
	private String deapth1;
	private String deapth2;
	private String deapth3;
	
	private int orderCount;  //구매수량
	private int orderDealAmount;  //딜의 주문금액 sum
	private int orderDealOptionAmount; //옵션 금액의 SUM
	private int orderAmountTot;  //총 주문금액 (결제예상금액)
	

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDealStatus() {
		return dealStatus;
	}
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}
	public String getDeliveryPolicy() {
		return deliveryPolicy;
	}
	public void setDeliveryPolicy(String deliveryPolicy) {
		this.deliveryPolicy = deliveryPolicy;
	}
	public int getDeliveryAmount() {
		return deliveryAmount;
	}
	public void setDeliveryAmount(int deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}
	public int getDeliveryIfAmount() {
		return deliveryIfAmount;
	}
	public void setDeliveryIfAmount(int deliveryIfAmount) {
		this.deliveryIfAmount = deliveryIfAmount;
	}
	public int getCategory1() {
		return category1;
	}
	public void setCategory1(int category1) {
		this.category1 = category1;
	}
	public int getCategory2() {
		return category2;
	}
	public void setCategory2(int category2) {
		this.category2 = category2;
	}
	public int getCategory3() {
		return category3;
	}
	public void setCategory3(int category3) {
		this.category3 = category3;
	}
	public int getCategory4() {
		return category4;
	}
	public void setCategory4(int category4) {
		this.category4 = category4;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getDeapth1() {
		return deapth1;
	}
	public void setDeapth1(String deapth1) {
		this.deapth1 = deapth1;
	}
	public String getDeapth2() {
		return deapth2;
	}
	public void setDeapth2(String deapth2) {
		this.deapth2 = deapth2;
	}
	public String getDeapth3() {
		return deapth3;
	}
	public void setDeapth3(String deapth3) {
		this.deapth3 = deapth3;
	}
	public int getOrderDealAmount() {
		return orderDealAmount;
	}
	public void setOrderDealAmount(int orderDealAmount) {
		this.orderDealAmount = orderDealAmount;
	}

	public int getOrderAmountTot() {
		return orderAmountTot;
	}
	public void setOrderAmountTot(int orderAmountTot) {
		this.orderAmountTot = orderAmountTot;
	}
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
	@Override
	public String toString() {
		return "OrderView [mainDealSrl=" + mainDealSrl + ", dealOptionSrl="
				+ dealOptionSrl + ", title=" + title + ", dealStatus="
				+ dealStatus + ", deliveryPolicy=" + deliveryPolicy
				+ ", delivery_amount=" + deliveryAmount
				+ ", delivery_if_amount=" + deliveryIfAmount+ ", category1="
				+ category1 + ", category2=" + category2 + ", category3="
				+ category3 + ", category4=" + category4 + ", status=" + status
				+ ", amount=" + amount + ", deapth1=" + deapth1 + ", deapth2="
				+ deapth2 + ", deapth3=" + deapth3 + ", orderCount="
				+ orderCount + ", orderDealAmount=" + orderDealAmount
				+ ", orderDealOptionAmount=" + orderDealOptionAmount
				+ ", orderAmountTot=" + orderAmountTot + "]";
	}
	
	
}
