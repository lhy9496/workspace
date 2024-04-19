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

    <jsp:include page="../common/menubar.jsp" />

    <div class="outer" align="center">
        <br>
        <h1 align="center">게시판 상세조회</h1>
        <br>

        <table align="center" border="1">
            <tr>
                <td width="100">글번호</td>
                <td width="500">12</td>
            </tr>
            <tr>
                <td>제목</td>
                <td>안녕하세요</td>
            </tr>
            <tr>
                <td>작성자</td>
                <td>user01</td>
            </tr>
            <tr>
                <td>조회수</td>
                <td>20</td>
            </tr>
            <tr>
                <td>작성일</td>
                <td>2023/09/07</td>
            </tr>
            <tr>
                <td>내용</td>
                <td height="100">
                    안녕하세요^^ 출석하였습니다
                </td>
            </tr>
        </table>

        <br>

        <table align="center" border="1">
            <tr>
                <th>댓글작성</th>
                <th><textarea></textarea></th>
                <th><button>등록</button></th>
            </tr>
            <tr>
                <td colspan="3"><b>댓글(${list.size()})</b></td>
            </tr>
            <c:forEach var="r" items="${list }">
	            <tr>
	                <th>${r.replyWriter }</th>
	                <th>${r.replyContent }</th>
	                <th>${r.createDate }</th>
	            </tr>
	        </c:forEach>
        </table>
    </div>
</body>
</html>