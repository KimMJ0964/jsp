<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글쓰기</title>

<style>
    body {
        margin: 0;
        padding: 0;
        background-color: #ADE8F4;
    }
    
    .wrap {
        width: 1246px;
        height: 720px;
        margin: auto;
        border: 1px solid black;
        border-radius: 20px;
        background-color: white;
        box-shadow: 1px 1px 1px 1px rgb(203, 203, 203);
        text-align: center;
        position: relative;
    }
    
    #header, #footer, #aside {
        height: 20%;
    }
    
    #header {
        width: 1284px;
        height: 91px;
        background-color: white;
        border-radius: 30px;
        margin: 0 auto;
        margin-top: 20px;
        margin-bottom: 20px;
        box-shadow: 1px 1px 1px 1px rgb(203, 203, 203);
    }

    .innerBoard {
        border: 2px solid #C8C8C8;
        position: absolute;
        width: 1200px;
        min-height: 570px;
        left: 2%;
        background-color: #E3E3E3;
    }

    /* innerBoard 내부의 테이블만 스타일링 */
    .innerBoard table {
        border-collapse: collapse;
        min-width: 100%; /* 100%로 설정하여 부모 요소에 맞게 조정 */
    }
    
    .innerBoard th, .innerBoard td {
        text-align: center;
        border: 2px solid #C8C8C8;
    }

    .innerBoard th {
        background-color: #E3E3E3;
    }
    
    .comment-btn1 {
    	background-color: #FF8484;
    	font-size: 14px;
    	color: white;
    	width: 134px;
    	height: 35px;
    	border-radius: 20px;
    	border-style: none;
    }
    .comment-btn1:hover {
    	background-color: #ff6b6b;
    }
    
    .comment-btn2 {
    	background-color: white;
   		font-size: 14px;
    	width: 134px;
    	height: 35px;
    	border-radius: 20px;
    	border-style: none;
    }
     .comment-btn2:hover {
    	background-color: #fff7f7;
    }
    
    .comment-board {
    	
    }
</style>
</head>
<body>
    <div id="header"></div>
    <div class="wrap">
        <h1>게시글</h1>
        <div class="innerBoard">
            <table>
                <tr>
                    <th colspan="5">제목</th>
                </tr>
                <tr style="background-color : #F6F6F6;">
                    <th style="background-color : #F6F6F6;">아이디 : </th>
                    <th style="background-color : #F6F6F6;">작성일 : </th>
                    <th style="background-color : #F6F6F6;">유형 : </th>
                    <th style="background-color : #F6F6F6;">조회수 : </th>
                    <th style="background-color : #F6F6F6;">좋아요 : </th>
                </tr>
                <tr>
                    <td colspan="5" style="height: 350px; background-color: white;"></td>
                </tr>                
            </table>
            <br>
            <table>
            	<tr class="comment-board" style="border-style: none;">
            		<th style="border-style: none; width: 50px;"></th>
                	<th class="comment-title" style="border-style: none; background-color: #F6F6F6; width: 200px;">댓글</th>
                	<th style="border-style: none; width: 300px;"></th>
                	<th style="border-style: none; width: 500px;">
                		<button class="comment-btn1">게시글 삭제</button>
                		<button class="comment-btn2">게시글 수정</button>
                		<button class="comment-btn2">댓글 작성</button>
                		<button class="comment-btn2">목록으로 돌아가기</button>
                	</th>
                </tr>
            </table>
        </div>        
    </div>
</body>
</html>