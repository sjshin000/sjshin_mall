package com.ssj.www.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.www.deal.model.DealOption;
import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.repository.WwwDealOptionRepository;
import com.ssj.www.deal.repository.WwwDealRepository;
import com.ssj.www.order.model.OrderView;

@Service
public class OrderViewService {
	@Autowired
	private WwwDealRepository wwwDealRepository;
	
	@Autowired
	private WwwDealOptionRepository wwwDealOptionRepository;
	
	
	public OrderView orderWiewAmountSet(OrderView orderWiew) {
		System.out.println("======orderWiew.getOrderCount(): " + orderWiew.getOrderCount());
		
		//옵션 가격 조회 - 해당 옵션만 조회 필요한데.. 쿼리를 수정?
		
//		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
//		
//		int orderDealOptionAmount = orderWiew.getOrderAmount() * orderWiew.getOrderCount();
//		orderWiew.setOrderDealOptionAmount(orderDealOptionAmount);
//		
//		System.out.println("======orderWiewAmountSet: " + orderDealOptionAmount);
		
		return orderWiew;
	}
	
	
	
	public Deal dealSelect(int mainDealSrl) {
//		Deal deal = wwwDealRepository.dealSelect(mainDealSrl);
		Deal deal = wwwDealRepository.dealSelect(mainDealSrl);
		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
		deal.setDealOptions(dealOptionList);
		System.out.println("=======================wwwDealSelect : " + deal.getDealOptions());
		System.out.println("=======================getDealOptions size: " + deal.getDealOptions().size());
		
		return deal;
	}
	
	
	
	public List<DealOption> dealOptionSelect(int mainDealSrl) {
		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
		System.out.println("========서비스 dealOptionList size ======" + dealOptionList.size() + "============================");
		return dealOptionList;
	}
}
/*
 * 	private int orderCount;
	private int orderDealAmount;
	private int orderDealOptionAmount;
	private int orderAmount;
 */
