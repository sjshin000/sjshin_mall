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
		orderView.setDealOptionSrl(49);
		orderView.setOrderCount(2);
		orderViewList.add(orderView);
		
		OrderView orderView2 = new OrderView();
		orderView2.setMainDealSrl(1);
		orderView2.setDealOptionSrl(50);
		orderView2.setOrderCount(3);
		orderViewList.add(orderView2);
		
		OrderView orderView3 = new OrderView();
		orderView3.setMainDealSrl(2);
		orderView3.setDealOptionSrl(53);
		orderView3.setOrderCount(4);
		orderViewList.add(orderView3);
		
		OrderView orderView4 = new OrderView();
		orderView4.setMainDealSrl(2);
		orderView4.setDealOptionSrl(54);
		orderView4.setOrderCount(2);
		orderViewList.add(orderView4);
		
		OrderView orderView5 = new OrderView();
		orderView5.setMainDealSrl(2);
		orderView5.setDealOptionSrl(55);
		orderView5.setOrderCount(3);
		orderViewList.add(orderView5);
		
		OrderView orderView6 = new OrderView();
		orderView6.setMainDealSrl(3);
		orderView6.setDealOptionSrl(51);
		orderView6.setOrderCount(2);
		orderViewList.add(orderView6);
		
		OrderView orderView7 = new OrderView();
		orderView7.setMainDealSrl(3);
		orderView7.setDealOptionSrl(52);
		orderView7.setOrderCount(3);
		orderViewList.add(orderView7);
		
		inputOrderViewList.setOrderViewList(orderViewList);
		
		System.out.println("==결과orderViewList "+inputOrderViewList.getTotalAmount());
		
		System.out.println("hear");
		
		OrderViewList orderViewListResult = orderService.orderViewSelectList(inputOrderViewList);
		System.err.println("==서비스test결과출력 Otp갯수: "+orderViewListResult.getOrderViewList().size());
		System.err.println("==서비스test결과출력 딜 주문금액: "+orderViewListResult.getDealAmountMap());
		System.err.println("==서비스test결과출력 총 주문금액: "+orderViewListResult.getTotalAmount());
		System.err.println("==서비스test결과출력 배송비: "+orderViewListResult.getDeliveryAmount());
		/*
			==서비스test결과출력 Otp갯수: 7
			==서비스test결과출력 딜 주문금액: {1=23000, 2=90000, 3=50000}
			==서비스test결과출력 총 주문금액: 163000
			==서비스test결과출력 배송비: {1=2500, 2=0, 3=0}
		 */
	}
	
	@Test
	public void orderServiceTest2() {
		OrderViewList inputOrderViewList = new OrderViewList();  //OrderViewList 객체 이름 해깔림 수정필요..
		ArrayList<OrderView> orderViewList = new ArrayList<OrderView>();   //OrderViewList 의 Array 객체
		
		OrderView orderView = new OrderView();
		orderView.setMainDealSrl(1);
		orderView.setDealOptionSrl(49);
		orderView.setOrderCount(2);
		orderViewList.add(orderView);
		
		OrderView orderView2 = new OrderView();
		orderView2.setMainDealSrl(1);
		orderView2.setDealOptionSrl(50);
		orderView2.setOrderCount(3);
		orderViewList.add(orderView2);
		
		OrderView orderView3 = new OrderView();
		orderView3.setMainDealSrl(2);
		orderView3.setDealOptionSrl(53);
		orderView3.setOrderCount(4);
		orderViewList.add(orderView3);
		
		OrderView orderView4 = new OrderView();
		orderView4.setMainDealSrl(2);
		orderView4.setDealOptionSrl(54);
		orderView4.setOrderCount(2);
		orderViewList.add(orderView4);
		
		OrderView orderView5 = new OrderView();
		orderView5.setMainDealSrl(2);
		orderView5.setDealOptionSrl(55);
		orderView5.setOrderCount(3);
		orderViewList.add(orderView5);
		
		//Condition 조건 다른 케이스 배송비 부과
		OrderView orderView6 = new OrderView();
		orderView6.setMainDealSrl(3);
		orderView6.setDealOptionSrl(51);
		orderView6.setOrderCount(1);
		orderViewList.add(orderView6);
		
		OrderView orderView7 = new OrderView();
		orderView7.setMainDealSrl(3);
		orderView7.setDealOptionSrl(52);
		orderView7.setOrderCount(1);
		orderViewList.add(orderView7);
		
		inputOrderViewList.setOrderViewList(orderViewList);
		
		System.out.println("==결과orderViewList "+inputOrderViewList.getTotalAmount());
		
		System.out.println("hear");
		
		OrderViewList orderViewListResult = orderService.orderViewSelectList(inputOrderViewList);
		System.err.println("==서비스test결과출력 Otp갯수: "+orderViewListResult.getOrderViewList().size());
		System.err.println("==서비스test결과출력 딜 주문금액: "+orderViewListResult.getDealAmountMap());
		System.err.println("==서비스test결과출력 총 주문금액: "+orderViewListResult.getTotalAmount());
		System.err.println("==서비스test결과출력 배송비: "+orderViewListResult.getDeliveryAmount());
		/*
			==서비스test결과출력 Otp갯수: 7
			==서비스test결과출력 딜 주문금액: {1=23000, 2=90000, 3=20000}
			==서비스test결과출력 총 주문금액: 133000
			==서비스test결과출력 배송비: {1=2500, 2=0, 3=2500}
		 */
	}
}
