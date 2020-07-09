package test;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
	
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<String,Integer>();
		m.put("age", 10);
		
		int a=0;
		for(int i=m.get("age");i<=50;i++) {
			int sum =m.get("age")+i;
			m.put("age",sum);
		}
		System.out.println(m);
	}

}
