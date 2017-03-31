<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 01.04.2017
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <table>
            <tr>
                <td> Посещений </td>
                <td><%=(request.getAttribute("current_count")== null ? "error" : request.getAttribute("current_count").toString()) %></td>
</tr>
</table>
</div>

</body>
</html>
