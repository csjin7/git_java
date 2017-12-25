package chap15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("java");
		list.add("jdbc");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("myBatis");
		
		System.out.println("총 객체수 : " + list.size());
		System.out.println(); 
		
		System.out.println(list.get(2));
		System.out.println();
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
	
		for (String string : list) {	
			System.out.println(string);
		}
		
		
		list.remove(2);
		list.remove(2);
		list.remove("myBatis");
		
		System.out.println();
		
		for (String string : list) {	
			System.out.println(string);
		}

		
		List<String> listAsList = Arrays.asList("a", "b", "c");
		
		for (String string : listAsList) {
			System.out.println(string);
		}
		
		
		List<Integer> listAsList2 = Arrays.asList(1, 2, 3, 4, 5);
		
		for (int string : listAsList2) {
			System.out.println(string);
		}
		
		

	}

}
