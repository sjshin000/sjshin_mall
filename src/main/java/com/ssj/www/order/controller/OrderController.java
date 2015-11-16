package com.ssj.www.order.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.www.order.model.Order;
import com.ssj.www.order.model.OrderList;
import com.ssj.www.order.model.OrderViewList;
import com.ssj.www.order.service.OrderService;

@Controller
@RequestMapping("www")
public class OrderController {
	private static final Logger logger = LoggerFactory.getLogger(OrderController.class);
	
	@Autowired
	private OrderService orderService;
	
	/**
	 * orderView 화면 
	 */
	@RequestMapping("/order")
	public ModelAndView orderView(OrderViewList inputOrderViewList){
		ModelAndView mov = new ModelAndView("www/order");
		System.out.println("===========================www/order 페이지 접근============================================");
		System.out.println("=========paramOrder " + inputOrderViewList);
		System.out.println("=========orders " + inputOrderViewList.getOrderViewList().size());
		
//		List<OrderView> orderViewList = orderViewService.orderViewSelectList(inputOrderViewList);
		OrderViewList orderViewList = orderService.orderViewSelectList(inputOrderViewList);

		
		mov.addObject("orderViewList", orderViewList);
		return mov;
	}
	
	/**
	 * order 화면
	 */
	@RequestMapping("/orderInsert")
	public ModelAndView orderInsert(Order inputOrder){
		ModelAndView mov = new ModelAndView("www/orderResult");
		
		Order orderResult = orderService.orderInsert(inputOrder);

		
		mov.addObject("orderResult", orderResult);
		return mov;
	}
}
