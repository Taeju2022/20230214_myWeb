<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<section>
    <h1>게시글 목록</h1>
    <table>
    	<tr>
    		<td>글번호</td>
    		<td>제목</td>
    		<td>작성시간</td>
    		<td>조회수</td>
    	</tr>
    	<c:forEach items="$boardList }" var="vo" varStatus="s">
    	<!-- <c:set target="${vo }" property="boardTitle" value="aaa"/> -->
    	<c:if test="${s.count %2 ==1 }">
    	<tr style="{background:#ccc}">
    	<tr>
    		<td>${vo.boardNum } : ${s.count } : ${s.index } </td>
    		<td>${vo.boardTitle }</td>
    		<td>${vo.boardWriter }</td>
    		<td>${vo.boardDate }</td>
    		<td>${vo.boardReadcount }</td>
    	</tr>
    </table>
    <div>
    <h3>페이지 처리</h3>
    </div>
    <c:if test="${startPageNum >1 }">
    <span>&nbsp;&nbsp;이전&nbsp;&nbsp;</span>
    </c:if>
    <c:forEach begin="${startPageNum }" end="${endPageNum }" step="1" var ="page">
		<c:choose>
			<c:when test="${page == currentPage }">
			<span><b>&nbsp;&nbsp;${page }</b></span>
	<span>&nbsp; &nbsp; ${page } &nbsp; &nbsp;</span>    
    </c:forEach>
    
    다음
    
    ${boardlist }
    ${vo.boardNum " }<br>
    </c:forEach>
    <hr>
</section>


    