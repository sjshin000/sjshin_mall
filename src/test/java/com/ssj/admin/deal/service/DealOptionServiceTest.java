package com.ssj.admin.deal.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Assert;
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

import com.ssj.admin.deal.model.DealOption;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/mvc-config.xml", "classpath:/spring/application*" })
@WebAppConfiguration
public class DealOptionServiceTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;
	private DealOptionService dealOptionService;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	@Test
	public void test() {
		int mainDealSrl = 1;
		
		List<DealOption> dealOptions = dealOptionService.dealOptionSelect(mainDealSrl);

		System.out.println("=================dealOptions :" + dealOptions);
	}

}
