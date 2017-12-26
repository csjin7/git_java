package chap16;

//import java.time.Instant;
//import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList(
				"강가딘","엄홍식","조경아","이길명","백남용","윤돼지" );
		long startTime;
		long endTime;	
		
		
		//Instant instant1 = Instant.now();
		
		startTime = System.nanoTime();
		Stream<String> stream = list.stream();
		stream.forEach(ParallelEx::print);
		endTime = System.nanoTime();
		System.out.println(" 걸린 시간 : " + (endTime - startTime) + " ns");
		//Instant instant2 = Instant.now();
		
		//System.out.println(instant1.until(instant2, ChronoUnit.NANOS));
		
		//instant1 = Instant.now();
		startTime = System.nanoTime();
		Stream<String> parallelStream = list.parallelStream();
		parallelStream.forEach(ParallelEx::print);
		endTime = System.nanoTime();
		System.out.println(" 걸린 시간 : " + (endTime - startTime) + " ns");
		//instant2 = Instant.now();
		
		//System.out.println(instant1.until(instant2, ChronoUnit.NANOS));
	}
	
	public static void print(String str) {
		System.out.println(str + " : " + Thread.currentThread().getName());
	}

}
