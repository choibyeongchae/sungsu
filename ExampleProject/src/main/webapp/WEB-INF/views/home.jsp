<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<title>Home</title>
<script src="https://code.jquery.com/jquery-3.4.1.js"></script>
<script type="text/javascript">

	$(function() {
		/* var str = "";
		<c:forEach items="${testList}" var = "item1">
			str += "<tr>";
			str += "<td>"+'${item1.name}'+"</td>&nbsp;";
			str += "<td>"+'${item1.gender}'+"</td>&nbsp;";
			str += "<td>"+'${item1.email}'+"</td>";
			str += "</tr>";
		</c:forEach>
		
		$("table").append(str); */
		getList();
		
	})
	
	function getList() {
		//ajax -> success(data) { loop......... $("table").append(str);} 
	}
	
	
</script>

</head>
<body>
	<table>

	</table>


</body>
</html>
