package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionEx {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("강가딘", 90),
				new Student("무수리", 92)	);

		Stream<Student> stream = list.stream();
		
		for (Student s : list) {
			System.out.println(s.getName() + " : " + s.getScore());
		}
		
		stream.forEach( s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + " : " + score); 
		});
		
	}

}
