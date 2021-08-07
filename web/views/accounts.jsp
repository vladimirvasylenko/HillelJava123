<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accounts</title>
</head>
<body>
<a href="/app">Main page</a> <br>

<c:forEach items="${accounts}" var="item">
    ${item.clientId}, ${item.number}, , ${item.value} <br>
</c:forEach>
</body>
</html>

<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Accounts</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table border="1">--%>
<%--    <caption>Accounts</caption>--%>
<%--    <c:forEach items="${accounts}" var="item">--%>
<%--        <tr>--%>
<%--            <td>${item.clientId}</td>--%>
<%--            <td>${item.number}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
<%--</table>--%>
<%--<a href="/app">go to main page</a> <br>--%>
<%--</body>--%>
<%--</html>--%>
