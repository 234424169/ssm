
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
    <form:form id="form" method="post" modelAttribute="Product">
    <form:label path="productcode">产品代码：</form:label>
    <form:input path="productcode" />
    <form:label path="productname">产品名称：</form:label>
    <form:input path="productname" />
    <form:label path="appminversion">APP最低版本：</form:label>
    <form:input path="appminversion" />
    <form:label path="isonline">上线情况：</form:label>
    <form:select path="isonline">
        <form:option value="1">已上线</form:option>
        <form:option value="0">未上线</form:option>
    </form:select>
    <form:label path="isallarea">区域情况：</form:label>
    <form:select path="isallarea">
        <form:option value="1">通用产品</form:option>
        <form:option value="0">专用地区产品</form:option>
    </form:select>
    <form:label path="priority">优先级：</form:label>
        <form:select path="priority">
            <form:option value="1">1</form:option>
            <form:option value="2">2</form:option>
            <form:option value="3">3</form:option>
            <form:option value="4">4</form:option>
            <form:option value="5">5</form:option>
            <form:option value="6">6</form:option>
            <form:option value="7">7</form:option>
            <form:option value="8">8</form:option>
            <form:option value="9">9</form:option>
        </form:select>
    <button type="submit">添加</button>
    <button type="reset">重置</button>
    <c:out value="${result}"></c:out>
    </form:form>
</body>
</html>





