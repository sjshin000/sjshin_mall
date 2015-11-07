package com.ssj.www.deal.model;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Deal {
	private int mainDealSrl; //main_deal_srl
	private String title; //
	private Date startDate; //start_date
	private Date endDate; //end_date
	private Date createdAt;
	private Date updatedAt;  //updated_at
	private String dealStatus; //status_type
	private String whoUpdate;

	private String deliveryPolicy;  //delivery_policy
	private int deliveryAmount;  //delivery_amount
	private int deliveryIfAmount;  //delivery_if_amount
	private int category1;
	private int category2;
	private int category3;
	private int category4;
	
	private List<DealOption> dealOptions;
	

	public List<DealOption> getDealOptions() {
		return dealOptions;
	}
	public void setDealOptions(List<DealOption> dealOptions) {
		this.dealOptions = dealOptions;
	}
	
	
	public String getWhoUpdate() {
		return whoUpdate;
	}
	public void setWhoUpdate(String whoUpdate) {
		this.whoUpdate = whoUpdate;
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
	public int getCategory1() {
		return category1;
	}
	public void setCategory1(int category) {
		this.category1 = category;
	}
	public int getMainDealSrl() {
		return mainDealSrl;
	}
	public void setMainDealSrl(int mainDealSrl) {
		this.mainDealSrl = mainDealSrl;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(String inputStartDate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date startDate = format.parse(inputStartDate + " 00:00:00",  new ParsePosition(0));
		System.out.println("==================startDate========" + startDate + "================================================");
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(String inputEndDate) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date endDate = format.parse(inputEndDate + " 23:59:59",  new ParsePosition(0));
		System.out.println("=================endDate=========" + endDate + "================================================");
		this.endDate = endDate;
	}
	public String getDealStatus() {
		return dealStatus;
	}
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getDeliveryPolicy() {
		return deliveryPolicy;
	}
	public void setDeliveryPolicy(String deliveryPolicy) {
		System.out.println("==================deliveryPolicy========" + deliveryPolicy + "================================================");
		this.deliveryPolicy = deliveryPolicy;
	}
	public int getDeliveryAmount() {
		return deliveryAmount;
	}
	public void setDeliveryAmount(int deliveryAmount) {
		System.out.println("==================deliveryAmount========" + deliveryAmount + "================================================");
		this.deliveryAmount = deliveryAmount;
	}
	public int getDeliveryIfAmount() {
		return deliveryIfAmount;
	}
	public void setDeliveryIfAmount(int deliveryIfAmount) {
		System.out.println("==================deliveryIfAmount========" + deliveryIfAmount + "================================================");
		this.deliveryIfAmount = deliveryIfAmount;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
}
