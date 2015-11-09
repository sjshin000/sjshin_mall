package com.ssj.admin.deal.model;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ParamOptionDeal {
	Deal deal;
	ArrayList<DealOption> dealOptions;
	DealOption dealOption;
	
	public ArrayList<DealOption> getDealOptions() {
		return dealOptions;
	}
	public void setDealOptions(ArrayList<DealOption> dealOptions) {
		System.out.println("======setDealOptions : =====" + dealOptions.size());
		this.dealOptions = dealOptions;
	}
	
}
