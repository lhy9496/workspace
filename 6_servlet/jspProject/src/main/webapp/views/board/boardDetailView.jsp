<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.kh.board.model.vo.Board" %>
    
<%
	Board b = (Board)request.getAttribute("board");
	//글번호, 카테고리명, 제목 등등
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    .outer{
        background: black;
        color: white;
        width: 1000px;
        height: 500px;
        margin: auto;
        margin-top: 50px;
    }
    .outer table {
            border: 1px solid white;
            border-collapse: collapse;
    }
    .outer > table tr, .outer > table td{
        border: 1px solid white;
    }
</style>
</head>
<body>
    <%@ include file="../common/menubar.jsp" %>
    <div class="outer">
        <br>
        <h2 align="center">일반게시판 상세보기</h2>
        <br>

        <table id="detail-area" border="1" align="center">
            <tr>
                <th width="70">카테고리</th>
                <td width="70"><%=b.getCategory() %></td>
                <th width="70">제목</th>
                <td width="350"><%=b.getBoardTitle() %></td>
            </tr>
            <tr>
                <th>작성자</th>
                <td><%=b.getBoardWriter() %></td>
                <th>작성일</th>
                <td><%=b.getCreateDate() %></td>
            </tr>
            <tr>
                <th>내용</th>
                <td colspan="3">
                    <p style="height: 200px;">
                        <%=b.getBoardContent() %>
                    </p>
                </td>
            </tr>
            <tr>
                <th>첨부파일</th>
                <td colspan="3">
                    <!-- 첨부파일 없음 -->
                    <!-- 첨부파일이 없습니다. -->
                    <!-- 첨부파일 있음 -->
                    <a download="첨부파일1" href="https://icons.veryicon.com/png/o/miscellaneous/administration/account-25.png">회원 아이콘</a>
                </td>
            </tr>
        </table>
        <br>

        <div align="center">
            <a href="<%=contextPath %>/list.bo?cpage=1" class="btn btn-sm btn-secondary">목록가기</a>
            <%if(loginUser != null && loginUser.getUserId().equals(b.getBoardWriter())) {%>
            <a href="" class="btn btn-sm btn-warning">수정하기</a>
            <a href="" class="btn btn-sm btn-danger">삭제하기</a>
            <%} %>
        </div>
    </div>
</body>
</html>