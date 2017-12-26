package chap16;

import java.util.Arrays;
import java.util.List;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> names = Arrays.asList(
				"강철비","신과함께","신맨","강철비","신맨"
				);
		
		names.stream()
		.distinct()
		.forEach(n->System.out.println(n));
		
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n->n.startsWith("강"))
		.forEach(n->System.out.println(n));
		
		System.out.println();
		
		names.stream()
		.distinct()
		.filter(n->n.startsWith("신"))
		.forEach(n->System.out.println(n));
		
	}

}
