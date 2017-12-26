package chap16;

import java.util.Arrays;
import java.util.List;

public class MapEx {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 40), new Student("윤똘", 20),new Student("뭉치", 10) );

		studentList.stream()
		.mapToInt(Student::getScore)
		.forEach(System.out::println);
	}

}
