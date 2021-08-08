<<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Clients Statuses</title>
</head>
<body>
<table border="1">
    <caption>Clients Statuses</caption>
    <c:forEach items="${clientsStatuses}" var="item">
        <tr>
            <td>${item.clientName}</td>
            <td>${item.clientEmail}</td>
            <td>${item.statusAlias}</td>
        </tr>
    </c:forEach>
</table>
<a href="/app">go to main page</a> <br>
</body>
</html>
