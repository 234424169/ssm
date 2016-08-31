<%--
  Created by IntelliJ IDEA.
  User: chen
  Date: 2016/8/26
  Time: 16:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <button type="submit" onclick="SendJson">提交</button>
</head>
<body>

<SCRIPT language=JavaScript type=text/JavaScript>
    function SendJson()  {
        var data = {"productcode": "YNG", "productname": "邮你贷"};
        alert("test");
        $.ajax({
            type: 'post',
            url: 'json.action',
            cache: false,
            data: JSON.stringify(data),
            contentType: 'application/json',
            dataType: 'json',
            success: function (result) {
                alert(result[0].productcode);
                alert(JSON.stringify(result));
            },
        });
    }
        </SCRIPT>

</body>
</html>
