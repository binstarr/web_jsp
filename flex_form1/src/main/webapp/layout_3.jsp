<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

h1 {
	padding: 10px;
}

p {
	padding: 10px;
}

body {
	display: flex;
	height: 100vh;
	justify-content: center;
	align-items: center;
}

section {
	display: flex;
	width: 1200px;
	height: 700px;
}

.content1 {
	flex: 1;
	background-color: orange;
}

article.content2 {
	flex: 1;
	display: flex;
	flex-direction: column;
}

article .sub1 {
	flex: 1;
	background-color: fuchsia;
}

article .sub2 {
	flex: 1;
	background-color: lime;
}
</style>
</head>
<body>
	<section>
		<%
		String age = request.getParameter("age");
		String name = request.getParameter("name");
		%>

		<article class="content1">
			<h1>
				너의 나이는
				<%=age%></h1>
			<p>11Lorem ipsum dolor sit amet consectetur adipisicing elit.
				Maxime mollitia, molestiae quas vel sint commodi repudiandae
				consequuntur voluptatum laborum numquam blanditiis harum quisquam
				eius sed odit fugiat iusto fuga praesentium optio, eaque rerum!
				Provident similique accusantium nemo autem. Veritatis obcaecati
				tenetur iure eius earum ut molestias architecto voluptate aliquam
				nihil, eveniet aliquid culpa officia aut! Impedit sit sunt quaerat,
				odit, tenetur error, harum nesciunt ipsum debitis quas aliquid.
				Reprehenderit, quia. Quo neque error repudiandae fuga? Ipsa
				laudantium molestias eos sapiente officiis modi at sunt excepturi
				expedita sint? Sed quibusdam recusandae alias error harum maxime
				adipisci amet laborum. Perspiciatis minima nesciunt dolorem!
				Officiis iure rerum voluptates a cumque velit quibusdam sed amet
				tempora. Sit laborum ab, eius fugit doloribus tenetur fugiat,
				temporibus enim commodi iusto libero magni deleniti quod quam
				consequuntur! Commodi minima excepturi repudiandae velit hic maxime
				doloremque. Quaerat provident commodi consectetur veniam similique
				ad earum omnis ipsum saepe, voluptas, hic voluptates pariatur est
				explicabo fugiat, dolorum eligendi quam cupiditate excepturi
				mollitia maiores labore suscipit quas? Nulla, placeat. Voluptatem
				quaerat non architecto ab laudantium modi minima sunt esse
				temporibus sint culpa, recusandae aliquam numquam totam ratione
				voluptas quod exercitationem fuga. Possimus quis earum veniam quasi
				aliquam eligendi, placeat qui corporis!</p>
		</article>

		<article class="content2">
			<div class="sub1">
				<h1>너의 이름은 <%=name %></h1>
				<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
					Maxime mollitia,
			</div>
			<div class="sub2">
				<h1>Sub2</h1>
				<p>Lorem ipsum dolor sit amet consectetur adipisicing elit.
					Maxime mollitia,
			</div>
		</article>
	</section>
</body>
</html>