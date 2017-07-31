<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="exam01_ok.jsp">
<input type="text" name="test1" id="test1"/><br/>
<input type="text" name="test2" id="test2"/><br/>
<input type="text" name="test3" id="test3"/><br/>
<input type="text" name="test4" id="test4"/><br/>
<input type="text" name="test5" id="test5"/><br/>
<input type="text" name="test6" id="test6"/><br/>
<input type="text" name="test7" id="test7"/><br/>
<input type="text" name="test8" id="test8"/><br/>
<input type="text" name="test9" id="test9"/><br/>
<input type="text" name="test10" id="test10"/><br/>
<input type="button" value="값확인" onclick="doCheckValue()"/>
</form>
<script>

var AjaxUtil = function(p_url, params){
	this.params = params;
	
	getHttpXmlObj = function(){
		if(window.XMLHttpRequest){
	  		return new XMLHttpRequest();
	 	}else if(window.ActiveXObject){
	  		return new ActiveXObject("Microsoft.XMLHTTP");
	 	}
		alert("해당 브라우져가  Ajax를 지원하지 않습니다.");
	}
	this.xhr = getHttpXmlObj();
	var method = "get";
	var url = p_url;
	var aSync = true;
	this.xhr.onreadystatechange=function(){
   		if (this.readyState==4){
   			if(this.status==200){
	   			var result = decodeURIComponent(this.responseText);
	   			alert(result);
   			}
   		}
	}
	this.changeCallBack = function(func){
		this.xhr.onreadystatechange = func;
	}
   	this.xhr.open(method, url+this.params, aSync);
   	this.send = function(){
   		this.xhr.send.arguments = this;
   	   	this.xhr.send();
   	}
} 
function doCheckValue(){
	var name1 = document.getElementById("name1").value;
	var name2 = document.getElementById("name2").value;
	var name3 = document.getElementById("name3").value;
	var name4 = document.getElementById("name4").value;
	var name5 = document.getElementById("name5").value;
	var name6 = document.getElementById("name6").value;
	var name7 = document.getElementById("name7").value;
	var name8 = document.getElementById("name8").value;
	var name9 = document.getElementById("name9").value;
	var name10 = document.getElementById("name10").value;
	var params = ;
	var au = new AjaxUtil("보낼페이지", params);
	au.send();
}
</script>
</body>
</html>