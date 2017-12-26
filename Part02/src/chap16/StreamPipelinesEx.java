package chap16;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesEx {

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
			new Member("강가딘", Member.MALE, 30),
			new Member("김나리", Member.FEMALE, 20),
			new Member("신용권", Member.MALE, 45),
			new Member("박수미", Member.FEMALE, 27)	);
		
		double avg = list.stream()
				.filter(m->m.getSex() == Member.MALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		int sum = list.stream()
				.filter(m->m.getSex() == Member.MALE)
				.mapToInt(Member::getAge)
				.sum();
				
		
		System.out.println("남자 평균 나이는 : " + avg + " 총 나이 합계는 : " + sum);
		

		 avg = list.stream()
				.filter(m->m.getSex() == Member.FEMALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		 sum = list.stream()
				.filter(m->m.getSex() == Member.FEMALE)
				.mapToInt(Member::getAge)
				.sum();
				
		
		System.out.println("여자 평균 나이는 : " + avg + " 총 나이 합계는 : " + sum);

		 avg = list.stream()
					.mapToInt(Member::getAge)
					.average()
					.getAsDouble();
			
			 sum = list.stream()
					.mapToInt(Member::getAge)
					.sum();
					
			
			System.out.println("전체 평"
					+ "균 나이는 : " + avg + " 총 나이 합계는 : " + sum);
		
	}

}
