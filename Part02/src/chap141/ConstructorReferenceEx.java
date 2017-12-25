package chap141;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferenceEx {

	public static void main(String[] args) {
		Function<String, Member> function1 = Member::new;
		Member member1 = function1.apply("angel");
		System.out.println(member1.getName());
		
		BiFunction<String, String, Member> function2 = Member::new;
		Member member2 = function2.apply("강가딘", "kkang");
		System.out.println(member2.getName());
		
		Function<Member, Member> function3 = m->m;
		Member member3 = function3.apply(new Member("세개","thres",null));
		System.out.println(member3.getName());
		member3 = function3.apply(new Member("두개","two"));
		System.out.println(member3.getName());
		member3 = function3.apply(new Member("한개"));
		System.out.println(member3.getName());
		
		member3 = function3.apply(new Member());
		System.out.println(member3.getName());
		
	}

}
