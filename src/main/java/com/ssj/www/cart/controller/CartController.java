package com.ssj.www.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssj.www.order.model.OrderViewList;

@Controller
@RequestMapping("www")
public class CartController {
	
	/**
	 * cart 뷰 화면
	 * @return
	 */
	
	@RequestMapping("cart")
	public ModelAndView cart(){
		ModelAndView mov = new ModelAndView("www/cart");
		return mov;
	}

}
