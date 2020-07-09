package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		/*
		 * name : 애쉬
		 * power : 30
		 * defense : 50
		 * level :10
		 * speed : 300
		 */
		Map<String, Object> map = new HashMap<>();
		map.put("name", "애쉬");
		map.put("power", 30);
		map.put("defense", 50);
		map.put("level", 10);
		map.put("speed", 300);
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+" : "+map.get(key));
		}
	}
}
