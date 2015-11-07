package com.ssj.springstudy.board.controller;

import java.util.List;

import javax.jws.WebParam.Mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.springstudy.board.model.Board;
import com.ssj.springstudy.board.model.PageNavi;
import com.ssj.springstudy.board.service.BoardService;
import com.ssj.springstudy.sample.model.Sample;

@Controller
@RequestMapping("/board")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService boardService;
	
	/**
	 * 쓰기 화면 뷰 용(jsp로 포워딩만)
	 */
	@RequestMapping("/boardWriteForm")
	public ModelAndView boardWriteForm(){
		ModelAndView mov = new ModelAndView("/board/boardWriteForm");
		return mov;
	}
	
	/**
	 * 쓰기 Insert용 
	 * @param board
	 * @return
	 */
	@RequestMapping("/boardInsert")
	public ModelAndView sampleInsert(Board board) {
		ModelAndView mav = new ModelAndView("forward:/board/boardList");
		boardService.boardInsert(board);
		
		return mav;
	}
	
	/**
	 * 게시판 수정 page 가져오기
	 */
	@RequestMapping("/boardModifyForm")
	public ModelAndView boardModifyForm(@RequestParam(value="boardId" , required = false) int boardId ) {
		ModelAndView mov = new ModelAndView("/board/boardModifyForm");
		Board board = boardService.boardSelect(boardId);
		mov.addObject("board", board);
		return mov;
	}
	
	/**
	 * 수정 - Update
	 * @return
	 */
	@RequestMapping("/boardUpdate")
	public ModelAndView boardUpdate(Board board){
		ModelAndView mov = new ModelAndView("redirect:/board/boardList");
		boardService.boardUpdate(board);
		return mov;
	}
	
	/**
	 * 리스트 가져오기(화면뷰)
	 * @return
	 */
	@RequestMapping("/boardList")
	public ModelAndView boardList(@RequestParam(value = "page" , required = false) String page) {
		ModelAndView mov = new ModelAndView("/board/boardList");
		List<Board> boardList = boardService.boardSelectList();
		int pageNum = 0;
		int totalCount = boardList.size();
		
		if (page == null) {
			pageNum = 1;
		} else if (page != null){
			pageNum = Integer.parseInt(page);
		}
		
		mov.addObject("boardList", boardList);
		return mov;
	}
	
	/**
	 * 삭제
	 */
	@RequestMapping("/boardDeleteForm")
	public ModelAndView boardDeleteForm() {
		ModelAndView mov = new ModelAndView("/board/boardList");
		return mov;
	}
	
	@RequestMapping("/boardDelete")
	public ModelAndView boardDelete(@RequestParam(value="boardId" , required = false) int boardId) {
		ModelAndView mov = new ModelAndView("redirect:/board/boardList");
		boardService.boardDelete(boardId);
		return mov;
	}
}
