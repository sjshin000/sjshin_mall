<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>deal list</title>
	<link type="text/css" href="/static/css/style.css" rel="stylesheet" />
	<script>
		function goList(nowPage){
			$.ajax({
				type: "GET",
				url:'./deal/dealList2?page=' + nowPage,
				cache: false,
				success: function(data){
					$("#listContent").html(data);
				}
			})
		}
	</script>
</head>


<body>
<div id="header">
	<a href = "dealList" >[딜리스트]</a>
	<a href = "dealAdd" >[딜등록]</a>
</div>


<div id="content">
</div>
<table>
	<tr class = 'listTitle'>
		<th width = 50>딜번호</th>
		<th width = 200>상품명</th>
		<th width = 50>상태</th>
		<th width = 100>카테고리1</th>
		<th width = 100>시작일</th>
		<th width = 50>종료일</th>
	</tr>
	<c:forEach items = "${dealPage.dealList}" var = "deal" >
		<tr class = "listContent">
			<td><a href = "/admin/deal/dealModify?mainDealSrl=${deal.mainDealSrl}">${deal.mainDealSrl}</a></td>
			<td><a href = "/admin/deal/dealModify?mainDealSrl=${deal.mainDealSrl}">${deal.title}</a></td>
			<td>${deal.dealStatus}</td>
			<td>${deal.category1}</td>
			<td><fmt:formatDate value="${deal.startDate}" type="both" /></td>
			<td><fmt:formatDate value="${deal.endDate}" type="both" /></td>
		</tr>
	</c:forEach>
</table>

<%-- 페이징 처리 - 현재 페이지 , 총 페이지, 마지막 페이지 데이터들, 이전 다음 --%>
<div class = "paging">
	총레코드 수 : ${dealPage.paging.totalCount} 건 </br>
	<c:set var = "endPage" value = "${dealPage.paging.totalPageCount}" />
	<c:set var = "startPage" value = "1" />
	<c:set var = "currentPageNo" value = "${dealPage.paging.currentPageNo}" />
	<c:forEach var = "index" begin = "${startPage}" end = "${endPage}" step="1">
		<a href = "dealList?page=${index}">
			<c:if test = "${currentPageNo == index}">
				<strong>${index}</strong>
			</c:if>
			<c:if test = "${currentPageNo != index}">
				${index}
			</c:if>
		</a>
	</c:forEach>
</div>
</body>
</html>