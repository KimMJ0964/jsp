<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList, com.kh.board.model.vo.Board" %>
<%
	ArrayList<Board> list = (ArrayList<Board>)request.getAttribute("list");
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
            margin: auto;
            height: auto;
            margin-top: 50px;
            width: 1000px;
        }

        .list-area {
            max-width: 850px;
            margin: auto;
        }

        .thumbnail {
            display: inline-block;
            border: 1px solid white;
            padding: 12px;
            margin: 12px;
            width: 250px;
            box-sizing: border-box;
        }

        .thumbnail:hover {
            cursor: pointer;
            opacity: 0.9;
        }

        .thumbnail > p > span {
            display: inline-block;
            width: 220px;
            text-overflow: ellipsis;
            white-space: nowrap;
            overflow: hidden;
        }
        </style>
</head>
<body>
    <%@ include file="../common/menubar.jsp" %>
    
    <div class="outer">
        <br>
        <h2 align="center">사진게시판</h2>
        <br>
        <% if( loginUser != null ) { %>
            <div align="right" style="width: 850px; margin-bottom: 4px;">
                <a href="<%=contextPath%>/enrollForm.th" class="btn btn-sm btn-secondary">글쓰기</a>
            </div>
        <% } %>

		<% for(Board b : list) { %>
	        <div class="list-area">
	            <div class="thumbnail" align="center">
	                <img src="<%=contextPath %>/<%=b.getTitleImg() %>" width="200px" heigth="150px" alt="썸내일 이미지">
	                <p>
	                    <span>No. <%=b.getBoardNo() %> <%=b.getBoardTitle() %></span><br>
	                    조회수 : <%=b.getCount() %>
	                </p>
	            </div>
	        </div>
		<% } %>
        
    </div>
</body>
</html>