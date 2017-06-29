package big;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserDao {
	public List<HashMap> doSelect(String sql) {
		List<HashMap> userlist = new ArrayList<HashMap>();
		try{
			Connection con = Picture2.getCon();
			PreparedStatement prestmt = con.prepareStatement(sql);
			ResultSet rs = prestmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			while (rs.next()) {
				HashMap hm = new HashMap();
				int colCount = rsmd.getColumnCount();
				for(int i=1;i<colCount;i++){
					String colName = rsmd.getColumnName(i);
					hm.put(colName, rs.getString(colName));
				}
				userlist.add(hm);
			}
			Picture2.closeCon();
			return userlist;
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void main(String[] args){
		UserDao ud = new UserDao();
		String sql = "select num, id, pwd, name, age from user";
		List<HashMap> userList = ud.doSelect(sql);
		System.out.println(" = 유저 리스트 = ");
		for(HashMap hm : userList){
			System.out.println(hm);
		}
		sql = "select num, id, pwd, name, age from user_info";
		userList = ud.doSelect(sql);
		System.out.println("= 유저 인포리스트 = ");
		for(HashMap hm : userList){
			System.out.println(hm);
		}
	}
}
