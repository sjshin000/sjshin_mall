package com.ssj.admin.deal.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssj.admin.deal.model.DealPage;
import com.ssj.common.util.Paging;
import com.ssj.common.util.PagingUtils;
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


	public DealPage getDealSearch(int pageNo, String searchWord) {
		int totalCount = dealRepository.getDealSearchTotalCount(searchWord);
		int divideRecode = 10;

		Map<String, Object> params = PagingUtils.getSelectPageNumbers(pageNo, divideRecode, searchWord);
		List<Deal> deals = dealRepository.getDealsSearch(params);

		return makeDealPageData(pageNo, totalCount, divideRecode, deals);
	}

	private DealPage makeDealPageData(int pageNo, int totalCount, int divideRecode, List<Deal> deals) {
		int totalPageCount = totalCount / divideRecode;
		if (totalCount % divideRecode != 0) {
			totalPageCount = totalPageCount + 1;
		}

		DealPage dealPage = new DealPage();

		Paging paging = new Paging();
		paging.setCurrentPageNo(pageNo);
		paging.setTotalCount(totalCount);
		paging.setTotalPageCount(totalPageCount);

		dealPage.setPaging(paging);
		dealPage.setDealList(deals);
		return dealPage;
	}


	public int dealUpdate(Deal deal) {
		deal.setUpdatedAt(new Date());
		int updateCnt = dealRepository.dealUpdate(deal);
		System.out.println("======DealService dealUpdate========" + deal + "============================");
		return updateCnt;
	}
}
