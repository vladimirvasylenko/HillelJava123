<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accounts</title>
</head>
<body>
<table border="1">
    <caption>Accounts</caption>
    <c:forEach items="${accounts}" var="item">
        <tr>
            <td>${item.number}</td>
            <td>${item.value}</td>
        </tr>
    </c:forEach>
</table>
<a href="/app">go to main page</a> <br>
</body>
</html>
