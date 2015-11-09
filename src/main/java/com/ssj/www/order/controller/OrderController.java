package com.ssj.www.order.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.model.DealOption;
import com.ssj.www.order.model.OrderView;
import com.ssj.www.order.model.OrderViewList;
import com.ssj.www.order.service.OrderViewService;

@Controller
@RequestMapping("www")
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderViewService orderViewService;
	
	/**
	 * order 화면
	 */
	@RequestMapping("/order")
	public ModelAndView order(OrderViewList orderViewList){
		ModelAndView mov = new ModelAndView("www/order");
		System.out.println("===========================www/order 페이지 접근============================================");
		System.out.println("=========paramOrder " + orderViewList);
		System.out.println("=========orders " + orderViewList.getOrderViewList().size());
		
		orderViewService.orderViewSelectList(orderViewList);
		
//		Deal deal = null;
//		List<DealOption> dealOptionList = null;
//		for (OrderView orderView : orderViewList.getOrderViewList()) {
//			//deal 조회해 오기
//			deal = orderViewService.dealSelect(orderView.getMainDealSrl());
//
//			//option정보 조회해 오기
//			dealOptionList = orderViewService.dealOptionSelect(orderView.getMainDealSrl());
//			
//			//orderView amount set
//			orderView =  orderViewService.orderWiewAmountSet(orderView);
//			System.out.println("============orderView.getOrderDealOptionAmount() : " + orderView.getOrderDealOptionAmount());
//		}
		
		mov.addObject("orderViewList", orderViewList.getOrderViewList());
//		mov.addObject("deal", deal);
//		mov.addObject("dealOptionList", dealOptionList);
//		System.out.println("======orderViewList.getOrderViewList() 사이즈 "+ orderViewList.getOrderViewList());
//		System.out.println("======deal "+ deal);
//		System.out.println("======dealOptionList "+ dealOptionList);
		return mov;
	}
}
