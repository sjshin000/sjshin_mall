package com.ssj.admin.deal.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.repository.DealRepository;

@Service
public class DealService {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(DealService.class);
	
	@Autowired
	private DealRepository dealRepository;
	
	
	/**
	 * 
	 * @param deal
	 * @return
	 */
	public int dealInsert (Deal deal) {
		deal.setCreatedAt(new Date());
		logger.debug("dealInsert  {}.", deal);
		int insertCnt = dealRepository.dealInsert(deal);
		
		return insertCnt;
	}


	public Deal dealSelect(int mainDealSrl) {
		logger.debug("dealSelect  {}.", mainDealSrl);
		Deal deal = dealRepository.dealSelect(mainDealSrl);
		System.out.println("======DealService deal========" + deal + "============================");
		return deal;
	}


	public List<Deal> dealSelectList() {
		List<Deal> dealList = dealRepository.dealSelectList();
		return dealList;
	}


	public int dealUpdate(Deal deal) {
		deal.setUpdatedAt(new Date());
		int updateCnt = dealRepository.dealUpdate(deal);
		System.out.println("======DealService dealUpdate========" + deal + "============================");
		return updateCnt;
	}
}
