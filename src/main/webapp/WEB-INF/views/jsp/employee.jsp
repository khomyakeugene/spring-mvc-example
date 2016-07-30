<%--@elvariable id="employee" type="com.company.spring.mvc.model.Employee"--%>
<%--
  Created by IntelliJ IDEA.
  User: Yevhen
  Date: 28.07.2016
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<table style="align-items: center">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Position</th>
        <th>Phone Number</th>
        <th>Salary</th>
    </tr>
    <tr>
        <td>${employee.name}</td>
        <td>${employee.surname}</td>
        <td>${employee.position}</td>
        <td>${employee.phoneNumber}</td>
        <td>${employee.salary}</td>
    </tr>
</table>

</body>
</html>
