
<!DOCTYPE html>
<html>
<head>
<title>login page</title>
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

<form action="/logins" method="post">
  <h1>Welcome to the login page</h1><br><br>
  <h2 style="color: red">${error }</h2>
       <label for="uname">Email:</label>
      <input type="text" class="form-control" id="uname" style = "width: 50%" placeholder="Enter ur email" name="email">
       <br>
       <label for="num">Password:</label>
      <input type="password" class="form-control" id="num" style = "width: 50%" placeholder="Enter your password" name="pwd">
    <br>
  <button type="submit" class="btn btn-primary">Login</button>
   <a href="signup"><button type="button" class="btn btn-danger">Signup</button></a> 
  
</form>

</div>

</body>
</html>