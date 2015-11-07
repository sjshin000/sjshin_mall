package com.ssj.www.deal.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssj.www.deal.model.Deal;
import com.ssj.www.deal.model.DealOption;
import com.ssj.springstudy.sample.repository.SampleRepository;

@Repository
public class WwwDealOptionRepository {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(SampleRepository.class);
		
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int dealOptionInsert(DealOption dealOption) {
		System.out.println("======Repository dealOptionInsert 호출========" + dealOption + "============================");
		int insertCnt = sqlSession.insert("wwwDealOption.insert", dealOption);
		return insertCnt;
	}

	public List<DealOption> dealOptionSelect(int mainDealSrl) {
		List<DealOption> dealOptionList = sqlSession.selectList("wwwDealOption.selectList", mainDealSrl);
		System.out.println("========Repository dealOptionList size ======" + dealOptionList.size() + "============================");
		return dealOptionList;
	}

	public int dealOptionUpdate(DealOption dealOption) {
		int insertCnt = sqlSession.update("wwwDealOption.update", dealOption);
		return insertCnt;
	}
}
