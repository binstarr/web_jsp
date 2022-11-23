<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.outerBox {
	width: 1000px;
	height: 1000px;
	background-color: gray;
	display: flex;
	align-items: center;
	justify-content: center;
	
}

.innerBox {
	width: 800px;
	height: 800px;
	display: flex;
	align-items: center;
	justify-content: center;
	background-color: white;
}

div img {
	width: 600px;
	height: 600px;
	box-sizing: content-box;
}
</style>
</head>
<body>
	<div class="outerBox">
		<div class="innerBox">
			<div>
				<img alt="" src="../images/rina.jpg">
			</div>
		</div>
	</div>
</body>
</html>