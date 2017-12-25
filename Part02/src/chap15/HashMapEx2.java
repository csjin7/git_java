package chap15;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍발정"), 91);
		map.put(new Student(1, "홍발정"), 91);
		
		System.out.println(map.size());

	}

}
