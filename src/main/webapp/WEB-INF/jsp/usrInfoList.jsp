<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表</title>
</head>
<body>
Controller三种传值方式，注：JSP必须加 isELIgnored="false"
test: ${test} <br>
test1: ${test1} <br>
test2: ${test2} <br>
---------------读取数据库-----------<br>
<table>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${usrInfoList}" var="usrInfo">
    <tr>
        <td>${usrInfo.id}</td>
        <td>${usrInfo.name}</td>
        <td>${usrInfo.password}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>