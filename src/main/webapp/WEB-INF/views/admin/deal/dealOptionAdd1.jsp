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
			$i = 0;
			$("#add").live("click", function(){
				i = i+1;
				var option = $(".option");
				var content = $(".content").clone();
				content.attr("class", "");
				option.append(content);
			});
		});
		
		$(document).ready(function(){
			$(".remove").live("click", function(){
				$(this).parents("tr").remove();
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
	<a href = "dealOptionAdd?mainDealSrl=${deal.mainDealSrl}">[옵션등록]</a>
</div>





<div id="content">

<th><button id = "add">Add</button></th>
	<form name = "dealOptionAdd" action="dealOptionInsert" method = "post">
		<input type="hidden" name = "mainDealSrl" value = "${mainDealSrl}" />
		<input type = "hidden" name = "whoUpdate" value = "sjshin"/>

	<table class = "option">
		<tr class = "title">
			<th width = "10"></th>
			<th width = "10">상태</th>
			<th width = 20>판매수량</th>
			<th width = 50>옵션명</th>
			<th width = 50>옵션명</th>
			<th width = 50>옵션명</th>
			<th width = 50>삭제</th>
		</tr>
		
		<tr class = "content">
			<td><input type = "text" class="id" name = "id" value = "0" size = "10"/></td>
			<td><input type = "text" name = "status" value = "WT" /></td>
			<td><input type = "text" name = "maxCount" value ="10"/></td>
			<td><input type = "text" name = "depth1" value = "1"/></td>
			<td><input type = "text" name = "depth2" value = "2"/></td>
			<td><input type = "text" name = "depth3" value = "3"/></td>
			<td><button class = "remove">Remove</button></td>
		</tr>
		
		<tr class = "content">
			<td><input type = "text" class="id" name = "id" value = "0" size = "10"/></td>
			<td><input type = "text" name = "status" value = "WT" /></td>
			<td><input type = "text" name = "maxCount" value ="10"/></td>
			<td><input type = "text" name = "depth1" value = "1"/></td>
			<td><input type = "text" name = "depth2" value = "2"/></td>
			<td><input type = "text" name = "depth3" value = "3"/></td>
			<td><button class = "remove">Remove</button></td>
		</tr>
		
		<tr class = "content">
			<td><input type = "text" class="id" name = "id" value = "0" size = "10"/></td>
			<td><input type = "text" name = "status" value = "WT" /></td>
			<td><input type = "text" name = "maxCount" value ="10"/></td>
			<td><input type = "text" name = "depth1" value = "1"/></td>
			<td><input type = "text" name = "depth2" value = "2"/></td>
			<td><input type = "text" name = "depth3" value = "3"/></td>
			<td><button class = "remove">Remove</button></td>
		</tr>
	</table>
	<p><input type = "submit" value = "등록" />
	</form>
</div>

</body>
</html>