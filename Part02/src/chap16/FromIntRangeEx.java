package chap16;

import java.util.stream.IntStream;

public class FromIntRangeEx {
	public static int sum;
	
	public static void main(String[] args) {
//		int sum = 0;
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a->sum+=a);
		
		System.out.println(sum);
			

	}

}
