<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>deal</title>
<link type="text/css" href="/static/css/style.css" rel="stylesheet" />
</head>


<body>
<div id="header">
<a href = "dealList" >[딜리스트]</a>
<a href = "dealAdd" >[딜등록]</a>
</div>
	
<div id="content">
	<form name = "dealAdd" action="dealInsert" method = "post">
		<p>제목 : <input type = "text" name = "title" value = "test"/></p>
		<p>딜상태 : <input type = "text" name = "dealStatus" value = "WT" /></p>
		<p>딜시작일 : <input type = "date" name = "startDate" value = "2015-10-08" /></p>
		<p>딜종료일 : <input type = "date" name = "endDate" value = "2015-10-31" /></p>
		<p>카테고리 1 : <input type = "number" name = "category1" value = "1"/></p>
		<p>카테고리 2 : <input type = "number" name = "category2" value = "2"/></p>
		<p>카테고리 3 : <input type = "number" name = "category3" value = "3"/></p>
		<p>카테고리 4 : <input type = "number" name = "category4" value = "4"/></p>
		<p>배송비정책(deliveryPolicy) : 
			<input type = "radio" name = "deliveryPolicy" value = "Free" />무료배송
			<input type = "radio" name = "deliveryPolicy" value = "Per" />선결제
			<input type = "radio" name = "deliveryPolicy" value = "Condition" />조건부 무료배송
		</p>
		<p>배송비조건(deliveryIfAmount) : <input type = "number" name = "deliveryIfAmount" value = "5" /></p>
		<p>배송비(deliveryAmount) : <input type = "number" name = "deliveryAmount" value = "6" /></p>
		<p><input type = "submit" value = "확인" />
	</form>
</div>
	
</body>
</html>