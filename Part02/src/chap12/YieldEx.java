package chap12;

public class YieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		
		threadA.start();
		threadB.start();
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {	}
		threadA.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {	}
		threadA.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (Exception e) {	}
		threadA.stop = true;
		threadB.stop = true;
		
	}	

}
