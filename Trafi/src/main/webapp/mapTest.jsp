<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=8p05x3m14j"></script>
</head>
<body>
	네이버 맵 api 테스트
	
<div id="map" style="width:400px; height:400px;"></div>

<script>
	var mapOptions = {
	    center: new naver.maps.LatLng(37.3595704, 127.105399),
	    zoom: 10
	};
	
	var map = new naver.maps.Map('map', mapOptions);
</script>
</body>
</html>