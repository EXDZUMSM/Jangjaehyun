<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/common/header.jsp"%>

연산자 : <input type="text" id="op"/><input type="button" id="getCal" value="계산리스트호출"/>
<div id="result_div" class="container"></div>
<script>

var strut = {
		a : 1,
		b : function(){
			alert("123");
		}
}

$("#getCal").click(function(){
	var t = strut.b
	t();
	
});
</script>
</body>
</html>