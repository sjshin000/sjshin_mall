package com.ssj.www.order.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//-----------------환경설정 mock mvc test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/mvc-config.xml", "classpath:/spring/application*" })
@WebAppConfiguration

public class OrderControllerTest {

	@Autowired
	private WebApplicationContext wac;
	
	@Autowired
	private MockHttpSession session;
	
	@Autowired 
	private MockHttpServletRequest request;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
//-----------------환경설정 mock mvc test 기본셋팅
	

	@Test
	public void orderViewTest() throws Exception {
		
		this.mockMvc.perform(post("/www/order")
				.param("orderViewList[0].orderCount", "2")
				.param("orderViewList[0].mainDealSrl", "1")
				.param("orderViewList[0].dealOptionSrl", "3")
				.param("orderViewList[1].orderCount", "3")
				.param("orderViewList[1].mainDealSrl", "1")
				.param("orderViewList[1].dealOptionSrl", "2")
				.param("orderViewList[2].orderCount", "4")
				.param("orderViewList[2].mainDealSrl", "1")
				.param("orderViewList[2].dealOptionSrl", "1")
				
				.accept(MediaType.TEXT_HTML))
				
				.andExpect(status().isOk())	
				.andExpect(handler().handlerType(OrderController.class))
				.andExpect(handler().methodName("orderView"))
				.andDo(MockMvcResultHandlers.print());	
	}
}
