package com.ssj.www.deal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.model.DealOption;
import com.ssj.www.deal.repository.WwwDealOptionRepository;
import com.ssj.www.deal.repository.WwwDealRepository;


@Service
public class WwwDealService {
	@Autowired
	private WwwDealRepository wwwDealRepository;
	
	@Autowired
	private WwwDealOptionRepository wwwDealOptionRepository;
	
	public Deal dealSelect(int mainDealSrl) {
//		Deal deal = wwwDealRepository.dealSelect(mainDealSrl);
		Deal deal = wwwDealRepository.dealSelect(mainDealSrl);
		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
		deal.setDealOptions(dealOptionList);
		System.out.println("=======================wwwDealSelect : " + deal.getDealOptions());
		System.out.println("=======================getDealOptions size: " + deal.getDealOptions().size());
		
		return deal;
	}
}
