package com.ssj.admin.deal.controller;

import java.util.Date;

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

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.model.DealOption;
import com.ssj.admin.deal.repository.DealOptionRepository;
import com.ssj.admin.deal.repository.DealRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:/spring/mvc-config.xml", "classpath:/spring/application*" })
@WebAppConfiguration

public class DealRepositoryTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}
	
	
	@Autowired
	private DealRepository dealRepository;
	private DealOptionRepository dealOptionRepository;

	@SuppressWarnings("deprecation")
	
//	public Date StringToDate() {
//		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		return format.parse("2015-10-01 00:00:00", new ParsePosition(0));
//	}
	
	@Test
	public void testDealInsert() throws Exception {
		Deal deal = new Deal();
		deal.setTitle("title6");
		
//		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//		Date startDate = transFormat.parse("2015-10-01 00:00:00");
//		Date endDate = transFormat.parse("2015-10-30 23:59:59");
//		Date createdAt = transFormat.parse("2015-10-30 23:59:59");
		
		deal.setStartDate("2015-10-01 00:00:00");
		deal.setEndDate("2015-10-01 00:00:00");
		deal.setCreatedAt(new Date());
		deal.setUpdatedAt(new Date());
//		deal.setWhoUpdate("sjshin");
//		deal.setStatusType("AV");
//		deal.setCategory1(123456);
//		deal.setCategory2(123456);
//		deal.setCategory3(123456);
//		deal.setCategory4(123456);

		int result = dealRepository.dealInsert(deal);
		Assert.assertEquals(result, 1);
	}
	
//	@Test
//	public void testDealOptionInsert() throws Exception {
//		DealOption dealOption = new DealOption();
//		dealOption.setMainDealSrl(5);
//		dealOption.setWhoUpdate("sjshin");
//		dealOption.setStatus("WT");
//		dealOption.setAmount(10000);
//		dealOption.setMaxCount(10);
//		dealOption.setDepth1("depth1");
//		dealOption.setDepth2("depth2");
//		dealOption.setDepth3("depth3");
//		
//		dealOption.setCreateAt(new Date());
//		
//		System.out.println("=================dealOption.getMainDealSrl() "+dealOption.getMainDealSrl());
//		System.out.println("=================dealOption.getAmount() "+dealOption.getAmount());
//		
//		int result = dealOptionRepository.dealOptionInsert(dealOption);
//		System.out.println("=================result"+result);
//		Assert.assertEquals(result, 1);
//	}
}
