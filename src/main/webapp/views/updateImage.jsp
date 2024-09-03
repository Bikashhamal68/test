
<!DOCTYPE html>
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
		<p>you can update your image here:</p>
		
		
		
		
		
		<table class="table table-bordered">
		
		
	
			<thead>
				<tr>
					<th>id</th>
					
					<th>Email</th>




				</tr>
			</thead>

			<tbody>

				<tr>
					<td>${user.id } </td>


						
						
					<td>${user.email } </td>

				</tr>

			</tbody>
		</table>
		        <div class="image-container">
            <img src="${user.image}" class="img-thumbnail" style="height: 300px">
        </div>
       <form action="/updateImage" method="post">
                   <input type="hidden" name="id" value="${user.id}">
       
        <label>Enter new Url to update your image</label>
       <input type="text" name="url">
<button style="color: blue">Submit</button>
       </form>
       

		

	</div>
</body>
</html>