package com.ssj.admin.deal.controller;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.handler;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.Assert;
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

import com.ssj.admin.deal.model.DealOption;
import com.ssj.admin.deal.service.DealService;

//-----------------환경설정 mock mvc test
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/mvc-config.xml", "classpath:/spring/application*" })
@WebAppConfiguration

public class DealOptionControllerTest {

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
	public void testDealOptionModifyForm() throws Exception{
		this.mockMvc.perform(post("/admin/deal/dealOptionModify")
				.param("mainDealSrl", "1")
				.accept(MediaType.TEXT_HTML))
				
				.andExpect(status().isOk())				
				.andExpect(handler().handlerType(DealOptionController.class))
				.andExpect(handler().methodName("dealOptionModify"))				

				.andDo(MockMvcResultHandlers.print());		
	}
}
