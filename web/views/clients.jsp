<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Clients</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table border="1">--%>
<%--    <caption>Clients</caption>--%>
<%--    <c:forEach items="${clients}" var="item">--%>
<%--        <tr>--%>
<%--            <td>${item.name}</td>--%>
<%--            <td>${item.email}</td>--%>
<%--            <td>${item.phone}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--<a href="/app">go to main page</a> <br>--%>
<%--</body>--%>
<%--</html>--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Clients</title>
</head>
<body>
<a href="/app">Main page</a> <br>

<c:forEach items="${clients}" var="item">
    ${item.name}, ${item.email},  ${item.phone} <br>
</c:forEach>
</body>
</html>