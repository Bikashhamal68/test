
<!DOCTYPE html>
<%@page import="com.springboot.controller.UserDto"%>
<%@page import="java.util.List"%>
<%@page import="com.springboot.ListClass"%>
<%@page import="com.springboot.Dao.User"%>


<html>
<head>
<title>Result's page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>Bordered Table</h2>
		<p>Welcome to your database table:</p>
		
		<br><br>
		  <h2 style="color: red">${message }</h2>
		<a href="login"><button type="button" class="btn btn-primary">Login</button> </a>
				<a href="signup"><button type="button" class="btn btn-primary">Signup</button> </a>
		
		<br><br>
		
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Sid</th>
					<th>Username</th>
					<th>Email</th>
					<th>Phone Num</th>
					<th>Address</th>
					<th>Password</th>
					<th>Image</th>
					<th>Gender</th>
					<th>Delete</th>



				</tr>
			</thead>

			<tbody>
				<%List<UserDto> users= (List<UserDto>)request.getAttribute("bikash");
		for(UserDto user: users){%>
				<tr>
					<td><%= user.getId() %></td>

					<td><%= user.getUname() %></td>
					<td><%= user.getEmail() %></td>
					<td><%= user.getNum() %></td>
					<td><%= user.getAddress() %></td>
					<td><%= user.getPwd() %></td>


					<td>   
					<a href="editImage?id=<%= user.getId() %>"><img src="<%= user.getImage() %>" class="img-thumbnail"
						style="height: 100px"></a>
						</td>
						
					<td><%= user.getGender() %></td>
					<td><a href="deleteUser?id=<%= user.getId() %>"><button
								type="button" class="btn btn-danger">Delete</button></a></td>
				</tr>
				<%} %>
			</tbody>
		</table>
	</div>
</body>
</html>