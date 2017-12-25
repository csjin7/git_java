package chap12;

public class ThreadA extends Thread {
	public boolean stop = false;
	public boolean work = true;

//	public ThreadA() {
//		setName("ThreadA");
//	}
	
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			} else {
				Thread.yield();
			}
		}
		
		System.out.println("ThreadA 종료");
		
	}
}
