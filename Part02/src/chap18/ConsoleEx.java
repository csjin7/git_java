package chap18;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) {
		Console console = System.console();
		
		System.out.println(" 아이디 : ");
		String id = console.readLine();
		
		
		System.out.println(" 패스워드 : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		//String strPassword = new String(charPass, 0, charPass.length - 2); 
		
		System.out.println("  ");
		
		System.out.println(" id : " + id);
		System.out.println(" Password : " + strPassword);
		

	}

}
