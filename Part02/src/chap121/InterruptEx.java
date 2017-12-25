package chap121;

public class InterruptEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread = new PrintThread2();
		thread.start();
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {	}
		
		thread.interrupt();
		
	}

}
