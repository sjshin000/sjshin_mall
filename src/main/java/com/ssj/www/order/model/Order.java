package com.ssj.www.order.model;

import java.util.Date;

public class Order {
	private int mainOrderSrl;
	private int orderSrl;
	private int memberSrl;
	private String orderStatus; //주문상태
	private String actionStatus; //
	
	private int totalAmount;  //총 구매금액
	private int payAmount; //결제수단 금액
	private int pointAmount;
	private int totalDistcountAmount;
	private int cpuponAmount;
	
	private int deliveryAmount;
	private int deliverySrl;
	private String deliveryStatus;
	private String deliveryAddress;
	private String deliveryMsg;

	private Date createdAt;
	private Date updatedAt;
	private Date completedAt;
	
	private String whoUpdate;

	public int getMainOrderSrl() {
		return mainOrderSrl;
	}

	public void setMainOrderSrl(int mainOrderSrl) {
		this.mainOrderSrl = mainOrderSrl;
	}

	public int getOrderSrl() {
		return orderSrl;
	}

	public void setOrderSrl(int orderSrl) {
		this.orderSrl = orderSrl;
	}

	public int getMemberSrl() {
		return memberSrl;
	}

	public void setMemberSrl(int memberSrl) {
		this.memberSrl = memberSrl;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getPayAmount() {
		return payAmount;
	}

	public void setPayAmount(int payAmount) {
		this.payAmount = payAmount;
	}

	public int getPointAmount() {
		return pointAmount;
	}

	public void setPointAmount(int pointAmount) {
		this.pointAmount = pointAmount;
	}

	public int getTotalDistcountAmount() {
		return totalDistcountAmount;
	}

	public void setTotalDistcountAmount(int totalDistcountAmount) {
		this.totalDistcountAmount = totalDistcountAmount;
	}

	public int getCpuponAmount() {
		return cpuponAmount;
	}

	public void setCpuponAmount(int cpuponAmount) {
		this.cpuponAmount = cpuponAmount;
	}

	public int getDeliveryAmount() {
		return deliveryAmount;
	}

	public void setDeliveryAmount(int deliveryAmount) {
		this.deliveryAmount = deliveryAmount;
	}

	public int getDeliverySrl() {
		return deliverySrl;
	}

	public void setDeliverySrl(int deliverySrl) {
		this.deliverySrl = deliverySrl;
	}

	public String getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeliveryMsg() {
		return deliveryMsg;
	}

	public void setDeliveryMsg(String deliveryMsg) {
		this.deliveryMsg = deliveryMsg;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Date getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(Date completedAt) {
		this.completedAt = completedAt;
	}

	public String getWhoUpdate() {
		return whoUpdate;
	}

	public void setWhoUpdate(String whoUpdate) {
		this.whoUpdate = whoUpdate;
	}	
}
