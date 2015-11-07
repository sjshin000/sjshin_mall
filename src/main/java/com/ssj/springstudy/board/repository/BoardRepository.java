package com.ssj.springstudy.board.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssj.springstudy.board.model.Board;
import com.ssj.springstudy.sample.repository.SampleRepository;

@Repository
public class BoardRepository {
@SuppressWarnings("unused")
private static final Logger logger = LoggerFactory.getLogger(SampleRepository.class);
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	/**
	 * 쓰기 insert
	 */
	public int boardInsert(Board board) {
		int insertCnt = sqlSession.insert("board.insert" , board);
		return insertCnt;
	}
	
	/**
	 * 수정
	 * @param id
	 * @return
	 */
	public Board boardSelect(int boardId) {
		Board board = sqlSession.selectOne("board.select", boardId);
		return board;
	}

	public int boardUpdate(Board board) {
		int updateCnt = sqlSession.update("board.update", board);
		return updateCnt;
	}

	public List<Board> boardSelectList() {
		List<Board> boardList = sqlSession.selectList("board.selectList");
		return boardList;
	}

	public int boardDelete(int boardId) {
		int deleteCnt = sqlSession.delete("board.delete", boardId);
		return deleteCnt;
	}

}
