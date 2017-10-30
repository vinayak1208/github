<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="submit.obj" modelAttribute="key1">
<h1 align="center"><u>Check Status</u></h1>
<table align="center">
<tr>
<td>Complaint Id :</td>
<td><input type="text" name="complainid"></td>
</tr>

<tr>
<td align="center" colspan="2"><input type="submit" value="Check Status"></td>
</tr>


<tr>
<th>Complaint Id</th>
<th>Description</th>
<th>Status</th>
</tr>



<tr>
<td>${key1.complaintid}</td>
<td>${key1.description }</td>
<td>${key1.status }</td>
</tr>

</table>
</form>
</body>
</html>