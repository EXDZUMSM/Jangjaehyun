<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="com.test.common.DBConn2"%>
<%@ page import="com.google.gson.*"%>
<%@ page import="java.util.*"%>
<%@ page import="java.io.*"%>
<%@ page import="com.test.dto.Cal"%>

<%
int a = 5;
String s = "str";

if((a==5 || a==3) && s.equals("str")){
	System.out.println("맞다!!");
}
	 Gson g = new Gson();
	Connection con = null;
	PreparedStatement ps = null;
	ArrayList<Map<String, String>> vendorList = new ArrayList<Map<String, String>>();
	ArrayList<Map<String, String>>goodsList = new ArrayList<Map<String, String>>();
	try{
		con = DBConn2.getCon();
		String sql = "select vinum, viname from VENDOR_INFO;";
		ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while(rs.next()){
			Map<String, String>rhm = new HashMap<String, String>();
			rhm.put("vinum", rs.getString("vinum"));
			rhm.put("viname", rs.getString("viname"));
			vendorList.add(rhm);
		}
		sql = "select gi.ginum, gi.giname, gi.gidesc, vi.vinum, vi.viname from goods_info as gi, vendor_info as vi where gi.vinum=vi.vinum";
		ps = con.prepareStatement(sql);
		rs = ps.executeQuery();
		while(rs.next()){
			Map<String, String>rhm = new HashMap<String, String>();
			rhm.put("ginum", rs.getString("ginum"));
			rhm.put("giname", rs.getString("giname"));
			rhm.put("gidesc", rs.getString("gidesc"));
			rhm.put("vinum", rs.getString("vinum"));
			rhm.put("viname", rs.getString("viname"));
			goodsList.add(rhm);
		}
	}catch(Exception e){
		System.out.println(e);
	}finally{
		if(ps!=null){
			ps.close();
			ps = null;
		}
		DBConn2.closeCon();
	}

HashMap resultHm = new HashMap();
resultHm.put("vendorList", vendorList);
resultHm.put("goodsList", goodsList);

String json = g.toJson(resultHm);
System.out.println(json);
out.print(json);
	%>