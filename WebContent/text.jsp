<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<dt style="float:left">银行账户：</dt>
<dd>123</dd>
<form name="demo" method="post">
<!--YOUR DATA AREA-->
<input type="button" value="添加" onclick="addAction()">
<input type="button" value="删除" onclick="deleteAction()">
<input type="button" value="保存" onclick="saveAction()">
<input type="button" value="查询" onclick="searchAction()">
</form>
 
<script type="text/javascript">
function addAction(){
    document.demo.action="D:\andriod\jre";
    document.demo.submit();
}
 
function deleteAction(){
    document.demo.action="your delete method url";
    document.demo.submit();
}
 
function saveAction(){
    document.demo.action="your add save url";
    document.demo.submit();
}
 
function searchAction(){
    document.demo.action="your serach method url";
    document.demo.submit();
}
</script>
</body>
</html>