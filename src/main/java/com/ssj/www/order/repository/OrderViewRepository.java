package com.ssj.www.order.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssj.www.order.model.OrderView;
import com.ssj.www.order.model.OrderViewList;

@Repository
public class OrderViewRepository {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<OrderView> orderViewSelectList(OrderViewList orderViewList) {
		System.out.println("========OrderViewRepository 접근===");
		String dealOptionSrls = "";
		String temp = ",";
		int cnt = 0;
		for(OrderView orderView : orderViewList.getOrderViewList()) {
			int dealOptionSrl = orderView.getDealOptionSrl();
			System.out.println("dealOptionSrl===" + dealOptionSrl);
			cnt++;
			if (cnt == orderViewList.getOrderViewList().size()) {
				dealOptionSrls += dealOptionSrl;
			} else {
				dealOptionSrls += dealOptionSrl+temp;
			}
		}
		System.out.println("dealOptionSrls===" +dealOptionSrls);
		
		List<OrderView> OrderViewList = sqlSession.selectList("dealOptionOrderView.selectList", dealOptionSrls);
		return OrderViewList;
	}

}
