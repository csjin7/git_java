package chap15;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(87,  "강가딘");
		scores.put(98,  "뭉치");
		scores.put(75,  "똘띠");
		scores.put(95,  "뚱띵이");
		scores.put(80,  "꼴통보수");
		
		Map.Entry<Integer, String> entry = null;
		
		NavigableMap <Integer, String> descendingMap = scores.descendingMap();
		Set<Map.Entry<Integer, String>> descendingEntrySet = descendingMap.entrySet();
		for (Map.Entry<Integer, String> entry2 : descendingEntrySet) {
			System.out.println(entry2.getKey() + " - " + entry2.getValue());
		}
		System.out.println();
		
		Set<Map.Entry<Integer, String>> ascendingEntrySet = descendingMap.descendingMap().entrySet();				
		for (Map.Entry<Integer, String> entry3 : ascendingEntrySet ) {
			System.out.println(entry3.getKey() + " - " + entry3.getValue());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		entry = scores.firstEntry();
		System.out.println("가장 낮은 점수  Key : " + entry.getKey() + " - Value : " + entry.getValue());
		
		entry = scores.lastEntry();
		System.out.println("가장 높은 점수  Key : " + entry.getKey() + " - Value : " + entry.getValue());
		
		entry = scores.lowerEntry(95);
		System.out.println("95보다 낮은 점수  Key : " + entry.getKey() + " - Value : " + entry.getValue());
		
		entry = scores.higherEntry(95);
		System.out.println("95보다 높은 점수  Key : " + entry.getKey() + " - Value : " + entry.getValue());
		
		entry = scores.floorEntry(95);
		System.out.println("95 또는 그보다 낮은 점수  Key : " + entry.getKey() + " - Value : " + entry.getValue());
		
		entry = scores.ceilingEntry(85);
		System.out.println("85 또는 그보다 높은 점수  Key : " + entry.getKey() + " - Value : " + entry.getValue());
		
		while (!scores.isEmpty()) {
			entry = scores.pollFirstEntry();
			//entry = scores.pollLastEntry();
			System.out.println(" Key:" + entry.getKey() + " - Value:" + entry.getValue() +
					"\t  남은 객체수 : " + scores.size());
		}
	}

}
