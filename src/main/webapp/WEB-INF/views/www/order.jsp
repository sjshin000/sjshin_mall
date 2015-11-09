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
		
		<th scope="col" class="amounts">상품당 가격</th>
		<th scope="col" class="delivery">딜 배송비</th>
	</tr>
	
	<c:forEach items = "${dealOptionList}" var = "dealOption" varStatus="status" >
	<c:forEach items = "${orderViewList}" var = "orderView" varStatus="status" >
		<tr class = "">
			<c:if test = "${orderView.mainDealSrl == deal.mainDealSrl}">
				<td>${deal.mainDealSrl}</td>
				<td>상품이미지</td>
				<td><a href="" target="_blank" title="deal title" tl:area="CCCO" tl:ord="1" tl:linktype="txt">상품 이름 : ${deal.title}</a>
				
				<ul name="option_area" class="uio_option_area">
				<c:if test = "${deal.mainDealSrl == dealOption.mainDealSrl}">	
					<span class="option">옵션 이름 : ${dealOption.dealOptionSrl}</span>
					옵션번호 : ${dealOption.dealOptionSrl}
					<span class="amounts"><em name="opt_amount">상품가격 : ${dealOption.amount}</em></span>
					수량 : ${orderView.orderCount}
					상품당 가격 10000 *${orderView.orderCount}
					
					<td>주문금액</td>
					<td>딜 배송비 : ${deal.deliveryAmount}</td>
				</c:if>
				</ul>
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