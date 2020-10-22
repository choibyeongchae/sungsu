<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">
$(function(){
	/*
	* javascript jsonArray create
	*/
	var list = new Array();
	for (var i = 0; i < 5; i++) {
		var testJson = new Object();
		testJson.name = "aaa"+i;
		testJson.id = "111@111.com"+i;
		testJson.pw = "111"+i;
		list.push(testJson);
	}
	
	var jsonArr = JSON.stringify(list);
	
	$.ajax({
		type : "POST",
		url : "./boardList", 
		dataType: "json",
		data : jsonArr,
		contentType : 'application/json',
		success : function(data) {
			$("table").append(data.str);
			
			// for (var i = 0; i < data.length; i++) { table }
		},
		error : function() {
			alert("데이터 호출이 실패하였습니다");
		}
	});
	
})
</script>
</head>
<body>
	<table>
	</table>
</body>
</html>