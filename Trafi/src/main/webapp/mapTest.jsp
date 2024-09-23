
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
<title>지역 검색</title>
<style>
/* 전체 레이아웃 */
.container {
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 50px;
}
/* 지도 영역 스타일 */
#map {
	width: 500px;
	height: 400px;
	border: 5px solid #6FBAFF;
	border-radius: 10px;
}
/* 관광 명소 리스트 영역 스타일 */
.sidebar {
	margin-left: 30px;
	padding: 20px;
	width: 300px;
	height: 400px;
}
/* 검색 영역 스타일 */
.search-bar {
	display: flex;
	align-items: center;
	background-color: #87CEEB;
	padding: 10px;
	border-radius: 10px;
}

.search-bar input {
	width: 240px;
	padding: 5px;
	border-radius: 5px;
	border: none;
	font-size: 16px;
	background-color: #87CEEB;
	color: white;
	font-size: 20px;
}

.search-bar button {
	background: none;
	border: none;
	cursor: pointer;
	font-size: 18px;
}
/* 인기 관광 명소 목록 스타일 */
.popular-list {
	margin: 0;
	padding: 0;
	list-style: none;
	border-top: none;
	border-radius: 0 0 10px 10px;
	height: 270px;
	display: flex;
	flex-direction: column;
	justify-content: center;
	padding-left: 10px;
}

.popular-list li {
	font-size: 16px;
	padding: 5px 0;
	border-bottom: 1px solid #ddd;
}

.popular-list li:last-child {
	border-bottom: none;
}

.footer-link {
	text-align: right;
	padding-right: 10px;
	margin-top: 10px;
	font-size: 14px;
}

.footer-link a {
	text-decoration: none;
	color: #4682B4;
}
</style>
<script type="text/javascript"
	src="https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=8p05x3m14j"></script>
</head>
<body>

	<div class="container">
		<!-- 지도 영역 -->
		<div id="map"></div>

		<!-- 관광 명소 리스트 영역 -->
		<div class="sidebar">
			<!-- 지역 검색 제목과 검색 아이콘 -->
			<div class="search-bar">
				<input type="text" placeholder="지역 검색">
				<button>🔍</button>
			</div>
			<h2 align="center">인기 관광 명소</h2>
			<!-- 인기 관광 명소 리스트 -->
			<ul class="popular-list">
				<li>1위.</li>
				<li>1위.</li>
				<li>1위.</li>
				<li>1위.</li>
				<li>1위.</li>
				<li>1위.</li>
			</ul>

			<!-- 계절별 관광지 보기 링크 -->
			<div class="footer-link">
				<a href="#">계절별 관광지 보러가기 &gt;</a>
			</div>
		</div>
	</div>

	<script>
		var mapOptions = {
			center : new naver.maps.LatLng(37.3595704, 127.105399),
			zoom : 10
		};

		var map = new naver.maps.Map('map', mapOptions);
	</script>

</body>
</html>