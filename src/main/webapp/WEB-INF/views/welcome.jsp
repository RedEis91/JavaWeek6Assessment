<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="resources/css/style.css" rel="stylesheet"/>
    <title>Welcome to GC COFFEE! (welcome.jsp)</title>
</head>
<body>
<h1>Welcome!</h1>
<br>
<span>${message}</span> <br>
<br>
<br>

<form action="receipt" method="post">
What order number do you want to check on? <br>
    <input type="number" name="ordernumber">
    <input type="submit" name="checkorder" value="Check Order">
</form>
</body>
</html>