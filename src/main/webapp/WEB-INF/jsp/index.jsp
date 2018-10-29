<%--
  ~ Copyright (c) Sergei Visotsky, 2018
  --%>

<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="m" uri="http://localhost:8080/tags" %>
<html>
<head>
    <title>Custom JSP tags</title>
</head>
<body>
<m:title>Tag creation project</m:title>
<br/>
Current date and time: <m:today/>

<h3>Number format example: </h3>
<m:formatNumber number="100050.574" format="#,###.00"/>
<br/>
<m:hello/>
</body>
</html>