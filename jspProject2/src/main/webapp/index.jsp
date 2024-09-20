<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.common.JDBCTemplate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<% JDBCTemplate.getConnection(); %>		--%>
	<%@ include file="views/common/menubar.jsp" %>
</body>
</html>

<!-- 
		* 회원서비스
					| C(Insert) | R(Select) | U(Update) | D(Delete) | 
		==========================================================================
		 로그인	    |			|	  O		|			|			|
		 회원가입	    |	  O		|			|			|			|
	 	 마이페이지	|			|	  O		|	  		|			|
		 정보수정		|			|			|	  O		|			|
		 회원탈퇴		|			|			|	  O		|			|	 
	 	 아이디중복체크 |			|	  O		|			|			|
	 	 
	 	 * 공지사항
	 	  - 공지사항 리스트 조회(R) / 상제 조회(R)
	 	  	공지사항 작성(C) / 공지사항 수정(U) / 공지사항 삭제(U)
	 	  	
	 	 * 일반 게시판
	 	  - 게시판 리스트 조회(R) - 페이징 처리 / 상세 조회(R)
	 	  	게시글 작성(C) / 게시글 수정(U) / 게시글 삭젝(U)
	 	  	[댓글 리스트 조회(R) / 댓글작성(C)]
	 	  	
	 	 * 사진 게시판
	 	  - 게시판 리스트 조회(R) - 썸네일 형식 / 상세 조회(R)
	 	  	게시글 작성(C) - 첨부파일 업로드
	 -->