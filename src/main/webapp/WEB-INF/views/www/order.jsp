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
	<tr class = "title">
		<th width = "20">딜번호</th>
		<th width = "50">상품 이미지</th>
		<th width = "50">상품 이름</th>
		<th width = "50">옵션 이름 123</th>
		
		<th width = "20">옵션번호</th>
		<th width = "20">상품가격</th>
		<th width = "20">수량</th>
		<th width = "20">상품당 가격</th>
		<th width = "20">주문금액</th>
		<th width = "20">딜 배송비</th>
	</tr>
	
	<c:forEach items = "${dealOptionList}" var = "dealOption" varStatus="status" >
	<c:forEach items = "${orderViewList}" var = "orderView" varStatus="status" >
		<tr class = "">
			<c:if test = "${orderView.mainDealSrl == deal.mainDealSrl}">
				<td>딜번호 : ${deal.mainDealSrl}</td>
				<td>상품이미지</td>
				<td>상품 이름 : ${deal.title}</td>

				<c:if test = "${deal.mainDealSrl == dealOption.mainDealSrl}">	
					<td>옵션 이름 : ${dealOption.dealOptionSrl}</td>
					<td>옵션번호 : ${dealOption.dealOptionSrl}</td>
					<td>상품가격 : ${dealOption.amount}</td>
					<td>수량 : ${orderView.orderCount}</td>
					<td>상품당 가격 10000 *${orderView.orderCount}</td>
					<td>주문금액</td>
					<td>딜 배송비 : ${deal.deliveryAmount}</td>
				</c:if>
			</c:if>
		</tr>
		orderDealOptionAmount : ${orderView.orderDealOptionAmount}
	</c:forEach>
	</c:forEach>
</table>
		
<br />
<br />
<br />

</body>
</html>