package com.ssj.springstudy.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssj.springstudy.board.model.Board;
import com.ssj.springstudy.board.model.PageNavi;
import com.ssj.springstudy.board.repository.BoardRepository;

@Service
public class BoardService {
	@Autowired
	private BoardRepository boardRepository;
	
	public int boardInsert(Board board) {
		int insertCnt = boardRepository.boardInsert(board);		
		return insertCnt;
	}
	
	
	public Board boardSelect(int boardId) {
		Board board = boardRepository.boardSelect(boardId);
		return board;
	}
	
	public int boardUpdate(Board board) {
		int inserCnt = boardRepository.boardUpdate(board);
		return inserCnt;
	}

	public List<Board> boardSelectList() {
		List<Board> boardList = boardRepository.boardSelectList();
		return boardList;
	}

	public int boardDelete(int boardId) {
		int deleteCnt = boardRepository.boardDelete(boardId);
		return deleteCnt;
	}
	
//	public PageNavi pageNavi(int pageNum, int count) {
//		int num = 10; //페이징 처리할 갯수
//		int totalCount = count; //총 레코드 갯수
//		int pageCount = totalCount/num; //총페이지 갯수  1페이지면 1~10 로우 셀렉트 //2페이면//SELECT * FROM board ORDER BY boardId DESC LIMIT 1,10;
//		//1페이지면 1,10 / 2페이지면 21~30    ?,?//  (?*10)+1, (?+1)*10; 
//		int lastPageList = totalCount/10%1;//마지막 페이지의 리스트 수   // (?*10)+1,lastPageList;
//		int page = 1;
//		
//
//		//PageNavi pageNavi = boardRepository.boardSelectPage(pageNum);
//		
//		
//		return null;
//	}
}
