<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 6/24/2018
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span style="color:green"> Hello </span>

<form  method="post" action="home">
    <label for="color">
        <select name="color" id="color">
            <option value="red">Red</option>
            <option value="black">Black</option>
            <option value="blue">Blue</option>
        </select>
    </label>
    <input type="submit" value="Color Send">
</form>

</body>
</html>
