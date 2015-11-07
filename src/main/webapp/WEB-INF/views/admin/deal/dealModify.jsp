<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
딜수정페이지
<div id="header">
	<a href = "dealList">[딜리스트]</a>
	<a href = "dealAdd">[딜등록]</a>
	<a href = "dealModify?mainDealSrl=${deal.mainDealSrl}">[딜수정]</a>
	<a href = "dealOptionAdd?mainDealSrl=${deal.mainDealSrl}">[옵션등록]</a>
	<a href = "dealOptionModify?mainDealSrl=${deal.mainDealSrl}">[옵션수정]</a>
</div>

<div id="content">
	<form name = "dealModefy" action="dealUpdate" method = "post">
		<input type = "hidden" name = "mainDealSrl" value = "${deal.mainDealSrl}"/></p>
		<p>제목 : <input type = "text" name = "title" value = "${deal.title}"/></p>
		<p>딜시작일 : <input type = "date" name = "startDate" value = "${deal.startDate}" /></p>
		<p>딜종료일 : <input type = "date" name = "endDate" value = "${deal.startDate}" /></p>
		<p>카테고리 1 : <input type = "number" name = "category1" value = "${deal.category1}"/></p>
		<p>카테고리 2 : <input type = "number" name = "category2" value = "${deal.category2}"/></p>
		<p>카테고리 3 : <input type = "number" name = "category3" value = "${deal.category3}"/></p>
		<p>카테고리 4 : <input type = "number" name = "category4" value = "${deal.category4}"/></p>
		<p>배송비정책(deliveryPolicy) : 
			<input type = "radio" name = "deliveryPolicy" value = "Free" />무료배송
			<input type = "radio" name = "deliveryPolicy" value = "Per" />선결제
			<input type = "radio" name = "deliveryPolicy" value = "Condition" />조건부 무료배송
		</p>
		<p>배송비조건(deliveryIfAmount) : <input type = "number" name = "deliveryIfAmount" value = "${deal.deliveryIfAmount}" /></p>
		<p>배송비(deliveryAmount) : <input type = "number" name = "deliveryAmount" value = "${deal.deliveryAmount}" /></p>
		<p><input type = "submit" value = "확인" />
			
	</form>
</div>
</body>
</html>