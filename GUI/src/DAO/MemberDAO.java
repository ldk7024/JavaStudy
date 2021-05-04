package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import VO.MemberVO;

public class MemberDAO {

	// [회원관리]
	// joinInsert => 반환타입 int,
	// 매개인자 (String id, String pw, String name, String gender, String hobby)

	// Memberinfo테이블에 매개인자로 넣어준 값 추가.

	Scanner sc = new Scanner(System.in);

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;

	MemberVO vo = null;
	String sql = "";
	int cnt = 0;

	public void getConn() {
		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String dbid = "hr";
			String dbpw = "hr";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, dbid, dbpw);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void close() {
		try {
			if( rs != null ) {
				rs.close();
			}
			if( psmt != null ) {
				psmt.close();
			}
			if( conn != null ) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public int joinInsert(String id, String pw, String name, String gender, String hobby) {
		try {
			getConn();

			sql = "INSERT INTO memberinfo values ( ?, ?, ?, ?, ? )";
			psmt = conn.prepareStatement(sql);

			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setString(4, gender);
			psmt.setString(5, hobby);

			cnt = psmt.executeUpdate();

		} catch (Exception e) {
			System.out.println("try문에 에러가 발생했습니다.");
			e.printStackTrace();
		}

		return cnt;

	}

	public MemberVO loginSelect(String getId, String getPw) {
		try {
			getConn();

			sql = "SELECT * FROM memberinfo WHERE id = ? AND pw = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, getId);
			psmt.setString(2, getPw);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				String gender = rs.getString(4);
				String hobby = rs.getString(5);

				vo = new MemberVO(id, pw, name, gender, hobby);
			}

		} catch (Exception e) {
			System.out.println("에러발생!");
			e.printStackTrace();
		}

		return vo;

	}

	
	
	public ArrayList<MemberVO> allSelect() {
		ArrayList<MemberVO> al = new ArrayList<MemberVO>();

		getConn();
		String sql = "select * from memberinfo";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				String selId = rs.getString(1);
				String selPw = rs.getString(2);
				String selName = rs.getString(3);
				String selGender = rs.getString(4);
				String selHobby = rs.getString(5);
				MemberVO vo = new MemberVO(selId, selPw, selName, selGender, selHobby);
				al.add(vo);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// try문에서 예외상황이 발생하던지 하지 않던지 무조건 실행하는 부분
			close();
		}
		return al;
	}

	public boolean delete(String id) {
	      // TODO Auto-generated method stub
	      boolean result = false;
	      getConn();
	      String sql = "delete from memberinfo where id=?";
	      try {
	         psmt = conn.prepareStatement(sql);
	         psmt.setString(1, id);

	         int cnt = psmt.executeUpdate();
	         
	         if(cnt > 0) {
	            result = true;
	         }else {
	            result = false;
	         }
	      } catch (SQLException e) {
	         // TODO Auto-generated catch block
	         e.printStackTrace();
	      }finally {
	         close();
	      }      
	      return result;
	   }
	
	
}
