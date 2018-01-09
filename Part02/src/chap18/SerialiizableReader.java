package chap18;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialiizableReader {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("c:/Temp/Object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		
		System.out.println(v.field);
		System.out.println(v.field2.field1);
		System.out.println(v.field3);
		System.out.println(v.field4);
		
		

	}

}
