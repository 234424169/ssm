
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
    <title>增加产品</title>
</head>
<body>
    <form:form id="form" method="post" modelAttribute="area">
    <form:label path="areacode">地区代码：</form:label>
    <form:input path="areacode" />

    <button type="submit">查找</button>

    </form:form>
</body>
</html>





