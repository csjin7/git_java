package chap121;

public class WorkObject {
	
	public synchronized void methodA() {
		System.out.println("ThreadA의  MethodA() 작업 실행 ");
		notify();
		try {wait();} catch (Exception e) {}
		
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의  MethodB() 작업 실행 ");
		notify();
		try {wait();} catch (Exception e) {}
	}
	
}
