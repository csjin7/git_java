package chap141;

import java.util.function.*;

public class ConsumerEx {

	public static void main(String[] args) {
		Consumer<String> consumer = t->System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u)->System.out.println(t + u);
		biConsumer.accept("java", "8888");
		
		DoubleConsumer doubleConsumer = d->System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objIntConsumer = (t, i)->System.out.println(t + i);
		objIntConsumer.accept("java", 8);
	}

}
