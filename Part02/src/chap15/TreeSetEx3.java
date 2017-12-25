package chap15;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx3 {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("f");
		treeSet.add("ff");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("c-f 사이의 검색");
		
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);	
		for (String str : rangeSet) {
			System.out.print(str + "  ");
		}
		System.out.println();
		
		SortedSet<String> sortedSet = treeSet.subSet("c", "for");
		for (String str : sortedSet) {
			System.out.print(str + "  ");
		}
	}

}
