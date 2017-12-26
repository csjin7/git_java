package chap16;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
//		double avg = list.stream()
//			.mapToInt(Integer :: intValue)
//			.average()
//			.getAsDouble();
		
		OptionalDouble opDblAvg = list.stream()
			.mapToInt(Integer :: intValue)
			.average();
		
		if(opDblAvg.isPresent()) {
			System.out.println(" isPresent() 평균 :  " + opDblAvg.getAsDouble() );
		} else {
			System.out.println(" !isPresent() 평균 : 0.0 " );
		}
		
		double avg = list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.orElse(0.0);
		
		System.out.println(" orElse() 평균 :  " + avg );

		
		list.stream()
			.mapToInt(Integer :: intValue)
			.average()
			.ifPresent(a->System.out.println(" .ifPresent a->print(a)  " + a));
			
		

	}

}
