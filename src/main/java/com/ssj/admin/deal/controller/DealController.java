package com.ssj.admin.deal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.service.DealService;


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
		return mov;
	}
	
	/**
	 * admin deal Insert용 
	 * @param mav
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
	 * 리스트 가져오기(화면뷰)
	 * @return
	 */
	@RequestMapping("/dealList")
	//public ModelAndView boardList(@RequestParam(value = "page" , required = false) String page) {
	public ModelAndView dealList() {
		ModelAndView mov = new ModelAndView("admin/deal/dealList");
		List<Deal> dealList = dealService.dealSelectList();
//		int pageNum = 0;
//		int totalCount = dealList.size();
//		
//		if (page == null) {
//			pageNum = 1;
//		} else if (page != null){
//			pageNum = Integer.parseInt(page);
//		}
//		
		mov.addObject("dealList", dealList);
		return mov;
	}

	
	/**
	 * 딜 수정 page 가져오기
	 */
	@RequestMapping("/dealModify")
	public ModelAndView dealModifyForm(@RequestParam(value="mainDealSrl" , required = false) int mainDealSrl) {
		ModelAndView mov = new ModelAndView("admin/deal/dealModify");
		System.out.println("===========================dealModify mainDealSrl" + mainDealSrl + "===========================================");

		Deal deal = dealService.dealSelect(mainDealSrl);
		System.out.println("========컨트롤러 deal======" + deal + "============================");
		mov.addObject("deal", deal);
		return mov;
	}
	
	
	/**
	 * 딜 수정 - Update
	 * @return
	 */
	@RequestMapping("/dealUpdate")
	public ModelAndView dealUpdate(Deal deal){
		ModelAndView mov = new ModelAndView("admin/deal/dealList");
		dealService.dealUpdate(deal);
		return mov;
	}


//	
//	/**
//	 * 삭제
//	 */
//	@RequestMapping("/boardDeleteForm")
//	public ModelAndView boardDeleteForm() {
//		ModelAndView mov = new ModelAndView("/board/boardList");
//		return mov;
//	}
//	
//	@RequestMapping("/boardDelete")
//	public ModelAndView boardDelete(@RequestParam(value="boardId" , required = false) int boardId) {
//		ModelAndView mov = new ModelAndView("redirect:/board/boardList");
//		boardService.boardDelete(boardId);
//		return mov;
//	}
}
