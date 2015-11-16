<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<link type="text/css" href="/static/css/style.css" rel="stylesheet" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript">



</script>
</head>


<body>
order 페이지

<br />
<table class = "content">
    <colgroup>
        <col width="31"><col width="109"><col width="561"><col width="130"><col width="99">
    </colgroup>
	<tr class = "title">
		<th scope="col" class="thmb">딜</th>
		<th scope="col" class="deal_info">상품 이미지</th>
		<th scope="col" class="deal_info">상품 정보</th>
		
		<th scope="col" class="amounts">딜 합계</th>
		<th scope="col" class="delivery">딜 배송비</th>
	</tr>
	
	<c:forEach items = "${orderViewList.getOrderViewList()}" var = "orderView" varStatus="status" >
		<tr class = "">
			<td>${orderView.mainDealSrl}</td>
			<td>상품이미지</td>
			<td><a href="" target="_blank" title="deal title" tl:area="CCCO" tl:ord="1" tl:linktype="txt">상품 이름 : ${orderView.title}</a>
			
			<ul name="option_area" class="uio_option_area">
				<span class="option">옵션 이름 : ${orderView.dealOptionSrl}</span>
				옵션번호 : ${orderView.dealOptionSrl}
				<span class="amounts"><em name="opt_amount">옵션가격 : ${orderView.amount}</em></span>
				수량 : ${orderView.orderCount}
				옵션가격 합 : ${orderView.orderDealOptionAmount}
				
				<td>딜합계 : ${orderViewList.getDealAmountMap().get(orderView.mainDealSrl)}</td>
				<td>딜 배송비 : ${orderView.deliveryAmount}</td>
			
			</ul>
		</tr>
			---${orderViewList.getDealAmountMap().get(orderView.mainDealSrl)}---
	</c:forEach>
</table>	
	   ====총주문금액 : ${orderViewList.totalAmount}
	   
   <form name = "orderInsert" action="/www/orderInsert" name="info">
   		신용카드: <input type="text" name="payAmount" value="" /></br>
   		적립금: <input type="text" name="pointAmount" value="" /></br>
   		totalDiscountAmount: <input type="text" name="totalDiscountAmount" value="" /></br>
   		cpuponAmount: <input type="text" name="cpuponAmount" value="" /></br>
   		deliveryAmount: <input type="text" name="deliveryAmount" value="" /></br>
   		deliveryAddress: <input type="text" name="deliveryAddress" value="" /></br>
   		deliveryMsg: <input type="text" name="deliveryMsg" value="" /></br>
   		<input type = 'hidden' name = 'totalAmount' value = '${orderViewList.totalAmount}' />
   		<input type = 'hidden' name = 'memberSrl' value = '1234' />
   		<input type = 'hidden' name = 'payAmount' value = 'payAmount' />
   		<input type ="submit"  value="구매하기">
   </form>

		
<br />
<br />
<br />

</body>
</html>