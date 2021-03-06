package com.ssj.www.order.repository;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssj.www.order.model.Order;
import com.ssj.www.order.model.OrderList;
import com.ssj.www.order.model.OrderView;
import com.ssj.www.order.model.OrderViewList;

@Repository
public class OrderRepository {
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	public List<OrderView> orderViewSelectList(OrderViewList inputOrderViewList) {
		System.out.println("========OrderViewRepository 접근===");

		List<OrderView> resultOrderViewList = sqlSession.selectList("order.selectOrderViewList", inputOrderViewList);
		for (OrderView resultOrderView : resultOrderViewList) {
			for (OrderView inputOrderView : inputOrderViewList.getOrderViewList()) {
				if (resultOrderView.getDealOptionSrl() == inputOrderView.getDealOptionSrl()) {
					
					resultOrderView.setOrderCount(inputOrderView.getOrderCount());
					
					break;
				}
			}
		}
		return resultOrderViewList;
	}

	public Order orderInsert(Order inputOrder) {
		int resultOrder = sqlSession.insert("order.orderInsert", inputOrder);
		return null;
	}
}
