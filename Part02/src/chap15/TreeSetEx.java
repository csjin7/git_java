package chap15;

import java.util.TreeSet;

public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(new Integer(80));
		
		Integer score = null;
		
		score = scores.first();
		System.out.println("first() : "  + score); 
		
		score = scores.last();
		System.out.println("last() : "  + score);

		score = scores.lower(87);
		System.out.println("lower(87) : "  + score);
		
		score = scores.higher(95);
		System.out.println("higher(95) : "  + score);
		
		score = scores.higher(new Integer(95));
		System.out.println("higher(Integer(95)) : "  + score);
		
		
		score = scores.floor(95);
		System.out.println("floor(95) : "  + score);
		
		score = scores.ceiling(85);
		System.out.println("ceiling(95) : "  + score);

		while (!scores.isEmpty()) {
			//score = scores.pollFirst();
			//System.out.println(" pollfirst로 가져온 값 : " + score + " 남은 트리셋 갯수  : " + scores.size());
			
			score = scores.pollLast();
			System.out.println(" pollLast로 가져온 값 : " + score + " 남은 트리셋 갯수  : " + scores.size());
		}
	}

}
