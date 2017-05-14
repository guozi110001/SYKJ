<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请提交您的身份信息</title>
<script>
	$(function(){
		$("#url").html($("#url").html()+window.URL.createObjectURL());
		$("#webkitURL").html($("#webkitURL").html()+window.webkitURL.createObjectURL());
	})
</script>
</head>
<body>
<jsp:include page="/ready.jsp"></jsp:include>
<div id="url">url:</div>
<div id="webkitUrl">webkitUrl:</div>
<form action="/SYKJ/dxs/uploadPics" enctype="multipart/form-data" method="post">
	<input type="file" value="获取照片">
	<input type="submit" value="上传">
</form>
</body>
</html>