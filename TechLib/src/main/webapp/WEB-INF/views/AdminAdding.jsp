<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container">
		<ul class="nav nav-pills">
			<li class="active"><a data-toggle="pill" href="#cat">Category</a></li>
			<li class="active"><a data-toggle="pill" href="#sup">Supplier</a></li>
			<li class="active"><a data-toggle="pill" href="#prod">Product</a></li>
		</ul>


		<div class="tab-content">
			<div id="cat" class="tab-pane fade in active">
			<form:form method="post" action="save">    
        <table >  
        <tr>    
          <td>ID :</td>    
          <td><form:input path="cid" /></td>  
         </tr>     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="cname"  /></td>  
         </tr>    
                  <tr>    
          <td colspan="2"><input type="submit" value="OK" /></td>    
         </tr>    
         <tr>    
          <td colspan="2"><input type="submit" value="Cancel" /></td>    
         </tr>    
        </table>    
       </form:form>    
       </div>
       </div>
       <div class="tab-content">
			<div id="sup" class="tab-pane fade in active">
			<form:form method="post" action="save">    
        <table >  
        <tr>    
          <td>ID :</td>    
          <td><form:input path="sid" /></td>  
         </tr>     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="sname"  /></td>  
         </tr>    
                  <tr>    
          <td colspan="2"><input type="submit" value="OK" /></td>    
         </tr>    
         <tr>    
          <td colspan="2"><input type="submit" value="Cancel" /></td>    
         </tr>    
        </table>    
       </form:form>    
       </div>
       </div>
       <div class="tab-content">
			<div id="prod" class="tab-pane fade in active">
			<form:form method="post" action="save">    
        <table >  
        <tr>    
          <td>ID :</td>    
          <td><form:input path="pid" /></td>  
         </tr>     
         <tr>    
          <td>Name : </td>   
          <td><form:input path="pname"  /></td>  
         </tr>    
                  <tr>    
          <td colspan="2"><input type="submit" value="OK" /></td>    
         </tr>    
         <tr>    
          <td colspan="2"><input type="submit" value="Cancel" /></td>    
         </tr>    
        </table>    
       </form:form>    
       </div>
       </div>
       </div>
       </body>
       </html>