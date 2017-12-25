package chap141;

public class RunnableEx {
	public static void main(String[] args) {
		Runnable runnable = ()->{
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(i);
				}
			}
			
		});
		
		thread2.start();
		
	}

}
