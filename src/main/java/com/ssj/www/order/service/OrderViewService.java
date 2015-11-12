package com.ssj.www.order.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	


	public List<OrderView> orderViewSelectList(OrderViewList inputOrderViewList) {
		System.out.println("========orderView서비스 접근");
		System.out.println(inputOrderViewList.toString());
		
		List<OrderView> resultOrderViewList = orderViewRepository.orderViewSelectList(inputOrderViewList);
		System.out.println(resultOrderViewList.toString());
		Map<Integer, OrderView> dealAmountMap = new HashMap<Integer, OrderView>();
		
		for(OrderView resultOrderView : resultOrderViewList) {
			System.out.println("===orderView.getOrderCount()==="+resultOrderView.getDealOptionSrl()+" : "+resultOrderView.getOrderCount());
			resultOrderView.setOrderDealOptionAmount(resultOrderView.getOrderCount() * resultOrderView.getAmount());
			
			dealAmountMap.put(resultOrderView.getMainDealSrl(), resultOrderView);		
		}
		
		Set<Integer> mainDealSrls = dealAmountMap.keySet();
		Iterator<Integer> it = mainDealSrls.iterator();
		
		while(it.hasNext()) {
			int mainDealSrl = it.next();
			OrderView orderView = dealAmountMap.get(mainDealSrl);
			System.out.println("===mainDealSrl:"+mainDealSrl);
			System.out.println("===orderView:"+orderView);
		}
		
		System.out.println(resultOrderViewList.toString());
		
//		int index = 0;
//		for (index = 0; resultOrderViewList.size() > index; index++) {
//			OrderView orderView = resultOrderViewList.get(index);
//			orderView.setOrderDealOptionAmount(orderView.getOrderCount() * orderView.getAmount());
//			System.out.println("===getOrderDealOptionAmount(): "+orderView.getOrderDealOptionAmount());
//			
//			if( 0 == index) {
//				orderView.setOrderDealAmountTot(orderView.getOrderDealOptionAmount());
//			} else {
//				OrderView orderViewTemp = resultOrderViewList.get(index-1);
//				int dealAmt = orderView.getOrderDealAmountTot();
//				
//				if(orderView.getMainDealSrl() == orderViewTemp.getMainDealSrl()) {
//					dealAmt += orderView.getOrderDealOptionAmount();
//					orderView.setOrderDealAmountTot(dealAmt);
//				}
//			}
//			System.out.println("==dealAmt:"+orderView.getOrderDealAmountTot());
//		}
		
		return resultOrderViewList;
	}

}