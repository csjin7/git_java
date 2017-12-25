package chap141;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx1 {
	private static List<Student> list = Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("강가딘", 95, 93)
			);

	public static void printString( Function<Student, String> function) {
		for (Student student : list) {
			System.out.print(function.apply(student) + "  ") ;
		} 
		System.out.println();
	}
	
	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.print(function.applyAsInt(student) + "  ");
		}
		System.out.println();		
	}
	
	public static double avg( ToIntFunction<Student> function) {
		int sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
		}
		
		double avg = (double) sum / list.size();
		return avg;
	}
	
	public static void main(String[] args) {
		System.out.println("학생이름 : ");
		printString(t->t.getName());
		
		System.out.println("영어 성적 : ");
		printInt(t->t.getEnglishScore());
		
		System.out.println("수학 성적 : ");
		printInt(t->t.getMathScore());
		
		
		for (Student student : list) {
			System.out.print(student.getName() + "  ") ;
			System.out.print(student.getEnglishScore() + "  ") ;
			System.out.print(student.getMathScore() + "  ") ;
		}
		System.out.println();
				
		double englishAvg = avg(s->s.getEnglishScore());
		System.out.println("영어 평균 점수 : " + englishAvg);
		
		double mathAvg = avg(z->z.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
		
	}

}
