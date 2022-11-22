<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form 태그 화면</title>
<link rel="stylesheet" href="css/form_row.css">
</head>
<body>
	
	<header>flex form 태그 만들어 보기</header>
	
	<section> 
		<form action="" method="get">
			<div class = "__form-row">
				<label>name : </label> <input type="text" id = "username" name = "mName">
			</div>
			<div class = "__form-row">
				<label>password : </label> <input type="text" id = "pwd" name = "password">
			</div>
		</form>
	</section>
</body>
</html>