package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestClone {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			int a = it.next();
			System.out.println(a);
		}
	}
}
