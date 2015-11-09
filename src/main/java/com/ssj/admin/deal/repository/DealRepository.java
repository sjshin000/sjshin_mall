package com.ssj.admin.deal.repository;

import java.util.List;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.model.DealOption;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class DealRepository {
	@SuppressWarnings("unused")
		
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	
	public int dealInsert(Deal deal) {
		int insertCnt = sqlSession.insert("deal.insert", deal);
		return insertCnt;
	}

	public Deal dealSelect(int mainDealSrl) {
		Deal deal = sqlSession.selectOne("deal.selectOne", mainDealSrl);
		System.out.println("======Repository deal========" + deal + "============================");
		return deal;
	}

	public List<Deal> dealSelectList() {
		List<Deal> deal = sqlSession.selectList("deal.selectList");
		System.out.println("======Repository deal====================================");
		return deal;
	}

	public int dealUpdate(Deal deal) {
		int updateCnt = sqlSession.update("deal.update", deal);
		return updateCnt;
	}
}
