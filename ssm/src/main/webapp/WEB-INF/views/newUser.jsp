
<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2016/8/24
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
    <form:form id="form" method="post"
           modelAttribute="validUserBean">
    <form:label path="name">用户名：</form:label>
    <form:input path="name" />
    <form:errors path="name" />
    <form:label path="id">序号：</form:label>
    <form:input path="id" />
    <form:errors path="id" />
    <button type="submit">添加</button>
    <button type="reset">重置</button>
    <c:out value="${show}"></c:out>
    </form:form>
</body>
</html>





