<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>dealOption</title>
<link type="text/css" href="/static/css/style.css" rel="stylesheet" />

<c:set var='dealOptionCnt' value="${fn:length(dealOptionList)}" />
<c:set var='dealOptions' value="${dealOptionList}" />
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
	<script type="text/javascript">
	var count =  ${dealOptionCnt};
		$(function(){
			//$i = 0; 마지막 로우에서만 리무브 버튼 실행하도록 변경, 로우의 인덱스추가
			$("#add").live("click", function(){
				var index = $(".content").size();
				var option = $(".option");
				var temp = $(".temp").clone();
				temp.attr("class", "content" ); 
				temp.attr("id", index );
				temp.append("<input type = 'hidden' class='mainDealSrl' name = 'dealOptions["+index+"].mainDealSrl' value = '"+${dealOptions[0].mainDealSrl}+"' />");
				temp.append("<input type = 'hidden' class='whoUpdate' name = 'dealOptions["+index+"].whoUpdate' value = 'sjshin' />")
				temp.append("<td><input type = 'text' class='dealOptionSrl' /></td>")
				temp.append("<td><input type = 'text' class='status' name = 'dealOptions["+index+"].status' value = '' /></td>")
				temp.append("<td><input type = 'text' class='amount' name = 'dealOptions["+index+"].amount' value = '' /></td>")
				temp.append("<td><input type = 'text' class='maxCount' name = 'dealOptions["+index+"].maxCount' value = '' /></td>")
				temp.append("<td><input type = 'text' class='depth1' name = 'dealOptions["+index+"].depth1' value = '' /></td>")
				temp.append("<td><input type = 'text' class='depth2' name = 'dealOptions["+index+"].depth2' value = '' /></td>")
				temp.append("<td><input type = 'text' class='depth3' name = 'dealOptions["+index+"].depth3' value = '' /></td>")
				option.append(temp);
			});
		});
		
		$(document).ready(function(){
			$(".remove").live("click", function(){
				var index = $(".content").size() - 1;
				$("#"+index).remove();
			});
		});
	</script>
</head>

<body>

<br />
<div id="header">
메인 딜 시리얼 : ${mainDealSrl} <br />
메인 딜 시리얼 : ${deal.mainDealSrl} <br />
메인 딜 시리얼 : ${dealOptions[0].mainDealSrl} <br />
메인 딜 시리얼 : ${dealOption.mainDealSrl} <br />
	<a href = "dealList" >[딜리스트]</a>
	<a href = "dealAdd" >[딜등록]</a>
	<a href = "dealModify?mainDealSrl=${dealOptions[0].mainDealSrl}">[딜수정]</a>
	<a href = "dealOptionAdd?mainDealSrl=${dealOptions[0].mainDealSrl}">[옵션등록]</a>
	<a href = "dealOptionModify?mainDealSrl=${dealOptions[0].mainDealSrl}">[옵션수정]</a>
</div>

<div id="content">


<button id = "add">Add</button>
<button class = "remove">Remove</button>
	<div id = "temp">

	</div>
			
	<form name = "dealOptionModify" action="dealOptionUpdate" method = "post">

	<table class = "option">
		<tr class = "title">
			<th width = "10">dealOptionSrl</th>
			<th width = "10">상태</th>
			<th width = "10">가격</th>
			<th width = 20>판매수량</th>
			<th width = 50>옵션명1</th>
			<th width = 50>옵션명2</th>
			<th width = 50>옵션명3</th>
		</tr>

		<c:forEach items = "${dealOptionList}" var = "dealOption" varStatus="status" >
			<tr class = "content" id = ${status.index} >
				<input type= "hidden" class="mainDealSrl" name = "dealOptions[${status.index}].mainDealSrl" value = "${dealOption.mainDealSrl}" />
				<input type = "hidden" class="whoUpdate" name = "dealOptions[${status.index}].whoUpdate" value = "${dealOption.whoUpdate}"/>
				<td><input type = "text" class="dealOptionSrl" name = "dealOptions[${status.index}].dealOptionSrl" value = "${dealOption.dealOptionSrl}" /></td>
				<td><input type = "text" class="status" name = "dealOptions[${status.index}].status" value = "${dealOption.status}" /></td>
				<td><input type = "text" class="amount" name = "dealOptions[${status.index}].amount" value = "${dealOption.amount}" /></td>
				<td><input type = "text" class="maxCount" name = "dealOptions[${status.index}].maxCount" value ="${dealOption.maxCount}"/></td>
				<td><input type = "text" class="depth1" name = "dealOptions[${status.index}].depth1" value = "${dealOption.depth1}"/></td>
				<td><input type = "text" class="depth2" name = "dealOptions[${status.index}].depth2" value = "${dealOption.depth2}"/></td>
				<td><input type = "text" class="depth3" name = "dealOptions[${status.index}].depth3" value = "${dealOption.depth3}"/></td>
			</tr>
		</c:forEach>

	</table>
	<p><input type = "submit" value = "등록" />
	</form>
	
	<table class = "temp2" >
			<tr class = "temp">
		</tr>
	</table>
</div>


</body>
</html>