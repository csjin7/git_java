package chap18;

import java.io.IOException;
import java.io.OutputStream;

public class SystemOutEx {

	public static void main(String[] args) throws Exception {
		OutputStream os = System.out;
		
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}

		os.write(10);

		for (byte b = 65; b < 123; b++) {
			os.write(b);
		}
		
		os.write(10);
		
		String hangul = "가나다라바마사";
		byte[] hangulBytes = hangul.getBytes();
		
		os.write(hangulBytes);
		
		os.flush();
		
	}

}
