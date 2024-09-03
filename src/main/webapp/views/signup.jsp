<!DOCTYPE html>
<html>
<head>
  <title>SignUp Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
  <form action="signupss" method ="post">
    <h1>Welcome to the signup page</h1><br><br>
       <label for="uname">Username:</label>
      <input type="text" class="form-control" id="uname" style = "width: 50%" placeholder="Enter ur name" name="uname">
       <br>
       <label for="num">Phone num:</label>
      <input type="text" class="form-control" id="num" style = "width: 50%" placeholder="Enter your phone num" name="num">
    <br>
      <label for="gender">Gender:</label>
  <select class="form-control" id="gender" style="width: 50%" name="gender"  >
    <option>Male</option>
    <option>Female</option>
  </select><br>
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" style = "width: 50%" placeholder="Enter email" name="email">
   
    <br>
      <label for="pwd">Password:</label>
      <input type="password" class="form-control"  style = "width: 50%" id="pwd" placeholder="Enter password" name="pwd"> <br>
      
      <label for="image">Image:</label>
        <input type="text" id="image" class= "form-control" style = "width:50%" name="image" placeholder="Enter the url">
      
      <label>Address:</label>
    <textarea placeholder="Enter your address"  name ="address" class="form-control" style = "width: 50%"></textarea>

    <br>
<button type="submit" class="btn btn-primary">Submit</button>

<button type="reset" class="btn btn-danger">Reset</button>
<a href="/login"><button type="button" class="btn btn-primary">Login</button></a>


  </form>
</div>
</body>
</html>
