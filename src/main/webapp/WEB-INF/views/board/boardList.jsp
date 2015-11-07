<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
	<title>spring study board</title>
	<link type="text/css" href="/static/css/style.css" rel="stylesheet" />
</head>

<body>
    <div id="<element>jb-container</element>">
    	<div id="jb-header">
<%--    		<%@ include file= "/login/loginCheck" %>
 --%>
    		<a href = "/board/boardList">[게시판 리스트]</a>
    		<a href = "/board/boardWriteForm">[게시판 글쓰기]</a>
    		<a href = "/login/loginForm">[로그인]</a>
    	</div>
    	<div id="jb-content">

			<table>
				<tr class = 'title'>
					<th width = 50>순서</th>
					<th width = 300>제목</th>
					<th width = 50>작성자</th>
					<th width = 100>작성일</th>
					<th width = 100>수정일</th>
					<th width = 50>조회수</th>
				</tr>
				<c:set var="totalCount"  value = "${fn:length(boardList)}"/>
				<c:forEach items = "${boardList}" var = "board" varStatus="status">
				<tr>
					<td>${totalCount-status.index}</td>
					<td><a href = "/board/boardModifyForm?boardId=${board.boardId}">${board.title}</a></td>
					<td><c:out value = "${board.writer}" /></td>
					<td><fmt:formatDate value="${board.creatDate}" type="both" /></td>
					<td><fmt:formatDate value="${board.updateDate}" type="both" /></td>
					<td>${board.hit}</td>
				</tr>
				
				</c:forEach>
			</table>
			
			<a href = "/board/boardList?page=1">[1]</a>
			<a href = "/board/boardList?page=2">[2]</a>
			
			<%--
			<c:set var="totalPage" value="${totalCount/10 - (totalCount/10 % 1)}" />
			총페이지는 : ${totalPage}
			
			
			<c:set var="" value="" />
			<fmt:formatNumber value="${totalCount/10 - (totalCount/10 % 1)}" type="pattern" pattern="0" var="full"/>
        	<c:set var="index" value="index"/>
			<c:forEach var="index" begin="1" end="" step="1">
				<a href="board/boardList?page=${index}">${index}</a>
			</c:forEach>  
			 --%>
        
	    </div>
    	<div id="jb-footer">
    		jb-footer
    	</div>
    </div>
</body>
</html>
