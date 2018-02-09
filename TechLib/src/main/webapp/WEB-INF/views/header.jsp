<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>TechLib</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">Tech Library</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> Home</a></li>
       <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
       
        <li><a href="D:\dtt\TechLib\src\main\webapp\WEB-INF\views\login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
          </ul>
              
         <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
        <span class="caret"></span></a>
    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
      <li role="presentation"><a role="menuitem" tabindex="-1" href="AdminAdding.jsp">Supplier</a></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Product</a></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Category</a></li>
        </ul>
    <a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1
        <span class="caret"></span></a>
    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
      <li role="presentation"><a role="menuitem" tabindex="-1" href="AdminAdding.jsp">Books</a></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Magazines</a></li>
      <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Audio & Video</a></li>
      
    </ul>
  
</div>

</nav>
  
</body>
</html>