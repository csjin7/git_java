package chap15;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx3 {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("f", 59);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 10);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);		
		
		System.out.println("rangeMap c ture f false");
		NavigableMap<String , Integer> rangeMap = treeMap.subMap("c", true, "f", false);
		for (Map.Entry<String, Integer> entry : rangeMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		System.out.println();
		
		System.out.println("headMap ever false ");		
		NavigableMap<String, Integer> headMap = treeMap.headMap("ever", false);
		for (Map.Entry<String, Integer> entry : headMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		} 
		System.out.println();
		
		System.out.println("tailMap ever true");
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("ever", true);
		for (Map.Entry<String, Integer> entry : tailMap.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
				
	}
}
