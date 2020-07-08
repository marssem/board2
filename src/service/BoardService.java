package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test.Connector;

public class BoardService {

	public List<Map<String,Object>> getBoardList(){
		List<Map<String,Object>> boardList = new ArrayList<>();
		Connection con ;
		try {//여기서 try catch를 사용했기에 오류가 나면 빈 화면이 나온다. new ArrayList가 빈 화면은 보여준다.
				con = Connector.getConnection();
				String sql = "select num, title, content, creusr from board";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery(); //rs가 메타 데이터와 로우 데이터를 모두 가져온다.
				while(rs.next()) {//rs가 더이상 내려갈 곳이 없어서 false를 내놓을 때까지 
					Map<String,Object> map = new HashMap<>();
					map.put("num",rs.getInt("num"));
					map.put("title", rs.getString("title"));
					map.put("content", rs.getString("content"));
					map.put("creusr", rs.getString("creusr"));
					boardList.add(map);
								}
		}catch(Exception e) {
			
		}finally {
			Connector.close();
		}
		return boardList;
	}
	
	public int insertBoard(Map<String,Object> board) {
		String sql = "insert into board(num, title, content, credat, cretim, creusr)\r\n" + 
				"values(\r\n" + 
				"(select nvl(max(num),0)+1 from board),\r\n" + 
				"?,?,to_char(sysdate, 'YYYYMMDD'),to_char(sysdate, 'HH24MiSS'),?)";
		Connection con = null;
		try {
			con = Connector.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, board.get("title").toString());
			ps.setString(2, board.get("content").toString());
			ps.setString(3, board.get("creusr").toString());
			return ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			Connector.close();
		}
		return 0;
		
	}
}
