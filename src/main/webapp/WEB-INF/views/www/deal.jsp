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
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
<script type="text/javascript">

function fn_changeSelected(obj) {
	var soption = $("#dealOptions option:selected").val();
	console.log("soption: " + soption);
	var index = $(".content").size();
	console.log("index : " + index);
	
	<c:forEach items = "${deal.dealOptions}" var = "dealOption" varStatus="status" >
		if (soption == ${dealOption.dealOptionSrl}) {
			
			var mainDealSrl = "${dealOption.mainDealSrl}";
			var dealOptionSrl = "${dealOption.dealOptionSrl}";
			var depth1 = "${dealOption.depth1}";
			var depth2 = "${dealOption.depth2}";
			var depth3 = "${dealOption.depth3}";
			var amount = "${dealOption.amount}";
			
			var optionInfo2 = $(".optionInfo2");
			var temp = $(".temp").clone();
			temp.attr("class", "content" );
			
			temp.append(depth1 + " | " + depth1 + " | " + depth3 + " | " + "  ");
			temp.append("<input type = 'number' name = 'orderViewList["+index+"].orderCount' value = '1' />");
			temp.append(" | " +amount + "원");
			temp.append("<td><input type = 'hidden' name = 'orderViewList["+index+"].mainDealSrl' value = '${dealOption.mainDealSrl}' /></td>");
			temp.append("<td><input type = 'hidden' name = 'orderViewList["+index+"].dealOptionSrl' value = '${dealOption.dealOptionSrl}' /></td>");
			
			optionInfo2.append(temp);
		}
	</c:forEach>
}
	


</script>
</head>
<body>

<!-- 딜상세 
주소 : http://localhost:8090/admin/deal/deal?mainDealSrl=1
타이틀
딜정보 노출  <br />
딜 번호 : ${mainDealSrl} <br />
딜 번호 : ${deal.mainDealSrl} <br />
딜 제목 : ${deal.title} <br />
딜 endDate : ${deal.endDate} <br />
딜 배송비 정책 : ${deal.deliveryPolicy} <br />
딜 배송비 deliveryAmount : ${deal.deliveryAmount} <br />
딜 배송비 deliveryIfAmount : ${deal.deliveryIfAmount} <br /> <br />
-->
딜 옵션정보 노출 <br />

<!-- 옵션maxCount : ${dealOption.maxCount}<br />
옵션status : ${dealOption.status}<br />
옵션amount : ${dealOption.amount}<br />
옵션depth1 : ${dealOption.depth1}<br />
옵션depth2 : ${dealOption.depth2}<br />
옵션depth3 : ${dealOption.depth3}<br />
옵션dealOptionSrl : ${dealOption.dealOptionSrl}<br /> -->

	<!-- 
		옵션 선택 정보 출력, 
		옵션 선택 시 옵션정보 출력2, 
		옵션 선택정보출력2에 옵션수량 ++ 시 카운트 증가 & 가격 변경  
	
	-->
	<select id = "dealOptions" onchange="javascript:fn_changeSelected(this);">
		<div class = "optionInfo1">
			<c:forEach items = "${deal.dealOptions}" var = "dealOption" varStatus="status" >
				<option 
					value = "${dealOption.dealOptionSrl}" 
					id = "${dealOption.dealOptionSrl}">
					${dealOption.depth1} | ${dealOption.depth2} | ${dealOption.depth3} | ${dealOption.amount}
				</option>
			</c:forEach>
		</div>
	</select>
	<!-- 		
			<form action="">
			<input name="a1" type="text">
		</form>
 -->
 	<form name = "orderView" action="/www/order" name="info">
	<div class = "optionInfo2">
		<div class = "temp">
		</div>
	</div>
		<input type ="submit"  value="바로구매">
	</form>
</body>
</html>