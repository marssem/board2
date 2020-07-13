package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

import test.Connector;

public class MemberDAO {
	Connection con;
	public int insertMember(Map<String,String> map) {
		
		String sql = "insert into member(num, name, id, pwd, joindate, etc)"+
				"values(seq_member_num.nextval, ?, ?, ?, sysdate, ?)";
			con = Connector.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, map.get("name"));
			ps.setString(2, map.get("id"));
			ps.setString(3, map.get("pwd"));
			ps.setString(4, map.get("etc"));
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			Connector.close();
		}
		
		System.out.println(map);
		return 0;
	}
	
}
