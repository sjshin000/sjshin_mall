package com.ssj.www.order.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	


	public List<OrderView> orderViewSelectList(OrderViewList inputOrderViewList) {
		System.out.println("========orderView서비스 접근");
		System.out.println(inputOrderViewList.toString());
		
		List<OrderView> resultOrderViewList = orderViewRepository.orderViewSelectList(inputOrderViewList);
		System.out.println(resultOrderViewList.toString());
		
		Map<Integer, Integer> dealAmountMap = new HashMap<Integer, Integer>();
		
		for(OrderView resultOrderView : resultOrderViewList) {
			System.out.println("===orderView.getOrderCount()==="+resultOrderView.getDealOptionSrl()+" : "+resultOrderView.getOrderCount());
			resultOrderView.setOrderDealOptionAmount(resultOrderView.getOrderCount() * resultOrderView.getAmount());
			
			Set<Integer> mainDealSrls = dealAmountMap.keySet();
			Iterator<Integer> it = mainDealSrls.iterator();
			
			if(null == it) {
				System.out.println("======if it=="+it);
				dealAmountMap.put(resultOrderView.getDealOptionSrl(), resultOrderView.getOrderDealOptionAmount());	
			} else {
				System.out.println("======else it=="+it);
				while(it.hasNext()) {
					int mainDealSrl = it.next();
					int dealAmount = dealAmountMap.get(mainDealSrl);
					System.out.println("======while mainDealSrl=="+mainDealSrl);
					System.out.println("======while dealAmount=="+dealAmount);
					if(mainDealSrl==resultOrderView.getMainDealSrl()) {		
						dealAmount = dealAmount + resultOrderView.getOrderDealOptionAmount();
						dealAmountMap.put(resultOrderView.getDealOptionSrl(), dealAmount);	
					}
					System.out.println("===dealAmount: "+dealAmountMap.get(dealAmount));
				}
			}
		}

		System.out.println(resultOrderViewList.toString());
		return resultOrderViewList;
	}

}