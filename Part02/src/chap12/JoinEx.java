package chap12;

public class JoinEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (Exception e) {		}
		
		System.out.println("1 ~ 100의 총합 : " + sumThread.getSum());
		
	}

}
