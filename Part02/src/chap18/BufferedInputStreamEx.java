package chap18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamEx {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("c:/Temp/test.pdf");
		//start = System.nanoTime();
		start = System.currentTimeMillis();
		
		while(fis1.read() != -1) {
		}
		
		//end = System.nanoTime();
		end = System.currentTimeMillis();
		
		System.out.println("사용하지 않을때 : " + (end-start) + "ms");
		fis1.close();
		
		
		FileInputStream fis2 = new FileInputStream("c:/Temp/test.pdf");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		
		start = System.currentTimeMillis();
		
		while(bis.read() != -1) {}
		
		end = System.currentTimeMillis();
		
		System.out.println("Buffered Stream 사용시 : " + (end-start) + "ms");
		fis2.close();
		bis.close();
	}

}
