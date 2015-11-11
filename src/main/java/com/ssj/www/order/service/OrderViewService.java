package com.ssj.www.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.www.deal.model.DealOption;
import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.repository.WwwDealOptionRepository;
import com.ssj.www.deal.repository.WwwDealRepository;
import com.ssj.www.order.model.OrderView;
import com.ssj.www.order.model.OrderViewList;
import com.ssj.www.order.repository.OrderViewRepository;

@Service
public class OrderViewService {
	@Autowired
	private WwwDealRepository wwwDealRepository;
	
	@Autowired
	private WwwDealOptionRepository wwwDealOptionRepository;
	
	@Autowired
	private OrderViewRepository orderViewRepository;
	
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
	
	
//	
//	public Deal dealSelect(int mainDealSrl) {
////		Deal deal = wwwDealRepository.dealSelect(mainDealSrl);
//		Deal deal = wwwDealRepository.dealSelect(mainDealSrl);
//		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
//		deal.setDealOptions(dealOptionList);
//		System.out.println("=======================OrderViewService wwwDealSelect : " + deal.getDealOptions());
//		System.out.println("=======================OrderViewService getDealOptions size: " + deal.getDealOptions().size());
//		
//		return deal;
//	}
//	
//	
//	
//	public List<DealOption> dealOptionSelect(int mainDealSrl) {
//		List<DealOption> dealOptionList = wwwDealOptionRepository.dealOptionSelect(mainDealSrl);
//		System.out.println("========서비스 dealOptionList size ======" + dealOptionList.size() + "============================");
//		return dealOptionList;
//	}

	

	public List<OrderView> orderViewSelectList(OrderViewList orderViews) {
		System.out.println("========orderView서비스 접근");
		System.out.println(orderViews.toString());
		for(OrderView order : orderViews.getOrderViewList()) {
			System.out.println("===order.getOrderCount()===" + order.getOrderCount());
		}
		
		List<OrderView> orderViewList = orderViewRepository.orderViewSelectList(orderViews);
		System.out.println("========orderView서비스 dealOptionList size ======" + orderViewList + "============================");
		System.out.println(orderViewList.toString());
		
		for(OrderView orderView : orderViewList) {
			System.out.println("===orderView.getOrderCount()===" + orderView.getOrderCount());
		}
		
		return orderViewList;
	}

}