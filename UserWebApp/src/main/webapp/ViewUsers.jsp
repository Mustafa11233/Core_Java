 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <html>
<head>
  <title>User Details</title>
</head>

 
<body>


		<a href="index.jsp">Add New User</a>
		<table border="1">
			<thead>
			<tr>
			
				<td>S.no</td>
				<td>Name</td>
				<td>Email</td>
				<td>Phno</td>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${users}" var="user" varStatus="index">
				<tr>
					<td>${index.count}</td>
					<td>${user.userName}</td>
					<td>${user.userEmail}</td>
					<td>${user.userPhno}</td>
				</tr>	
		
		
			</c:forEach>
		</tbody>	
		</table>







</body>
</html>