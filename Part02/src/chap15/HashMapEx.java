package chap15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("강가딘", 85);
		map.put("강가딘", 95);
		map.put("뮬란", 99);
		map.put("딘딘", 80);
		
		System.out.println(map.size());
		
		System.out.println("물란을 찾아라  - 점수는요 : " + map.get("뮬란"));
		
		Set<String> keySet = map.keySet();
		for (String string : keySet) {
			System.out.println("for each Key : '" + string + "'  값으로 겁색한 전체 목록 : " + map.get(string));
		}
		
		System.out.println("----------------");
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("for each Key : '" + str + "'  값으로 겁색한 전체 목록 : " + map.get(str));
		}
		
		map.remove("강가딘");
		System.out.println(map.size());
		map.put("강가딘", 85);
		System.out.println(map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entryMap = entryIterator.next();
			String key = entryMap.getKey();
			int value = entryMap.getValue();
			System.out.println("for each Key : '" + key + "'  키로 겁색한 값 : " + value);
		}
		
		System.out.println("----------------");
		for (Map.Entry<String, Integer> entryMap : entrySet) {
			String key = entryMap.getKey();
			int value = entryMap.getValue();
			System.out.println("for each Key : '" + key + "'  키로 겁색한 값 : " + value);
		}
			
		map.clear();
		System.out.println(map.size());
	}
}

