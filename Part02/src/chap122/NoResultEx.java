package chap122;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool( 
				Runtime.getRuntime().availableProcessors()
				);
		
		System.out.println("작업 처리 요청");
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for (int i = 1; i < 11; i++) {
					sum += i;
				}
				System.out.println(" 처리결과 : " + sum);
			}
		};
		Future future = executorService.submit(runnable);
		
		try {
			future.get();
			System.out.println("작업 처리 완료");
		} catch (Exception e) {
			System.out.println("실행예외 발생 : " + e.getMessage());
		}
		
		
		executorService.shutdown();

	}

}
