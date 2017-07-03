package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import common.DBConn2;

public class BoardDAO {
	Connection con;
	public void setConnection() throws ClassNotFoundException, SQLException{
		con = DBConn2.getCon();
	}
	
	public boolean insertBoard() throws SQLException{
		String sql = "insert into board(title, content, writer, reg_Date)values('게시판제목3', '게시판내용3', 5,now())";
		Statement st = con.createStatement();
		int result = st.executeUpdate(sql);
		if(result==1){
			return true;
		}
		return false;
	}
	public boolean updateBoard() throws SQLException{
		String sql = "update board set title='으하하하하' where num='1'";
		Statement st = con.createStatement();
		int result = st.executeUpdate(sql);
		if(result==1){
			st.close();
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		BoardDAO bdao = new BoardDAO();
		try {
			bdao.setConnection();
			bdao.insertBoard();
			bdao.updateBoard();
			bdao.con.commit();
		}catch(ClassNotFoundException | SQLException e) {
			try{
				bdao.con.rollback();
				System.out.println("뭔지 몰라서 롤백했습니다.");
			}catch (SQLException e1){
				e1.printStackTrace();
			}
				e.printStackTrace();
			
		}
	}
}
