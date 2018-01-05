package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Temp/file1.txt");
			int data;
			while( (data = fis.read()) != -1) {
				System.out.write(data);
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
