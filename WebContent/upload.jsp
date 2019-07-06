<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="cn.edu.imnu.text.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>图片上传</title>
</head>
<body>
	<h1>请上传您的图片</h1>
	<% if(application.getAttribute("count")==null)
			{
			    application.setAttribute("count",new Integer(0));   
			}   
		Integer count=(Integer)application.getAttribute("count"); 
		application.setAttribute("count",new Integer(count.intValue()+1));   
		count=(Integer)application.getAttribute("count");
		%>
	<form method="post" action="UploadServlet?count=<%=count %>"
		enctype="multipart/form-data">
		<input type="hidden" name="choose" value="one">
		<dl>
			<dt style="float:left">选择第<%=count%>个文件:</dt>
			<dd>
			<input type="file" name="uploadFile" />
			</dd>
			<br/>
			<input type="submit" value="添加" />
		</dl>
	</form>
	<a href="message.jsp?count=<%=count %>">提交</a>
</body>
</html>