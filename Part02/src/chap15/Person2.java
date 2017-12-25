package chap15;

public class Person2 implements Comparable<Person2> {
	public String name;
	public int age;
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(Person2 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
