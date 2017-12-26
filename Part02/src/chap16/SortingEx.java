package chap16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class SortingEx {

	public static void main(String[] args) {
		IntStream intStream = Arrays.stream(new int[] {5, 3, 2, 1, 4 });
		
		intStream
		.sorted()
		.forEach(System.out::println);
		System.out.println("-----------------");
		
		List<Student> studentList = Arrays.asList(
			new Student("쌍둥이", 30), 
			new Student("꼴뚜기", 10),
			new Student("망둥어", 20)
		);
		
		studentList.stream()
		//.sorted()
		//.sorted( Comparator.naturalOrder() )
		.sorted((a,b)-> a.compareTo(b))
		.forEach(s->System.out.println(s.getScore()));
		System.out.println("-----------------");
		
		studentList.stream()
		//.sorted( Comparator.reverseOrder() )
		.sorted( (a,b)->b.compareTo(a) )
		.forEach(s->System.out.println(s.getScore()));
	}

}
