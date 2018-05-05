<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
用户名：${requestScope.username }<br>
密码：${requestScope.pwd }
<br>
密码：<s:property value="%{pwd}"/>---
<br>

用户名：<s:property value="#request.username"/>---<s:property value="username"/><br>
密码：<s:property value="#request.pwd"/>---<s:property value="pwd"/><br>
------构建数组--------<br>
<s:iterator value="{'a','b','c'}" var="i"  status="a">
 ${a.count }:<s:property  value="#i"/>---${i }<br>
</s:iterator>
------map集合-------<br>
<s:iterator value="#{'a':'aa','b':'bb','c':'cc'}" status="a">
${a.count }:<s:property value="key"/>:<s:property value="value"/><br>
</s:iterator>
------list集合-------<br>
<s:iterator value="list" status="a"  var="e">
${a.count }----${e.cusnames }:${e.sal }<br>

</s:iterator>

------list集合2-------<br>
<s:iterator value="list" status="a"  var="e">
<s:property value="#a.count"/>----<s:property value="#e.cusnames"/>--<s:property value="#e.sal"/>
<s:if test="#e.sal>0&&#e.sal<=1000">E</s:if>
<s:elseif test="#e.sal>1001&&#e.sal<=2000">D</s:elseif>
<s:elseif test="#e.sal>2001&&#e.sal<=3000">C</s:elseif>
<s:elseif test="#e.sal>3001&&#e.sal<5000">B</s:elseif>
<s:else>A</s:else>
<br>
</s:iterator>

</body>
</html>