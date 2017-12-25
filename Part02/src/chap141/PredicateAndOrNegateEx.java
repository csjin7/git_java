package chap141;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		IntPredicate predicateA = a -> a%2 == 0;
		IntPredicate predicateB = a -> a%3 == 0;
		
		IntPredicate predicateAB;
		boolean result;
		
		predicateAB = predicateA.and(predicateB);
		result = predicateAB.test(9);
		System.out.println("9는 2와(and) 3의 배수 입니까? ㅣ: " + result);
		
		predicateAB = predicateA.or(predicateB) ;
		result = predicateAB.test(9);
		System.out.println("9는 2 또는(or) 3의 배수 입니까? ㅣ: " + result);
				
		predicateAB = predicateA.negate();
		result = predicateAB.test(9);
		System.out.println("9는 홀수(2로 나눠지지 않는 값) 입니까? ㅣ: " + result);
				
		predicateAB = predicateB.negate();
		result = predicateAB.test(9);
		System.out.println("9는 (3로 나눠지지 않는 값) 입니까? ㅣ: " + result);

	}

}
