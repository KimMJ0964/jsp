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
		box-shadow: 1px 1px 1px 1px rgb(203, 203, 203)
	}

    .innerBoard {
        border: 2px solid #C8C8C8;
        position: absolute;
        width: 1200px;
        height: 570px;
        left: 2%;
    }

    textarea {
            resize: none; /* 크기 조절 기능 비활성화 */
            width: 1000px;  /* 고정된 너비 */
            height: 400px; /* 고정된 높이 */
    }

    button {
        width: 202px;
        height: 35px;
        border: 1px solid #c8c8c8;
        border-radius: 10px;
        background-color: white;
    }

    #button-container {
        display: flex;
        justify-content: space-between; /* 좌우 끝으로 버튼 정렬 */
        padding: 10px; /* 상하 여백 추가 */
    }

    .left-buttons, .right-buttons {
        display: flex;
        gap: 10px;
    }

    .right-buttons {
        margin-left: auto; /* 오른쪽 버튼들을 오른쪽으로 정렬 */
    }
</style>
</head>
<body>
    <div id="header"></div>
    <div class="wrap">
        <h1>게시글 작성</h1>
        <div class="innerBoard">
            <table>
                <tr>
                    <th style="width: 60px;">제목</th>
                    <th><input type="text" style="width: 1000px; border-style: none;"></th>
                </tr>
            </table>
            <hr style="background-color: #c8c8c8; width: 97.5%;">
            <table>
                <tr>
                    <th style="width: 60px;">글쓰기</th>
                    <th><textarea style="border-style: none;"></textarea></th>
                </tr>
            </table>
            <hr style="background-color: #c8c8c8; width: 97.5%;">
            <br>
            <div id="button-container">
                <div class="left-buttons">
                    <button>사진 추가</button>
                    <button>유형 선택</button>
                </div>
                <div class="right-buttons">
                    <button style="background-color: #FF3E3E; color: white; font-weight: bold; border-color: #FF9797;">뒤로가기</button>
                    <button type="submit">작성완료</button>
                </div>
            </div>
        </div>        
    </div>
</body>
</html>