package chap122;

import java.nio.channels.CompletionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallBackEx {
	private ExecutorService executorService;
	
	public CallBackEx() {
		executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
		);
	}
	
	private CompletionHandler<Integer,Void> callback = 
			new CompletionHandler<Integer, Void> () {
				@Override
				public void completed(Integer result, Void attachment) {
					System.out.println("completed() 실행  result : " + result);
				}
				@Override
				public void failed(Throwable exc, Void attachment) {
					System.out.println("failed() 실행  예외 exc : " + exc.toString());
				}
	};

	public void doWrok(final String x, final String y) {
		Runnable task = new Runnable() {

			@Override
			public void run() {
				try {
					int intX = Integer.parseInt(x);
					int intY = Integer.parseInt(y);
					int result = intX + intY;
					callback.completed(result, null);
				} catch (NumberFormatException e) {
					callback.failed(e, null);
					
				}
				
			}
			
		};
		
		executorService.submit(task);
		
	}
	public void finish() {
		executorService.shutdown();
	}
	
	public static void main(String[] args) {
		CallBackEx ex = new CallBackEx();
		ex.doWrok("3", "3");
		ex.doWrok("3", "삼");
		
		ex.finish();

	}

}
