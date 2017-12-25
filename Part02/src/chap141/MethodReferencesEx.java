package chap141;

import java.util.function.IntBinaryOperator;

public class MethodReferencesEx {

	public static void main(String[] args) {
		IntBinaryOperator operator;
		
		operator = (x, y)->Calculator.staticMethod(x, y);
		System.out.println("결과 1 : " + operator.applyAsInt(1, 2));
		
		operator = Calculator::staticMethod;
		System.out.println("결과 2 : " + operator.applyAsInt(3, 4));
		
		Calculator calc = new Calculator();
		operator = (x,y)->calc.instanceMethod(x, y);
		System.out.println("결과 3 : " + operator.applyAsInt(5, 6));
		
		operator = calc::instanceMethod;
		System.out.println("결과 4 : " + operator.applyAsInt(7, 8 ));

	}

}
