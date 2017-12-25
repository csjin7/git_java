package chap141;

import java.util.function.Function;

public class FunctionAndThenEx {

	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = (m)->m.getAddress();
		functionB = (a)->a.getCity();
		
		functionAB = functionA.andThen(functionB);
		
		city = functionAB.apply(new Member("홍길동","hong", new Address("스페인","마드리드")));
		System.out.println("andThen 거주도시  : " + city);
		
		
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("강가딘","kang", new Address("스페인","산티아고")));
		System.out.println("compose 거주도시 : " + city);
		
		
		

	}

}
