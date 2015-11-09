package com.ssj.www.cart.model;

import java.util.Date;
import java.util.List;

import com.ssj.admin.deal.model.DealOption;

public class Cart {
	private int mainDelaSrl;
	private int dealOptionSrl;
	private int memberSrl;
	private int cartSrl;
	
	private String dealTitle;
	private Date endDate;
	private String dealStatus;
	private String deliveryPolicy;  //delivery_policy
	private int deliveryAmount;  //delivery_amount
	private int deliveryIfAmount;  //delivery_if_amount
	private int category1;
	private int category2;
	private int category3;
	private int category4;
	//private List<DealOption> dealOptions;
	
	private String optionDepth1;
	private String optionDepth2;
	private String optionDepth3;
	private int amount;
	private int maxCount;
	private String optionStatus;
	
	
	
	
	public int getMainDelaSrl() {
		return mainDelaSrl;
	}
	public void setMainDelaSrl(int mainDelaSrl) {
		this.mainDelaSrl = mainDelaSrl;
	}
	public int getDealOptionSrl() {
		return dealOptionSrl;
	}
	public void setDealOptionSrl(int dealOptionSrl) {
		this.dealOptionSrl = dealOptionSrl;
	}
	public String getDealTitle() {
		return dealTitle;
	}
	public void setDealTitle(String dealTitle) {
		this.dealTitle = dealTitle;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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
	public String getOptionDepth1() {
		return optionDepth1;
	}
	public void setOptionDepth1(String optionDepth1) {
		this.optionDepth1 = optionDepth1;
	}
	public String getOptionDepth2() {
		return optionDepth2;
	}
	public void setOptionDepth2(String optionDepth2) {
		this.optionDepth2 = optionDepth2;
	}
	public String getOptionDepth3() {
		return optionDepth3;
	}
	public void setOptionDepth3(String optionDepth3) {
		this.optionDepth3 = optionDepth3;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public String getOptionStatus() {
		return optionStatus;
	}
	public void setOptionStatus(String optionStatus) {
		this.optionStatus = optionStatus;
	}
	
}
