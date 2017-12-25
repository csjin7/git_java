package chap12;

import java.awt.Toolkit;

public class BeepPrintEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		
		Thread thread = new Thread(new Runnable() 
		{
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 0; i < 5; i++) {
					toolkit.beep();
					try { Thread.sleep(500); } catch (Exception e) {}
				}
			}
		});
		
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("띵!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {	}
		}

		
	}

}
