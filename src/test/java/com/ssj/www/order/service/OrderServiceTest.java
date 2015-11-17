package com.ssj.www.order.service;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ssj.www.order.model.OrderView;
import com.ssj.www.order.model.OrderViewList;


//-----------------환경설정 mock mvc test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/mvc-config.xml", "classpath:/spring/application*" })
@WebAppConfiguration
public class OrderServiceTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
//-----------------환경설정 mock mvc test 기본셋팅
	
	@Autowired
	OrderService orderService;
	
	@Test
	public void orderServiceTest() {
		OrderViewList inputOrderViewList = new OrderViewList();  //OrderViewList 객체 이름 해깔림 수정필요..
		ArrayList<OrderView> orderViewList = new ArrayList<OrderView>();   //OrderViewList 의 Array 객체
		
		OrderView orderView = new OrderView();
		orderView.setMainDealSrl(1);
		orderView.setDealOptionSrl(1);
		orderView.setOrderCount(2);
		orderViewList.add(orderView);
		
		OrderView orderView2 = new OrderView();
		orderView2.setMainDealSrl(1);
		orderView2.setDealOptionSrl(2);
		orderView2.setOrderCount(3);
		orderViewList.add(orderView2);
		
		OrderView orderView3 = new OrderView();
		orderView3.setMainDealSrl(1);
		orderView3.setDealOptionSrl(3);
		orderView3.setOrderCount(4);
		orderViewList.add(orderView3);
		
		OrderView orderView4 = new OrderView();
		orderView4.setMainDealSrl(2);
		orderView4.setDealOptionSrl(4);
		orderView4.setOrderCount(2);
		orderViewList.add(orderView4);
		
		OrderView orderView5 = new OrderView();
		orderView5.setMainDealSrl(2);
		orderView5.setDealOptionSrl(5);
		orderView5.setOrderCount(3);
		orderViewList.add(orderView5);
		
		inputOrderViewList.setOrderViewList(orderViewList);
		
		System.out.println("==결과orderViewList "+inputOrderViewList.getTotalAmount());
		
		System.out.println("hear");
		
		OrderViewList orderViewListResult = orderService.orderViewSelectList(inputOrderViewList);
		System.err.println("==서비스test결과출력 Otp갯수: "+orderViewListResult.getOrderViewList().size());
		System.err.println("==서비스test결과출력 딜총: "+orderViewListResult.getDealAmountMap());
		System.err.println("==서비스test결과출력 총: "+orderViewListResult.getTotalAmount());
		/*
			==서비스test결과출력 Otp갯수: 5
			==서비스test결과출력 딜총: {1=63000, 2=23000}
			==서비스test결과출력 총: 86000
		 */
	}
}
