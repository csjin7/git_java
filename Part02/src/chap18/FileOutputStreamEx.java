package chap18;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) throws Exception {
//		String originFileName = "C:/Temp/file1.zip";
//		String targetFileName = "C:/Temp/copyfile1.zip";
		
		String originFileName = "D:\\A영화\\채비.mp4";
		String targetFileName = "D:\\A영화\\copy채비.mp4";
		
		
		FileInputStream fis = new FileInputStream(originFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		

		int readByteNo;
		byte[] readBytes = new byte[1024000];
		
		while ( (readByteNo = fis.read(readBytes)) != -1) {
			fos.write(readBytes, 0, readByteNo);
		}
		
		
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("복사가 잘 되었을까요???  ");
		
	}

}
