html>
<head>
  <title>User Details</title>
</head>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<body>

		<h1>Save User</h1>
		<% 
		String msg =(String)request.getAttribute("msg");
		if(msg!=null){
			out.print(msg);
		}
		%>

		<form action="user" method="post">
				<table>
					<tr>
					 	<td>Name</td>
					 	<td><input type="text" name="name"/></td>
					</tr> 	
					 <tr>
					 	<td>Email</td>
					 	<td><input type="text" name="email"/></td>
					</tr> 	
					 <tr>
					 	<td>PhoneNum</td>
					 	<td><input type="number" name="phno"/></td>
					</tr> 	
					 <tr>
					 	<td></td>
					 	<td><input type="submit" value="Submit"/></td>
					</tr> 	
		
		</table>
		
		<a href="user">View Users</a>
		
		</form>
		
		

	

</body>
</html>