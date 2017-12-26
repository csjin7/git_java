package chap16;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = { "강가딘", "가분수", "테스트"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a->System.out.print(a + ","));
		System.out.println();
		
		int[] intArray = { 1, 5, 3, 4, 2};
		//IntStream intStream = Arrays.stream(intArray).sorted();
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(i->System.out.println(i));
		
	}

}
