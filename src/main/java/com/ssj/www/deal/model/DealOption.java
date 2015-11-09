package com.ssj.www.deal.model;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DealOption {
	private int dealOptionSrl;
	private int mainDealSrl;

	private int maxCount;
	private String status;
	private int amount;

	private String depth1;
	private String depth2;
	private String depth3;

	
	private Date createAt;
	private Date updatedAt;
	private String whoUpdate;
	
	
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	public String getWhoUpdate() {
		return whoUpdate;
	}
	public void setWhoUpdate(String whoUpdate) {
		this.whoUpdate = whoUpdate;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
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
	public void setDealOptionSrl(String dealOptionSrl) {
		this.dealOptionSrl = Integer.parseInt(dealOptionSrl);
	}
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDepth1() {
		return depth1;
	}
	public void setDepth1(String depth1) {
		this.depth1 = depth1;
	}
	public String getDepth2() {
		return depth2;
	}
	public void setDepth2(String depth2) {
		this.depth2 = depth2;
	}
	public String getDepth3() {
		return depth3;
	}
	public void setDepth3(String depth3) {
		this.depth3 = depth3;
	}
}
