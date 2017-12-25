package chap16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamEx {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동", "강가딘","김자바");
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println();
		
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string =  iterator.next();
			System.out.println(string);
		}
		
		System.out.println();
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("--------------");
		Stream<String> stream = list.stream();
		stream.forEach( name -> System.out.println(name));
		
	}

}
