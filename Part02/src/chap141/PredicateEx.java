package chap141;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, "남자"),
			new Student("김순희", 90, "여자"),
			new Student("김자바", 95, "남자"),
			new Student("박한나", 92, "여자")
			);
	
	public static double avg(Predicate<Student> predicate) {
		int count = 0, sum = 0;
		for (Student student : list) {
			if (predicate.test(student)) {
				count++;
				sum += student.getEnglishScore();	
			}
		}
		return (double) sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(s->s.getSex().equals("남자"));
		System.out.println("남자 영어 평균 점수 : " + maleAvg);
		
		double femaleAvg = avg(s->s.getSex().equals("여자"));
		System.out.println("남자 영어 평균 점수 : " + femaleAvg);
		
	}

}
