<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>dealOption</title>
<link type="text/css" href="/static/css/style.css" rel="stylesheet" />

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			// 마지막 로우에서만 리무브 버튼 실행하도록 변경, 로우의 인덱스추가
			$("#add").live("click", function(){
				var index = $(".content").size();
				var option = $(".option");
				var temp = $(".temp").clone();
				//<tr class = "content">
				temp.attr("class", "content" ); 
				temp.attr("id", index );
				temp.append("<input type = 'hidden' class='mainDealSrl' name = 'dealOptions["+index+"].mainDealSrl' value = '"+${mainDealSrl}+"' />");
				temp.append("<input type = 'hidden' class='whoUpdate' name = 'dealOptions["+index+"].whoUpdate' value = 'sjshin' />")
				temp.append("<td><input type = 'text' class='status' name = 'dealOptions["+index+"].status' value = '' /></td>")
				temp.append("<td><input type = 'text' class='amount' name = 'dealOptions["+index+"].amount' value = '' /></td>")
				temp.append("<td><input type = 'text' class='maxCount' name = 'dealOptions["+index+"].maxCount' value = '' /></td>")
				temp.append("<td><input type = 'text' class='depth1' name = 'dealOptions["+index+"].depth1' value = '' /></td>")
				temp.append("<td><input type = 'text' class='depth2' name = 'dealOptions["+index+"].depth2' value = '' /></td>")
				temp.append("<td><input type = 'text' class='depth3' name = 'dealOptions["+index+"].depth3' value = '' /></td>")
				//temp.append("<td><button class = 'remove'>Remove</button></td>")
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

메인 딜 시리얼 : ${dealOption.mainDealSrl} <br />
메인 딜 시리얼 : ${mainDealSrl} <br />
메인 딜 시리얼 : ${deal.mainDealSrl} <br />
<br />
<div id="header">
	<a href = "dealList" >[딜리스트]</a>
	<a href = "dealAdd" >[딜등록]</a>
	<a href = "dealModify?mainDealSrl=${mainDealSrl}">[딜수정]</a>
	<a href = "dealOptionAdd?mainDealSrl=${mainDealSrl}">[옵션등록]</a>
	<a href = "dealOptionModify?mainDealSrl=${mainDealSrl}">[옵션수정]</a>
</div>





<div id="content">

<th><button id = "add">Add</button></th>
<td><button class = 'remove'>Remove</button></td>
	<form name = "dealOptionAdd" action="dealOptionInsert" method = "post">
<!-- 		<input type= "hidden" name = "mainDealSrl" value = "${mainDealSrl}" />
		<input type = "hidden" name = "whoUpdate" value = "sjshin"/> -->

	<table class = "option">
		<tr class = "title">
			<th width = "10">상태</th>
			<th width = "10">가격</th>
			<th width = 20>판매수량</th>
			<th width = 50>옵션명</th>
			<th width = 50>옵션명</th>
			<th width = 50>옵션명</th>
		</tr>
		
		<tr class = "content">
			<input type= "hidden" name = "dealOptions[0].mainDealSrl" value = "${mainDealSrl}" />
			<input type = "hidden" name = "dealOptions[0].whoUpdate" value = "sjshin"/>
			<td><input type = "text" name = "dealOptions[0].status" value = "WT" /></td>
			<td><input type = "text" name = "dealOptions[0].amount" value = "10000" /></td>
			<td><input type = "text" name = "dealOptions[0].maxCount" value ="10"/></td>
			<td><input type = "text" name = "dealOptions[0].depth1" value = "1"/></td>
			<td><input type = "text" name = "dealOptions[0].depth2" value = "2"/></td>
			<td><input type = "text" name = "dealOptions[0].depth3" value = "3"/></td>
		</tr>
	</table>
	<p><input type = "submit" value = "등록" />
	</form>
	
	
	
	<table class = "temp2" >
			<tr class = "temp">
		</tr>
	</table>
	
	<!--		<input type = "hidden" class="mainDealSrl" name = "dealOptions[${index}].mainDealSrl" value = "" />
			<input type = "hidden" class="whoUpdate" name = "dealOptions[${index}].whoUpdate" value = "" />
			<td><input type = "text" class="id" name = "id" value = "" size = "10"/></td>
			<td><input type = "text" class="dealOptionSrl" name = "dealOptions[${index}].dealOptionSrl" value = "" /></td>
			<td><input type = "text" class="status" name = "dealOptions[${index}].status" value = "" /></td>
			<td><input type = "text" class="amount" name = "dealOptions[${index}].amount" value = "" /></td>
			<td><input type = "text" class="maxCount" name = "dealOptions[${index}].maxCount" value ="" /></td>
			<td><input type = "text" class="depth1" name = "dealOptions[${index}].depth1" value = ""/></td>
			<td><input type = "text" class="depth2" name = "dealOptions[${index}].depth2" value = ""/></td>
			<td><input type = "text" class="depth3"  name = "dealOptions[${index}].depth3" value = ""/></td>
			<td><button class = "remove">Remove</button></td>
			 -->
</div>

</body>
</html>