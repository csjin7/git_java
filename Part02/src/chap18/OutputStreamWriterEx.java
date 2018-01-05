package chap18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Writer_file.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		
		String data = " 바이트 출력 스트림을 문자 출력 스트림으로 변환  ";
		writer.write(data);
		
		writer.flush();
		writer.close();
		
		System.out.println("파일 저장이 완료 되었습니다. ");

	}

}
