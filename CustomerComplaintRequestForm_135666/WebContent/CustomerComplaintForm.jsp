<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="Css/main.css" rel="stylesheet">
</head>
<body>
<h1 align="center"><u>Customer Complaint Request Form</u></h1>
<form:form action="success1.obj" modelAttribute="cust">
<table class="table" align="center">


<tr>
<td>Account Id:*</td>
<td style="color:red"><form:input path = "accountId"/><form:errors path = "accountId"/></td>
</tr>

<tr>
<td>Branch Code:*</td>
<td><form:input path="branchCode"/><form:errors path="branchCode"/></td>
</tr>

<tr>
<td>Email Id:*</td>
<td><form:input  path="emailId" /><form:errors path="emailId"/></td>
</tr>

<tr>
<td>Complain Category:*</td>
<td><form:select path="complainCategory">
<option>--Select--</option>
<option selected value="Internet Banking">Internet Banking</option>
<option selected value="General Banking">General Banking</option>
<option selected value="others">others</option>

</form:select></td>
</tr>

<tr>
<td>Description:*</td>
<td><form:textarea rows="5" cols="30" path="description"/>
<form:errors path="description"/></td>
</tr>


<tr>
<td colspan="2" align="center"><input type="submit" value="Submit"></td>
</tr>

<tr>
<td colspan="2" align="center"><h2><a href="checkStatus.obj">Check Status</a></h2></td>
</table>
</form:form>
</body>
</html>