<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="user/userAction_login" method="post">
  用户名：<input type="text" name="username">
  <br>
  密码：<input type="text" name="pwd">
  <br>
     <input type="submit" value="提交">
</form>
<br>
<a href="user/ognlAction_test_1">欢迎访问ognl表达式~</a>
<br>
<br>
<s:form action="user/sTagAction_test_1" method="post">

  <s:textfield label="姓名" name="cus.cusnames"></s:textfield>
  <s:textfield label="工资" name="cus.sal"></s:textfield>
  <s:textfield label="用户名" name="username"></s:textfield>
  <s:textfield label="密码" name="pwd"></s:textfield>
  <s:select label="城市" list="#{'1001':'北京','1002':'天津'}" name="city" listKey="key" listValue="value"></s:select>
  <s:radio label="性别" list="#{1:'男',0:'女' }" name="sex" listKey="key" listValue="value" value="1"></s:radio>
  <s:checkboxlist label="爱好" list="#{1:'阅读',2:'唱歌',3:'舞蹈'}" name="hobbys" value="{1,2,3}"  listKey="key" listValue="value"></s:checkboxlist>
  <s:submit value="提交">
  </s:submit>
</s:form>

<br>
---文件上传---<br>
<form action="upload/uploadAction_upload" method="post" enctype="multipart/form-data">
文件描述：<textarea rows="10" cols="20" name="desc"></textarea>
<br>
<input type="file" name="myfile">
<input type="submit" value="上传">
</form>

</body>
</html>