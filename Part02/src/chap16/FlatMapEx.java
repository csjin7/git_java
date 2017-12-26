package chap16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapEx {

	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList(
			"java8 lamdba", "stream mapping");
				
		inputList1.stream()
		.flatMap(data->Arrays.stream(data.split(" ")))
		.forEach(System.out::println);
		
		System.out.println();
		
		List<String> inputList2 = Arrays.asList(
			"10, 20, 30", "40, 50 ,60");
		inputList2.stream()
		.flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
				System.out.println("[" + strArr[i] +"]");
			} 
			return Arrays.stream(intArr);
		})
		.forEach(num->System.out.println(num));
		System.out.println();
		
		List<Integer> iList = Arrays.asList(1, 2, 3, 4, 5);
		iList.stream()
		.mapToInt(d->d)
		.flatMap(i->{
				int[] intArray = {1,2,3};
				IntStream intStream = Arrays.stream(intArray);
				System.out.println();
				return intStream; })
		.boxed()
		.forEach(i->System.out.println(i.intValue()));
		
		//System.out.println(Integer.parseInt("50 0"));

	}

}
