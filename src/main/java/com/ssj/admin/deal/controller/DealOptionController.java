package com.ssj.admin.deal.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.model.DealOption;
import com.ssj.admin.deal.model.ParamOptionDeal;
import com.ssj.admin.deal.service.DealOptionService;


@Controller
@RequestMapping("admin/deal")
public class DealOptionController {
	private static final Logger logger = LoggerFactory.getLogger(DealController.class);
	
	@Autowired
	private DealOptionService dealOptionService;
	
	/**
	 * 옵션등록 화면 뷰 용(jsp로 포워딩만)
	 */
	@RequestMapping("/dealOptionAdd")
	public ModelAndView dealOptionAdd(@RequestParam(value="mainDealSrl" , required = false) int mainDealSrl ){
		ModelAndView mov = new ModelAndView("admin/deal/dealOptionAdd");
		System.out.println("==================dealOptionAdd 페이지로 이동=====================");
		mov.addObject("mainDealSrl", mainDealSrl);
		System.out.println("==================mainDealSrl" +mainDealSrl+ "=====================");
		return mov;
	}
	
	
	/**
	 * admin deal option Insert용 
	 * @param mav
	 * http://krespo.net/167
	 */
	@RequestMapping("/dealOptionInsert")
	public ModelAndView dealOptionInsert(ParamOptionDeal dealOptions) {
		System.out.println("===========================Controller : dealOptionInsert===========================");
		ModelAndView mav = new ModelAndView("admin/deal/dealList");
		
		System.out.println("===Controller dealOptions size : " + dealOptions.getDealOptions().size());
		
			
		for (DealOption dealOption : dealOptions.getDealOptions()) {
			System.out.println("== controller for문: ");
			dealOptionService.dealOptionInsert(dealOption);
			System.out.println("====controller dealOption : " + dealOption);
		}
		
		mav.addObject("mainDealSrl");
		return mav;
	}
	
	
	/**
	 * admin deal option 수정 page 가져오기
	 */
	@RequestMapping("/dealOptionModify")
	public ModelAndView dealOptionModify(@RequestParam(value="mainDealSrl" , required = false) int mainDealSrl) {
		ModelAndView mov = new ModelAndView("admin/deal/dealOptionModify");
		List<DealOption> dealOptionList = dealOptionService.dealOptionSelect(mainDealSrl);
		
		System.out.println("========컨트롤러 mainDealSrl ======" + mainDealSrl + "============================");
		System.out.println("========컨트롤러 dealOptionList size ======" + dealOptionList.size() + "============================");
		mov.addObject("dealOptionList", dealOptionList);
		return mov;
	}
	
	
	
	/**
	 * admin deal option Insert용 
	 * @param mav
	 * http://krespo.net/167
	 */
	@RequestMapping("/dealOptionUpdate")
	public ModelAndView dealOptionUpdate(ParamOptionDeal dealOptions) {
		System.out.println("===========================Controller : dealOptionUpdate===========================");
		ModelAndView mav = new ModelAndView("admin/deal/dealList");
		
		System.out.println("===Controller dealOptions size : " + dealOptions.getDealOptions().size());
		
			
		for (DealOption dealOption : dealOptions.getDealOptions()) {
			String dealOptionSrl = String.valueOf(dealOption.getDealOptionSrl());
			System.out.println("== dealOptionUpdate controller for문 : dealOptionSrl " + dealOptionSrl); //dealOptionSrl 44
			if (null == dealOptionSrl || dealOptionSrl.equals("0")) {
				dealOptionService.dealOptionInsert(dealOption);
				System.out.println("==null == dealOptionSrl ");
			} else {
				dealOptionService.dealOptionUpdate(dealOption);
				System.out.println("==null 아닐때 == dealOptionSrl ");
			}
			System.out.println("====dealOptionUpdate controller dealOption : " + dealOption);
		}
		
		mav.addObject("mainDealSrl");
		return mav;
	}
	
	
}
