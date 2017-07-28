/**
 * 
 */
var Ajaxutil = function a(url, arrParams, method, aSync){
	var url = "./userLogin.login";
	var method = "get";
	var params = "?action=LOGIN%id=" + encodeURIComponent(userid);
	var sync = true;
	xmlHttpObj.onreadystatechange=function(){
		if(xnlHttpObj.readyState==4 && xmlHttpObj.status==200){
			var result = decodeURIComponent(xmlHttpObj.responseText);
			if(result == "success"){
				location.href = "../user/welcome.jsp"
			}else{
				alert(result);
			}
		}
	}
	xmlHttpObj.open(method, url+params, sync);
	if(method=="get"){
		xmlHttpObj.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
	}
	xmlHttpObj.send(params);
}