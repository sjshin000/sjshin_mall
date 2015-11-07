package com.ssj.www.deal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.model.DealOption;
import com.ssj.www.deal.repository.WwwDealOptionRepository;
import com.ssj.www.deal.repository.WwwDealRepository;

@Service
public class WwwDealOptionService {
	@Autowired
	private WwwDealRepository wwwDealRepository;
	
	@Autowired
	private WwwDealOptionRepository wwwDealOptionRepository;
	
	public List<DealOption> dealOptionSelect(int mainDealSrl) {
		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
		System.out.println("========서비스 dealOptionList size ======" + dealOptionList.size() + "============================");
		return dealOptionList;
	}
}
