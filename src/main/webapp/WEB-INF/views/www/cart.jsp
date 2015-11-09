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
cart 페이지

<br />
<table cdiscount_amountellspacing="0" border="1" summary="카트 리스트" class="tbl_cart" style="margin-top:30px">
    <caption>카트 리스트</caption>
    <colgroup>
        <col width="31"><col width="109"><col width="561"><col width="130"><col width="99">
    </colgroup>
    <thead>
        <tr>
            <th scope="col" class="check"><input type="checkbox" id="check_all" checked="checked" /></th>
            <th scope="col" class="thmb"><span class="blind">딜 이미지</span></th>
            <th scope="col" class="deal_info">상품정보</th>
            <th scope="col" class="amounts">주문금액</th>
            <th scope="col" class="delivery">배송비</th>
        </tr>
    </thead>
    <tfoot>
        <tr>
            <td colspan="5">선택상품을 <a style="cursor:pointer" class="btn_zzim btn_zzim_cart" id="btn_zzim_list">찜하기</a><a style="cursor:pointer" class="btn_del btn_remove_cart" id="btn_remove_list">삭제하기</a></td>
        </tr>
    </tfoot>
    
    <tbody class="cart_tbody">
		<tr name="deal_row" id="deal_227789657" data-delivery-groupno="">
           
			<td class="check">
                <input type="checkbox" name="cart_check[]" value="227789657" checked="checked" assocAvail="" />
			</td>
            
			<td class="thmb">
                <a href="/deal/227789657" target="_blank" class="thmb_inner" tl:area="CCCO" tl:ord="1" tl:linktype="img"><img src="http://img1.tmon.kr/deals/2014/12/16/135775401/around_fc6ac.jpg" width="94" height="62" alt=""></img></a>
			</td>
            
			<td class="deal_info">
				<a href="/deal/227789657" target="_blank" title="deal title" tl:area="CCCO" tl:ord="1" tl:linktype="txt">deal title</a>
				<ul name="option_area" class="uio_option_area">
					<li name="opt_deal" key="233057401_233059357">
					
						<input type="hidden" name="opt_deal_srl" value="227801041">
						<span class="option">옵션명	</span>
						<span class="amounts"><em name="opt_amount">17,000</em>원</span>
						
						<span class="uio_option_cnt">
							<input type="text"
							name="edit_opt_cnt"
							value="1"                                            class="uio_option_input option_count_233057401_5">
							<span class="uio_option_control">
								<a style="cursor:pointer" class="uio_btn_plus">증가</a>
								<a style="cursor:pointer" class="uio_btn_minus">감소</a>
							</span>
						</span>
						
						<span class="total">
							<em name="opt_total_amount">17,000</em>원
						</span>
					</li>
				</ul>
			</td>
            
            <td class="amounts"><span><em name="deal_total_amount">1,800</em>원</span></td>
            
            <td class="delivery" rowspan="1"> 
            	 <div name="layer_delivery_msg" class="delivery_terms">
                 	<em name="delivery_if_amount">9,800</em>원 이상<br/><span>무료배송</span>
                 </div>
                    
            	<div name="deal_delivery_amount">
            		<span class="delivery_charge"><em name="delivery_amount">2,500</em><span class="won">원</span></span>
            	</div>
	            	<span class="sico_fdelivery" style="display:none">무료배송</span>
            </td>
		</tr>
	
    </tbody>
</table>

</body>
</html>