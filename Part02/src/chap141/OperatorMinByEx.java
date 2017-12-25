package chap141;

import java.util.function.BinaryOperator;

public class OperatorMinByEx {

	public static void main(String[] args) {
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
//		binaryOperator = BinaryOperator.minBy((f1, f2)->{
//			return Integer.compare(f1.price, f2.price);
//		});
		binaryOperator = 
				BinaryOperator.minBy((f1, f2)->Integer.compare(f1.price, f2.price));
		
		fruit = binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 5000) );
		System.out.println(fruit.name);
		
		binaryOperator =
				BinaryOperator.maxBy((f1, f2)->Integer.compare(f1.price, f2.price));
		fruit = binaryOperator.apply(new Fruit("멜로", 1000), new Fruit("포도", 2000));
		System.out.println(fruit.name);

	}

}
