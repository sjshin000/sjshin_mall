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

		List<OrderView> result = sqlSession.selectList("dealOptionOrderView.selectList", orderViewList);
		for (OrderView item : result) {
			for (OrderView inputItem : orderViewList.getOrderViewList()) {
				if (item.getDealOptionSrl() == inputItem.getDealOptionSrl()) {
					item.setOrderCount(inputItem.getOrderCount());
					break;
				}
			}
		}
		return result;
	}

}
