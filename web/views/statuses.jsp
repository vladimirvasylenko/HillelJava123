<%--<<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Statuses</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<table border="1">--%>
<%--    <caption>Statuses</caption>--%>
<%--    <c:forEach items="${statuses}" var="item">--%>
<%--        <tr>--%>
<%--            <td>${item.alias}</td>--%>
<%--            <td>${item.description}</td>--%>
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
    <title>Statuses</title>
</head>
<body>
<a href="/app">Main page</a> <br>

<c:forEach items="${statuses}" var="item">
    ${item.alias},  ${item.description} <br>
</c:forEach>
</body>
</html>
