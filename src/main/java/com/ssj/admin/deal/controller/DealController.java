package com.ssj.admin.deal.controller;

import java.util.List;
import com.ssj.admin.deal.model.DealPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.service.DealService;
import com.google.gson.Gson;



@Controller
@RequestMapping("admin/deal")
public class DealController {
	private static final Logger logger = LoggerFactory.getLogger(DealController.class);
	
	@Autowired
	private DealService dealService;
	
	/**
	 * 쓰기 화면 뷰 용(jsp로 포워딩만)
	 */
	@RequestMapping("/dealAdd")
	public ModelAndView dealWriteForm(){
		ModelAndView mov = new ModelAndView("admin/deal/dealAdd");
		System.out.println("===========================dealAdd 페이지 접근============================================");
		logger.debug("dealAdd {}");
		return mov;
	}
	
	/**
	 * admin deal Insert용 
	 * @param
	 * @return
	 */
	@RequestMapping("/dealInsert")
	public ModelAndView dealInsert(Deal deal) {
		ModelAndView mav = new ModelAndView("admin/deal/dealList"); //"forward:/admin/deal/dealOptionAdd"
		dealService.dealInsert(deal);
		System.out.println("===========================dealService.dealInsert 호출============================================");
		
		System.out.println("===========================dealInsert 성공============================================");
		return mav;
	}

	/**
	 *
	 * @param page
	 * @param searchWord
     * @return
     */
	@RequestMapping("/dealList")
	public ModelAndView dealList(@RequestParam(value = "page" , required = false) String page
								, @RequestParam(value = "searchWord" , required = false) String searchWord) {
		ModelAndView mov = new ModelAndView("admin/deal/dealList");
		if (StringUtils.isEmpty(page)) {
			page = "1";
		}
		System.out.println("===>>>page : " + page);
		System.out.println("===>>>searchWord : " + searchWord);
		logger.debug("dealList3 page {}, searchWord {}", page, searchWord);

		DealPage dealPage = dealService.getDealSearch(Integer.parseInt(page), searchWord);

		logger.debug("dealList3 page {}, dealPage {}", page, dealPage);

		return mov.addObject("dealPage", dealPage);
	}

	//json 으로 리턴
//	@RequestMapping("/dealList3")
//	public @ResponseBody Object dealList(@RequestParam(value = "page" , required = false) String page
//			, @RequestParam(value = "page" , required = false) String searchWord) {
//		if (StringUtils.isEmpty(page)) {
//			page = "1";
//		}
//		DealPage dealPage = dealService.getDealSearch(Integer.parseInt(page), searchWord);
//		logger.debug("page {}, dealPage {}", searchWord, dealPage);
//
//		Gson gson = new Gson();
//
//		return gson.toJson(dealPage);
//	}
	/**
	 * 딜 수정 page 가져오기
	 */
	@RequestMapping("/dealModify")
	public ModelAndView dealModifyForm(@RequestParam(value="mainDealSrl" , required = false) int mainDealSrl) {
		ModelAndView mov = new ModelAndView("admin/deal/dealModify");
		System.out.println("===========================dealModify mainDealSrl" + mainDealSrl + "===========================================");

		Deal deal = dealService.dealSelect(mainDealSrl);
		System.out.println("========컨트롤러 deal======" + deal + "=======  =====================");
		mov.addObject("deal", deal);
		return mov;
	}
	
	
	/*
	 * 딜 수정 - Update
	 * @return
	 */
	@RequestMapping("/dealUpdate")
	public ModelAndView dealUpdate(Deal deal){
		ModelAndView mov = new ModelAndView("admin/deal/dealList");
		dealService.dealUpdate(deal);
		return mov;
	}
}
