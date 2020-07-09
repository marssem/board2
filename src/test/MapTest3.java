package test;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

public class MapTest3 {
	public static void main(String[] args) {
		Connection con = Connector.getConnection();
		Map<Object,Object> map = new HashMap<>();
		map.put("String", "tt");
		map.put("int", 123);
		map.put("cahr", 'a');
		map.put("double", 1.2d);
		map.put("coffe", "bin");
		map.put("conn", con);
		Map<Object, Connection> co = new HashMap<>();
		co.put("connection", con);
		
		
	}
}
