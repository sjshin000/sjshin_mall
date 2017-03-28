package com.ssj.admin.deal.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	/**
	 * 총 건수 가져오기
	 * @return
     */
	public int getDealTotalCount() {
		return sqlSession.selectOne("deal.getDealTotalCount");
	}

	/**
	 *
	 * @param searchWord
	 * @return
     */
	public int getDealSearchTotalCount(String searchWord) {
		System.out.println("====>>>searchWord : " + searchWord);
		Map<String, String> param = new HashMap<>();
		param.put("searchWord", searchWord);
		return sqlSession.selectOne("deal.getDealSearchTotalCount", param);
	}

	/**
	 * 한페이 데이터만 가져오기
	 * @param params
	 * @return
     */
	public List<Deal> getDealsSearch(Map<String, Object> params) {
		return sqlSession.selectList("deal.getDealsSearch", params);
	}

	public int dealUpdate(Deal deal) {
		int updateCnt = sqlSession.update("deal.update", deal);
		return updateCnt;
	}
}
