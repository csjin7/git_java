package chap16;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceEx {

	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("강가딘", 10), new Student("뭉치", 100),new Student("뭉치", 100)	);
		
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		
		
		System.out.println("평균 점수 : " + avg);
				

	}

}
