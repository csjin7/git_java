package chap18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		int data = -1;
		long start = 0;
		long end = 0;
		
		fis = new FileInputStream("C:/Temp/test.pdf");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/copy_test1.pdf");
		start = System.currentTimeMillis();
		
		while( (data = bis.read()) != -1) {
		//while( (data = fis.read()) != -1) {
			fos.write(data);
		}
		fos.flush();
		end = System.currentTimeMillis();
		fos.close();
		bis.close();
		fis.close();
		System.out.println("FileOutputStream 처리 속도 : " + (end-start) + "MS");
				
		
		fis = new FileInputStream("C:/Temp/test.pdf");
		bis = new BufferedInputStream(fis);
		fos = new FileOutputStream("C:/Temp/copy_test1.pdf");
		bos = new BufferedOutputStream(fos);
		
		start = System.currentTimeMillis();
		while((data = bis.read()) != -1) {
			bos.write(data);
		}
		
		bos.flush();
		end = System.currentTimeMillis();
		bos.close();
		fos.close();
		bis.close();
		fis.close();
		
		System.out.println("BufferedOutputStream 처리 속도 : " + (end-start) + "MS");

	}

}
