package com.ssj.www.order.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.www.deal.repository.WwwDealOptionRepository;
import com.ssj.www.deal.repository.WwwDealRepository;
import com.ssj.www.order.model.Order;
import com.ssj.www.order.model.OrderList;
import com.ssj.www.order.model.OrderView;
import com.ssj.www.order.model.OrderViewList;
import com.ssj.www.order.repository.OrderRepository;

@Service
public class OrderService {
	@Autowired
	private WwwDealRepository wwwDealRepository;
	
	@Autowired
	private WwwDealOptionRepository wwwDealOptionRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	


	public OrderViewList orderViewSelectList(OrderViewList inputOrderViewList) {
		System.out.println("========orderView서비스 접근");
		System.out.println("오더뷰파람:"+inputOrderViewList.toString());
		
		List<OrderView> resultOrderViewList = orderRepository.orderViewSelectList(inputOrderViewList);
		System.out.println("오더뷰select결과:"+resultOrderViewList.toString());
		
		Map<Integer, Integer> dealAmountMap = new HashMap<Integer, Integer>();
		
		//옵션의 Amount , 딜의 Amount 구하기
		for(OrderView resultOrderView : resultOrderViewList) {
			System.out.println("===orderView.getOrderCount()==="+resultOrderView.getDealOptionSrl()+" : "+resultOrderView.getOrderCount());
			resultOrderView.setOrderDealOptionAmount(resultOrderView.getOrderCount() * resultOrderView.getAmount());
			
			Integer mainDealSrls = dealAmountMap.get(resultOrderView.getMainDealSrl());
			
			if(mainDealSrls == null) {
				dealAmountMap.put(resultOrderView.getMainDealSrl(), resultOrderView.getOrderDealOptionAmount());
			}else {
				dealAmountMap.put(resultOrderView.getMainDealSrl(), mainDealSrls + resultOrderView.getOrderDealOptionAmount());
			}
		}

		//Total Amout 카트구현 시 hash map에서 꺼내는거 다시 구현해야함.
		Set<Integer> mainDealSrls = dealAmountMap.keySet();
		Iterator<Integer> iterator = mainDealSrls.iterator();
		int totalAmount =0;
		while(iterator.hasNext()) {
			int mainDealSrl = iterator.next();
			int dealAmount = dealAmountMap.get(mainDealSrl);
			totalAmount += dealAmount;
		}
		
		OrderViewList result = new OrderViewList();
		result.setOrderViewList((ArrayList<OrderView>)resultOrderViewList);
		result.setDealAmountMap(dealAmountMap);
		result.setTotalAmount(totalAmount);
		System.out.println(resultOrderViewList.toString());
		return result;
	}



	public Order orderInsert(Order inputOrder) {
		Order resultOrder = orderRepository.orderInsert(inputOrder);
		return resultOrder;
	}

}