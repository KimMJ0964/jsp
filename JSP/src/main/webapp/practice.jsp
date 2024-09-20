<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<style>
	body {
		margin: 0;
		padding: 0;
		background-color: #ADE8F4;
	}
	
	.wrap {
		width: 1246px;
		margin: auto;
		border: 1px solid black;
		border-radius: 20px;
		background-color: white;
		box-shadow: 1px 1px 1px 1px rgb(203, 203, 203)
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
	
	.main_image {
		position: relative;
	}
	
	.main_image_text {
		position: absolute;
		top: 30%;
		left: 50%;
		transform: translate(-50%, -50%);
		color: white;
		font-weight: 900;
		text-shadow: -1px 0px black, 0px 1px black, 1px 0px black, 0px -1px
			black;
	}
	
	#search {
		display: flex;
		align-items: center;
		gap: 10px; /* 간격 조정 */
		margin-top: 10px;
		position: absolute;
		top: 80%;
		left: 55%;
		transform: translate(-30%, -50%);
		text-align: center;
		width: 100%;
	}
	
	#searchKeyword {
		background-color: rgb(231, 231, 231);
		border-radius: 40px;
		border-style: none;
		width: 40%;
		height: 35px;
		text-align: center;
	}
	
	.btn {
		background-color: rgb(179, 179, 179);
		border-radius: 40px;
		border-style: none;
		height: 35px;
		text-align: center;
	}
	
	.createBtn {
		float: right;
		border-radius: 10px;
		border-style: none;
		background-color: rgb(177, 192, 255);
		width: 90px;
		height: 35px;
		font-weight: 600;
		color: white;
	}
	
	.createBtn:hover {
		background-color: rgb(147, 169, 255);
	}
	
	.table {
		text-align: center;
    }
</style>
</head>
<body>
	<div id="header"></div>
    <div class="wrap">
        <div class="container mt-3">
            <div class="main_image">
                <img src="./img/ta.jpg" style="width: 1221px; border-radius: 20px;">
                <h1 class="main_image_text" style="font-size:50px">커뮤니티</h1>
                <div id="search">
                    <div class="dropdown">
                        <button type="button" id="dropdownMenuButton" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                            유형
                        </button>
                        <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                            <li><a class="dropdown-item" href="#" onclick="updateDropdownText('작성자')">작성자</a></li>
                            <li><a class="dropdown-item" href="#" onclick="updateDropdownText('제목')">제목</a></li>
                            <li><a class="dropdown-item" href="#" onclick="updateDropdownText('작성일')">작성일</a></li>
                        </ul>
                    </div>
                    <input type="text" id="searchKeyword" placeholder="키워드 검색">
                </div>
            </div>
            <br><br>        
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th style="background-color: #C8E8FF; border-radius: 30px 0px 0px 0px;">글번호</th>
                        <th style="background-color: #C8E8FF;">제목</th>
                        <th style="background-color: #C8E8FF;">작성자</th>
                        <th style="background-color: #C8E8FF;">유형</th>
                        <th style="background-color: #C8E8FF;">조회수</th>
                        <th style="background-color: #C8E8FF; border-radius: 0px 30px 0px 0px;">작성일</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>첫번째 게시글</td>
                        <td>user01</td>
                        <td>QnA</td>
                        <td>125</td>
                        <td>2024-01-01</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>두번째 게시글</td>
                        <td>user02</td>
                        <td>추천</td>
                        <td>33</td>
                        <td>2024-01-01</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>세번째 게시글</td>
                        <td>user03</td>
                        <td>추천</td>
                        <td>9</td>
                        <td>2024-01-01</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>네번째 게시글</td>
                        <td>user04</td>
                        <td>QnA</td>
                        <td>89</td>
                        <td>2024-01-01</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>다섯번째 게시글</td>
                        <td>user05</td>
                        <td>QnA</td>
                        <td>305</td>
                        <td>2024-01-01</td>
                    </tr>
                </tbody>
            </table>
            <br><br>
            <ul class="pagination justify-content-center">
                <li class="page-item"><a class="page-link" href="javascript:void(0);">이전</a></li>
                <li class="page-item"><a class="page-link" href="javascript:void(0);">1</a></li>
                <li class="page-item"><a class="page-link" href="javascript:void(0);">2</a></li>
                <li class="page-item"><a class="page-link" href="javascript:void(0);">3</a></li>
                <li class="page-item"><a class="page-link" href="javascript:void(0);">4</a></li>
                <li class="page-item"><a class="page-link" href="javascript:void(0);">5</a></li>
                <li class="page-item"><a class="page-link" href="javascript:void(0);">다음</a></li>
            </ul>
            <br>
            <button type="button" class="createBtn" onclick="navigateToPage()">글쓰기</button>
            <br><br><br>
        </div>
    </div>

    <script>
        function updateDropdownText(selectedText) {
            document.getElementById('dropdownMenuButton').textContent = selectedText;
        }
        
        function navigateToPage() {
            window.location.href = 'practice_boardOne.jsp';
        }
    </script>
</body>
</html>