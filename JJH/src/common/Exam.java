package common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam {
	
		public boolean insertUser(){
		try{
			Connection con = DBConn2.getCon();
			String sql = "delete user where num=" + num;
			PreparedStatement prestmt = con.prepareStatement(sql);
			int result = prestmt.executeUpdate();
			DBConn2.closeCon();
			if(result==1){
				return true;
			}
	}catch(SQLException | ClassNotFoundException e){
		e.printStackTrace();
	}return false;
}
	public static void main(String[] args){
		Exam e = new Exam();
		List<String> userList = e.getUserIDLists("홍길동");
		System.out.println(userList);
	}


}