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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ssj.admin.deal.model.DealOption;
import com.ssj.admin.deal.service.DealService;
import com.ssj.springstudy.sample.controller.SampleController;

public class DealOptionControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockHttpSession session;
	private MockHttpServletRequest request;
	
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void testDealOptionModifyForm() throws Exception{
		this.mockMvc.perform(post("admin/deal/dealOptionModify")
				.param("mainDealSrl", "1")
				.accept(MediaType.TEXT_HTML))
				.andExpect(status().isOk())				
				.andExpect(handler().handlerType(DealOptionController.class))
				.andExpect(handler().methodName("dealOptionModify"))				
//				.andExpect(model().attribute("sample" , hasProperty("id" , is("2"))))
//				.andExpect(model().attribute("sample" , hasProperty("title" , is("bbbbbbb"))))
//				.andExpect(model().attribute("sample" , hasItem( //- 리스트 일경우 다시 재확인
//						allOf(
//							hasProperty("id" , is("2"))
//							,hasProperty("title" , is("bbbbbbb"))
//						)	
//				)))
				.andDo(MockMvcResultHandlers.print());		
		
	}
}
