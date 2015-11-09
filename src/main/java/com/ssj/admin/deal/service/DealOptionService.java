package com.ssj.admin.deal.service;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.model.DealOption;
import com.ssj.admin.deal.repository.DealOptionRepository;

@Service
public class DealOptionService {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(DealOptionService.class);
	
	@Autowired
	private DealOptionRepository dealOptionRepository;
	
	public int dealOptionInsert(DealOption dealOption) {
		logger.debug("dealOptionInsert  {}.", dealOption);
		System.out.println("===========================Service : dealOption================================");
		
		dealOption.setCreateAt(new Date());
		
		int insertCnt = dealOptionRepository.dealOptionInsert(dealOption);
		return insertCnt;
	}

	public List<DealOption> dealOptionSelect(int mainDealSrl) {
		List<DealOption> dealOptionList = dealOptionRepository.dealOptionSelect(mainDealSrl);
		System.out.println("========서비스 dealOptionList size ======" + dealOptionList.size() + "============================");
		return dealOptionList;
	}

	public int dealOptionUpdate(DealOption dealOption) {
		dealOption.setUpdatedAt(new Date());
		int insertCnt = dealOptionRepository.dealOptionUpdate(dealOption);
		return insertCnt;
	}
}
