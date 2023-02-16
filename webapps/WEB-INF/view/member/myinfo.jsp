<%@page import="kh.member.model.vo.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
내정보보기
<c:if test="${empty myinfo }">
	<div>
		<h4>로그인 되지 않았습니다. 정보가 없습니다.</h4>
		<a href=<%=request.getContextPath() %>/login> 로그인 페이지로 이동</a>
			id: ${myinfo.id }
			<br>
			name: ${myinfo.passwd }
			<br>
			email: ${myinfo.email }
	</div>
</c:if>
	<hr>
	<h4>EL Session Attribute</h4>
			id: ${lgnss.id }
			<br>
			name: ${lgnss.passwd }
			<br>
			email: ${lgnss.email }
	</div>
<%
	MemberVo ss = (MemberVo)session.getAttribute("lgnss");
%>
	id:<%=ss.getId() %>
	<br>
<%
	Object obj = request.getAttribute("myinfo");
	MemberVo vo = null; 
	if(obj == null){
		// 로그아웃상태
%>
		<h4>로그인 되지 않았습니다. 정보가 없습니다.</h4>
		<a href="<%=request.getContextPath()%>/login">로그인페이지이동</a>
<%
	} else {
		if(obj instanceof MemberVo){
			vo = (MemberVo)obj;
		}
		if(vo == null){
			// 로그아웃상태
%>
			<h4>로그인 되지 않았습니다. 정보가 없습니다.</h4>
			<a href="<%=request.getContextPath()%>/login">로그인페이지이동</a>
<%
		} else {
			// 로그인된 정보 
%>
			id: <%=vo.getId() %>
			<br>
			name: <%=vo.getName() %>
			<br>
			email: <%=vo.getEmail() %>
<%
		}
	}
%>


</body>
</html>