<%--
  Created by IntelliJ IDEA.
  User: jason
  Date: 2021/6/28
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var stuObj = ${requestScope.key};  // 从request作用域对象得到服务端提供学生对象
        window.alert("学员编号 "+stuObj.sid+" 学员姓名 "+stuObj.sname);
    </script>
</head>
<body>

</body>
</html>
