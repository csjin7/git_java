package chap19;

import java.nio.ByteBuffer;

public class BufferSizeEx {

	public static void main(String[] args) {
		ByteBuffer directBuffer = ByteBuffer.allocateDirect(1500 * 1024 * 1024);
		System.out.println("다이렉트 버퍼가 생성되었습니다.");

		ByteBuffer nonDirectBuffer = ByteBuffer.allocate(2000 * 1024 * 1024);
		
		System.out.println("논다이렉트 버퍼가 생성되었습니다.");
	}

}
