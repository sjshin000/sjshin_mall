package com.ssj.www.deal.controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.model.DealOption;
import com.ssj.www.deal.service.WwwDealService;

@Controller
@RequestMapping("www")
public class WwwDealController {
	
	@Autowired
	private WwwDealService wwwDealService;
	
	
	/**
	 *www 딜 page 가져오기
	 */
	@RequestMapping("/deal")
	public ModelAndView dealModifyForm(@RequestParam(value="mainDealSrl" , required = false) int mainDealSrl) {
		ModelAndView mov = new ModelAndView("www/deal");
		System.out.println("===========================dealModify mainDealSrl" + mainDealSrl + "===========================================");

		Deal deal = wwwDealService.dealSelect(mainDealSrl);
		System.out.println("========컨트롤러 deal======" + deal + "============================");
		System.out.println("=======================컨트롤러  getDealOptions size: " + deal.getDealOptions().size());
		System.out.println("=======================컨트롤러  getDealOptions mainDealSrl : " + deal.getDealOptions().get(mainDealSrl));
		
		for (DealOption dealOption : deal.getDealOptions()) { // 여기가 문제
			System.out.println("==== controller for문: ");
			System.out.println("====controller dealOption : " + dealOption.getDepth1());
		}
		mov.addObject("deal", deal);
		return mov;
	}
}
