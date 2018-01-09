package chap18;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
	
}
