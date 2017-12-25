package chap15;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		treeSet.add(new Person("강가딘", 45));
		treeSet.add(new Person("윤똘띠", 19));
		treeSet.add(new Person("개보수", 66));

		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " :: " + person.age);
			
		}

		System.out.println();
		
		TreeSet<Person2> treeSet2 = new TreeSet<>();
		treeSet2.add(new Person2("강가딘", 45));
		treeSet2.add(new Person2("윤똘띠", 19));
		treeSet2.add(new Person2("개보수", 66));

		Iterator<Person2> iterator2 = treeSet2.iterator();
		while (iterator2.hasNext()) {
			Person2 person2 = iterator2.next();
			System.out.println(person2.name + " :: " + person2.age);
			
		}

	}

}
