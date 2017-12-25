package chap12;

public class ThreadNameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread mainThread = Thread.currentThread();
		
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		ThreadA threada = new ThreadA();
		System.out.println("작업 시작 스레드 이름 : " + threada.getName());
		
		threada.start();
		
		
		ThreadB threadb = new ThreadB();
		System.out.println("작업 시작 스레드 이름 : " + threadb.getName());
		
		threadb.start();
	
	}

}
