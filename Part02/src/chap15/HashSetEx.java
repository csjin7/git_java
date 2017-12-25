package chap15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		set.add("Java0");
		set.add("Java1");
		set.add("Java2");
		set.add("Java3");
		set.add("Java4");
		set.add("Java5");
		
		int size = set.size();
		System.out.println("size : " + size);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		set.remove("Java3");
		set.remove("Java4");
		
		System.out.println("size : " + set.size());
		
		iterator = set.iterator();

		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		if(!set.isEmpty()) { System.out.println("Set 값이  남아 있음.");}
		
		for (String string : set) {
			System.out.println(string);
		}		
		
		set.clear();
		
		if(set.isEmpty()) { System.out.println("Set 비었음.");}
		
	}

}
