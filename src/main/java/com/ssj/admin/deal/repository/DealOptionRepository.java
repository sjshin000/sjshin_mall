package com.ssj.admin.deal.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssj.admin.deal.model.Deal;
import com.ssj.admin.deal.model.DealOption;
import com.ssj.springstudy.sample.repository.SampleRepository;

@Repository
public class DealOptionRepository {
	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(SampleRepository.class);
		
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public int dealOptionInsert(DealOption dealOption) {
		System.out.println("======Repository dealOptionInsert 호출========" + dealOption + "============================");
		int insertCnt = sqlSession.insert("dealOption.insert", dealOption);
		return insertCnt;
	}

	public List<DealOption> dealOptionSelect(int mainDealSrl) {
		List<DealOption> dealOptionList = sqlSession.selectList("dealOption.selectList", mainDealSrl);
		System.out.println("========Repository dealOptionList size ======" + dealOptionList.size() + "============================");
		return dealOptionList;
	}

	public int dealOptionUpdate(DealOption dealOption) {
		int insertCnt = sqlSession.update("dealOption.update", dealOption);
		return insertCnt;
	}
}
